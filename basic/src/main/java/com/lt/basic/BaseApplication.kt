package com.lt.basic

import android.app.Application

class BaseApplication :Application() {
    companion object{
        const val is_application = BuildConfig.isApplication
    }

    override fun onCreate() {
        super.onCreate()
    }
}