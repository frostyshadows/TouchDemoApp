package com.sherry.yuan.touchdemoapp

import android.view.MotionEvent
import android.view.ScaleGestureDetector

class DemoScaleGestureListener(
    private val viewName: String
) : ScaleGestureDetector.SimpleOnScaleGestureListener() {

    override fun onScale(detector: ScaleGestureDetector): Boolean {
        TouchDemoLogger.logTouch(
            action = MotionEvent.ACTION_UP,
            viewName = viewName,
            function = "ScaleGestureListener.onScale",
        )
        return super.onScale(detector)
    }
}