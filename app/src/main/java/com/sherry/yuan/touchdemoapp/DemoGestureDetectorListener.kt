package com.sherry.yuan.touchdemoapp

import android.view.GestureDetector
import android.view.MotionEvent

class DemoGestureDetectorListener(private val viewName: String) : GestureDetector.SimpleOnGestureListener() {
    override fun onDoubleTap(e: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            action = e.action,
            viewName = viewName,
            function = "GestureDetectorListener.onDoubleTap",
        )
        return super.onDoubleTap(e)
    }

    override fun onFling(
        e1: MotionEvent,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        TouchDemoLogger.logTouch(
            action = e1.action,
            viewName = viewName,
            function = "GestureDetectorListener.onFling",
        )
        return super.onFling(e1, e2, velocityX, velocityY)
    }
}