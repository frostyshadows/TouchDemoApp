package com.sherry.yuan.touchdemoapp

import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sherry.yuan.touchdemoapp.databinding.ActivityTouchDemoBinding

class TouchDemoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTouchDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTouchDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            context = this,
            action = ev.action,
            viewName = VIEW_NAME,
            function = "dispatchTouchEvent",
        )
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            context = this,
            action = event.action,
            viewName = VIEW_NAME,
            function = "onTouchEvent",
        )
        return super.onTouchEvent(event)
    }

    companion object {
        private const val VIEW_NAME = "TouchDemoActivity"
    }
}
