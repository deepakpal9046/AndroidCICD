package com.mvvm.kotlin

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor() {

    fun addWheel() {
        Log.e("DI", "Wheel is added")
    }
}