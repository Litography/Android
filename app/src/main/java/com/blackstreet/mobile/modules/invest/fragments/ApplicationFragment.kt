package com.blackstreet.mobile.modules.invest.fragments

import android.content.Context
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import com.blackstreet.mobile.core.BaseFragment
import com.blackstreet.mobile.databinding.FragmentApplicationBinding
import com.blackstreet.mobile.modules.invest.viewmodels.ApplicationViewModel

class ApplicationFragment : BaseFragment() {

    private lateinit var binding: FragmentApplicationBinding

    private val viewModel: ApplicationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentApplicationBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
//        (requireActivity().applicationContext as AppApplication).appComponent.inject(this)
    }

    override fun setupView() {}

    override fun setupListeners() {}

    override fun setupObservers() {}

    companion object {
        private const val SOME_PARAMETER = "someParameter"

        fun newInstance(parcelable: Parcelable) = ApplicationFragment().apply {
            arguments = bundleOf(
                SOME_PARAMETER to parcelable
            )
        }
    }
}