package com.blackstreet.mobile.modules.login

import androidx.fragment.app.viewModels
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.blackstreet.mobile.core.BaseFragment
import com.blackstreet.mobile.databinding.FragmentLoginBinding

class Login : BaseFragment() {

    private lateinit var binding: FragmentLoginBinding

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun setupView() {}

    override fun setupListeners() {}

    override fun setupObservers() {}

    companion object {
        fun newInstance() = Login()
    }
}