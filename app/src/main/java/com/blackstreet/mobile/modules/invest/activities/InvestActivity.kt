package com.blackstreet.mobile.modules.invest.activities

import android.os.Bundle
import com.blackstreet.mobile.core.BaseActivity
import com.blackstreet.mobile.databinding.ActivityInvestBinding

class InvestActivity : BaseActivity() {

    private lateinit var binding: ActivityInvestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInvestBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}