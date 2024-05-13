package com.blackstreet.mobile.core

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blackstreet.mobile.di.AppApplication
import com.blackstreet.mobile.modules.invest.model.Walker
import javax.inject.Inject

abstract class BaseActivity : AppCompatActivity() {

    @Inject lateinit var walker: Walker
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (applicationContext as AppApplication).appComponent.inject(this)
    }

    // TODO Permissions Android Implementation
}