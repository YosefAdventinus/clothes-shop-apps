package com.example.clothes_shop

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.clothes_shop.databinding.FragmentDashboardBinding

class dashboard : Fragment(R.layout.fragment_dashboard) {

    private lateinit var binding: FragmentDashboardBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDashboardBinding.bind(view)
    }
}