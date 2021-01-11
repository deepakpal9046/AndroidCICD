package com.mvvm.kotlin

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    val engine: Engine, val wheel: Wheel,
    val musicSystem: MusicSystem,
    val driver: Driver
) {
    fun drive() {
        wheel.addWheel()
        engine.startEngine()
        Log.e("DI", "car is driving $driver and instance $this")
        musicSystem.startMusicPlayer()
    }

    @Inject
    fun connectRemote(remote: Remote) {
        remote.plugRemote()
    }
}