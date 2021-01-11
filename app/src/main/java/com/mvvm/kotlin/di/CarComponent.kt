package com.mvvm.kotlin.di

import com.mvvm.kotlin.Car
import com.mvvm.kotlin.myapplication.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(MusicModule::class, DiselModule::class))
interface CarComponent {


    fun inject(activity: MainActivity)
    fun getCar(): Car

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun getHoursePower(@Named("hoursePower") data: Int): Builder

        @BindsInstance
        fun getCapacity(@Named("capacity")data: Int): Builder

        fun build(): CarComponent
    }
}