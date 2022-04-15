package com.sherry.yuan.touchdemoapp

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout

class TouchDemoViewA(
    context: Context,
    attrs: AttributeSet? = null
) : View(context, attrs) {

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            action = ev.action,
            viewName = VIEW_NAME,
            function =  "dispatchTouchEvent",
        )
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            action = event.action,
            viewName = VIEW_NAME,
            function =  "onTouchEvent",
        )
        return super.onTouchEvent(event)
    }

    companion object {
        const val VIEW_NAME = "View A"
    }
}
