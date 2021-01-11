package com.mvvm.kotlin

import android.app.Application
import com.mvvm.kotlin.di.CarComponent
import com.mvvm.kotlin.di.DaggerCarComponent

class App : Application() {

    private lateinit var component: CarComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerCarComponent.builder().getCapacity(100).getHoursePower(200)
            .build()
    }

    fun getCompoment() = component
}