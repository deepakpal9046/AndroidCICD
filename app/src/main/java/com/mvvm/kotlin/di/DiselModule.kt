package com.mvvm.kotlin.di

import com.mvvm.kotlin.DiselEngine
import com.mvvm.kotlin.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DiselModule {

    @Binds
    abstract fun bindDisel(diselEngine: DiselEngine): Engine

}