package com.sherry.yuan.touchdemoapp

import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import androidx.appcompat.app.AppCompatActivity
import com.sherry.yuan.touchdemoapp.databinding.ActivityTouchDemoBinding

class TouchDemoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTouchDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTouchDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            action = ev.action,
            viewName = VIEW_NAME,
            function = "dispatchTouchEvent",
        )
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        TouchDemoLogger.logTouch(
            action = event.action,
            viewName = VIEW_NAME,
            function = "onTouchEvent",
        )
        return super.onTouchEvent(event)
    }

    private fun setupListeners() {
        // OnTouchListener with an implementation
        binding.viewA.setOnTouchListener(DemoOnTouchListener(TouchDemoViewA.VIEW_NAME))
        // OnTouchListener with a lambda
        binding.viewA.setOnTouchListener { _, event ->
            TouchDemoLogger.logTouch(
                action = event.action,
                viewName = TouchDemoViewA.VIEW_NAME,
                function = "OnTouchListener.onTouch",
            )
            super.onTouchEvent(event)
        }

        // OnClickListener
        binding.viewA.setOnClickListener {
            TouchDemoLogger.logTouch(
                action = MotionEvent.ACTION_UP,
                viewName = TouchDemoViewA.VIEW_NAME,
                function = "OnClickListener.onClick",
            )
            true
        }

        // GestureDetector
        val gestureDetector =
            GestureDetector(this, DemoGestureDetectorListener(TouchDemoViewB.VIEW_NAME))

        // ScaleDetector
        val scaleGestureDetector =
            ScaleGestureDetector(this, DemoScaleGestureListener(TouchDemoViewB.VIEW_NAME))

        binding.viewB.setOnTouchListener { _, event ->
            gestureDetector.onTouchEvent(event)
            scaleGestureDetector.onTouchEvent(event)
        }
    }

    companion object {
        private const val VIEW_NAME = "TouchDemoActivity"
    }
}
