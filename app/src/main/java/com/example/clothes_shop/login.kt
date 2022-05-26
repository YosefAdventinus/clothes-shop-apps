package com.example.clothes_shop

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.clothes_shop.databinding.FragmentLoginBinding

class login : Fragment(R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding
    val User_login = "User"
    val user_password = "12345678"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)

        binding.btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_open)
        }

        binding.btnMasuk.setOnClickListener {
            val edLogin = binding.edUser.text.toString()
            val edPassword = binding.edPass.text.toString()
            if (edLogin.equals("") && edPassword.equals("")){
                Toast.makeText(context,"Username atau Password anda tidak boleh kosong",Toast.LENGTH_SHORT)
                    .show()
            }
            else if (!edLogin.equals(User_login) && !edPassword.equals(user_password)){
                Toast.makeText(context,"Username atau Password yang anda masukkan salah!",Toast.LENGTH_SHORT)
                    .show()
            }
            else{
                Toast.makeText(context,"Berhasil Login",Toast.LENGTH_SHORT)
                    .show()
                findNavController().navigate(R.id.action_login_to_dashboard)
            }

        }
    }

}