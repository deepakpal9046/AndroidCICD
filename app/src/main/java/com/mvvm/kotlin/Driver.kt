package com.mvvm.kotlin

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Driver @Inject constructor() {

    fun getDriverName() {
        Log.e(
            "DI",
            "Driver name is ABC"
        )
    }
}