package com.example.fragmentsanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentsanimation.databinding.ActivityMainBinding
import com.example.fragmentsanimation.fragments.FirstFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.my_container, FirstFragment())
            .commit()
    }
}