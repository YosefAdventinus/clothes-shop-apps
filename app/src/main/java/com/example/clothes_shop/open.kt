package com.example.clothes_shop

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.clothes_shop.databinding.FragmentOpenBinding

class open : Fragment(R.layout.fragment_open) {

    private lateinit var binding: FragmentOpenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOpenBinding.bind(view)

        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_open_to_login)
        }

        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_open_to_register2)
        }
    }
}