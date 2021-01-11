package com.mvvm.kotlin.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mvvm.kotlin.App
import com.mvvm.kotlin.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as App).getCompoment().inject(this)


        car.drive()
        car2.drive()

    }
}
