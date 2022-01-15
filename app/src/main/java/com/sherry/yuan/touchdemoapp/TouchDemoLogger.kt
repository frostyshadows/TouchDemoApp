package com.sherry.yuan.touchdemoapp

import android.content.Context
import android.view.MotionEvent
import android.widget.Toast
import timber.log.Timber

object TouchDemoLogger {

    fun logTouch(context: Context, action: Int, viewName: String, function: String) {
        val actionName = when (action) {
            MotionEvent.ACTION_DOWN -> "ACTION_DOWN"
            MotionEvent.ACTION_CANCEL -> "ACTION_CANCEL"
            MotionEvent.ACTION_MOVE -> "ACTION_MOVE"
            MotionEvent.ACTION_OUTSIDE -> "ACTION_OUTSIDE"
            MotionEvent.ACTION_SCROLL -> "ACTION_SCROLL"
            MotionEvent.ACTION_BUTTON_PRESS -> "ACTION_BUTTON_PRESS"
            MotionEvent.ACTION_BUTTON_RELEASE -> "ACTION_BUTTON_RELEASE"
            MotionEvent.ACTION_UP -> "ACTION_UP"
            else -> "other"
        }
        val message = "TouchDemoLogger: $actionName event called in $viewName's $function"
        Timber.d(message)
    }
}
