package com.example.absensi.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.absensi.R
import com.example.absensi.view.attendance.AttendanceFragment
import com.example.absensi.databinding.ActivityMainBinding
import com.example.absensi.view.history.HistoryFragment
import com.example.absensi.view.person.PersonFragment

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
                    return@setOnItemSelectedListener true
                }
                R.id.action_attendance -> {
                    openFragment(AttendanceFragment())
                    return@setOnItemSelectedListener true
                }
                R.id.action_profile -> {
                    openFragment(PersonFragment())
                    return@setOnItemSelectedListener true
                }

            }
        return@setOnItemSelectedListener false
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