package com.umc.floclone.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.umc.floclone.databinding.FragmentLockerBinding
import com.umc.floclone.databinding.FragmentLookBinding

class LookFragment: Fragment() {

    private lateinit var binding : FragmentLookBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentLookBinding.inflate(layoutInflater)
        return binding.root
    }

}