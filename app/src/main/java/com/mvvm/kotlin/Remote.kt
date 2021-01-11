package com.mvvm.kotlin

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    fun plugRemote() {
        Log.e("DI", "Key added")
    }
}