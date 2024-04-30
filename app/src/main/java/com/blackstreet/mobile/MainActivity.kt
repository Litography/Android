package com.blackstreet.mobile

import android.os.Bundle
import com.blackstreet.mobile.core.BaseActivity
import com.blackstreet.mobile.databinding.FragmentHomeBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}