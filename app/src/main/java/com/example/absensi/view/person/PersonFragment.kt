package com.example.absensi.view.person

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.absensi.R
import com.example.absensi.databinding.FragmentPersonBinding
import com.example.absensi.view.changepass.ChangePasswordActivity
import com.example.absensi.view.login.LoginActivity
import com.example.absensi.view.main.MainActivity
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast


class PersonFragment : Fragment() {
    private var binding: FragmentPersonBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPersonBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()

    }

    private fun onClick() {
        binding?.btnProfileChangePassword?.setOnClickListener {
            context?.startActivity<ChangePasswordActivity>()
        }
        binding?.btnProfileChangeLanguage?.setOnClickListener {
            context?.toast("Change Language")
        }
        binding?.btnProfileLogout?.setOnClickListener {
            context?.startActivity<LoginActivity>()
            (context as MainActivity).finishAffinity()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}