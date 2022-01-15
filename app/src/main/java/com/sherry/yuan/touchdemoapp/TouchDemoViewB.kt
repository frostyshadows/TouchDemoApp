package com.sherry.yuan.touchdemoapp

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class TouchDemoViewB(
    context: Context,
    attrs: AttributeSet? = null
) : View(context, attrs) {

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            context = context,
            action = ev.action,
            viewName = VIEW_NAME,
            function = "dispatchTouchEvent",
        )
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            context = context,
            action = event.action,
            viewName = VIEW_NAME,
            function = "onTouchEvent",
        )
        return true
    }

    companion object {
        private const val VIEW_NAME = "View B"
    }
}