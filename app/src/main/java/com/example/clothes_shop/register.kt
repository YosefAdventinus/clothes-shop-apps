package com.example.clothes_shop

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.clothes_shop.databinding.FragmentRegisterBinding

class register : Fragment(R.layout.fragment_register) {

    private lateinit var binding: FragmentRegisterBinding
    val User_nama = "User"
    val user_email = "yosefadventinus20@gmail.com"
    val user_sandi = "12345678"



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRegisterBinding.bind(view)

        binding.btnRegis.setOnClickListener {
            val edNama = binding.edNama.text.toString()
            val edEmai = binding.edEmail.text.toString()
            val edPass = binding.edKatasandi.text.toString()
            if (edNama.equals("") && edEmai.equals("") && edPass.equals("")){
                Toast.makeText(context,"Inputan ada yang masih kosong!",Toast.LENGTH_SHORT)
                    .show()
            }
            else if (!edNama.equals(User_nama) && !edEmai.equals(user_email) && !edPass.equals(user_sandi)){
                Toast.makeText(context,"Inputan yang anda masukkan sudah dipakai",Toast.LENGTH_SHORT)
                    .show()
            }
            else{
                Toast.makeText(context,"Berhasil membuat akun",Toast.LENGTH_SHORT)
                    .show()
                findNavController().navigate(R.id.action_register2_to_dashboard)
            }
        }

        binding.btnKembali.setOnClickListener {
            findNavController().navigate(R.id.action_register2_to_open)
        }


    }
}