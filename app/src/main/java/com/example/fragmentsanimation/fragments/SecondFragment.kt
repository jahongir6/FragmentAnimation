package com.example.fragmentsanimation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsanimation.R
import com.example.fragmentsanimation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    var name: String? = null
    var age: Int? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        name = arguments?.getString("keyName")
        age = arguments?.getInt("keyAge")

        binding.tvName.text = name.toString()
        binding.tvAge.text = age.toString()
        return binding.root
    }


}