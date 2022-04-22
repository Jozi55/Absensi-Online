package com.example.absensi.view.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.absensi.R
import com.example.absensi.databinding.ActivityLoginBinding
import com.example.absensi.databinding.ActivityMainBinding
import com.example.absensi.view.forgotpass.ForgotPasswordActivity
import com.example.absensi.view.main.MainActivity
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()
    }

    private fun onClick(){
        binding.btLogin.setOnClickListener {
            startActivity<MainActivity>()
        }

        binding.btForgotPassword.setOnClickListener {
            startActivity<ForgotPasswordActivity>()
        }
    }
}