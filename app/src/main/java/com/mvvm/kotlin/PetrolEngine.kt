package com.mvvm.kotlin

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(var hoursePower: Int) : Engine {
    override fun startEngine() {
        Log.e("DI", "Petrol Engine started and hourse power is $hoursePower")
    }
}