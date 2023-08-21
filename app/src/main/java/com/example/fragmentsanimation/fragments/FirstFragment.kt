package com.example.fragmentsanimation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsanimation.R
import com.example.fragmentsanimation.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        binding.btnSave.setOnClickListener {
            val secondFragment = SecondFragment()
            val bundle = Bundle()
            bundle.putString("keyName", binding.edtName.text.toString())
            bundle.putInt("keyAge", binding.edtAge.text.toString().toInt())
            secondFragment.arguments = bundle
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
                    R.anim.enter_from_right,
                    R.anim.exit_to_left,
                    R.anim.enter_from_left,
                    R.anim.exit_to_left
                )
                .addToBackStack(secondFragment.toString())
                .replace(R.id.my_container, secondFragment)
                .commit()
        }
        return binding.root
    }

}