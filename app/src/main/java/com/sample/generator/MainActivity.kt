package com.sample.generator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sample.alphanumericgenerator.randomGenerator
import com.sample.alphanumericgenerator.randomSpecialGenerator
import com.sample.generator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.generate.setOnClickListener {
            binding.textView.text = randomGenerator(10)
        }
        binding.generateSpecial.setOnClickListener {
            binding.textView.text = randomSpecialGenerator(8)
        }
    }
}