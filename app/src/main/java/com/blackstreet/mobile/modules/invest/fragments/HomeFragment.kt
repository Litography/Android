package com.blackstreet.mobile.modules.invest.fragments

import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.blackstreet.mobile.R
import com.blackstreet.mobile.core.BaseFragment
import com.blackstreet.mobile.databinding.FragmentHomeInvestBinding
import com.blackstreet.mobile.modules.invest.viewmodels.HomeViewModel

class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeInvestBinding

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeInvestBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun setupView() {}

    override fun setupListeners() {
        binding.buttonRedirect.setOnClickListener {
            findNavController().navigate(R.id.applicationFragment)
        }
    }

    override fun setupObservers() {}

    companion object {
        private const val SOME_PARAMETER = "someParameter"

        fun newInstance(parcelable: Parcelable) = HomeFragment().apply {
            arguments = bundleOf(
                SOME_PARAMETER to parcelable
            )
        }
    }
}