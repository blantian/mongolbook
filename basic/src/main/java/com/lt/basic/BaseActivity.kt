package com.lt.basic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity :AppCompatActivity() {

    companion object{
        const val is_application = BuildConfig.isApplication
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}