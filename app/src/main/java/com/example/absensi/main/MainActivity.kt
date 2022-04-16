package com.example.absensi.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.absensi.R
import com.example.absensi.attendance.AttendanceFragment
import com.example.absensi.databinding.ActivityMainBinding
import com.example.absensi.history.HistoryFragment
import com.example.absensi.person.PersonFragment

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun  init(){
        binding.btmNavigationMain.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.action_history -> {
                    openFragment(HistoryFragment())
                    true
                }
                R.id.action_attendance -> {
                    openFragment(AttendanceFragment())
                    true
                }
                R.id.action_profile -> {
                    openFragment(PersonFragment())
                    true
                }

            }
        false
        }
        openHomeFragment()
    }

    private fun openHomeFragment() {
        binding.btmNavigationMain.selectedItemId = R.id.action_attendance
    }


    private fun openFragment(fragment: Fragment) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_main, fragment)
                .addToBackStack(null)
                .commit()
    }
}