package com.mvvm.kotlin.di

import com.mvvm.kotlin.MusicSystem
import dagger.Module
import dagger.Provides

@Module
class MusicModule {

    @Provides
    fun provideMusic(): MusicSystem = MusicSystem()

}