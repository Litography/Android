package com.blackstreet.mobile.di

import com.blackstreet.mobile.core.BaseActivity
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(activity: BaseActivity)
}