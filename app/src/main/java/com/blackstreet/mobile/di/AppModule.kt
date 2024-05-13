package com.blackstreet.mobile.di

import com.blackstreet.mobile.modules.invest.model.Walker
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideWalker(): Walker = Walker()
}