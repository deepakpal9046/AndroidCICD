package com.mvvm.kotlin

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class DiselEngine @Inject constructor(
    @Named("hoursePower") val horsePower: Int,
    @Named("capacity") val capacity: Int
) : Engine {
    override fun startEngine() {
        Log.e(
            "DI",
            "DiselEngine started and hourse power is $horsePower \n and capacity $capacity "
        )
    }
}