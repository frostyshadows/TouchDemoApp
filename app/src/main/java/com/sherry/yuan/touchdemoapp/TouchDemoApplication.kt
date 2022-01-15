package com.sherry.yuan.touchdemoapp

import android.app.Application
import timber.log.Timber

class TouchDemoApplication : Application() {

    override fun onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
