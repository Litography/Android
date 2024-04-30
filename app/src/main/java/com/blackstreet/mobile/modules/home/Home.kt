package com.blackstreet.mobile.modules.home

import androidx.fragment.app.viewModels
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.blackstreet.mobile.core.BaseFragment
import com.blackstreet.mobile.databinding.FragmentHomeBinding

class Home : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun setupView() {}

    override fun setupListeners() {}

    override fun setupObservers() {}

    companion object {
        fun newInstance() = Home()
    }
}