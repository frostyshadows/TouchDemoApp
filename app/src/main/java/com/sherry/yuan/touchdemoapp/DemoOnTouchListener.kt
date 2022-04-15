package com.sherry.yuan.touchdemoapp

import android.view.MotionEvent
import android.view.View

class DemoOnTouchListener(private val viewName: String) : View.OnTouchListener {
    override fun onTouch(v: View, event: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            action = event.action,
            viewName = viewName,
            function =  "OnTouchListener.onTouch",
        )
        return false
    }
}