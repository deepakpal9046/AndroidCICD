package com.mvvm.kotlin.di

import com.mvvm.kotlin.Engine
import com.mvvm.kotlin.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule constructor(hoursePower: Int) { //constructor(var hoursePower: Int)  also can define the parameter

    private var power: Int = hoursePower

    init {
        power = hoursePower
    }

    @Provides
    fun providePower() = power

    @Provides
    fun providePetrolEngine(engineModule: PetrolEngine): Engine = engineModule
}