package com.sherry.yuan.touchdemoapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sherry.yuan.touchdemoapp.databinding.ActivityLauncherBinding

class LauncherActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLauncherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLauncherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewDemoButton.setOnClickListener {
            startActivity(Intent(this, TouchDemoActivity::class.java))
        }

        binding.composeDemoButton.setOnClickListener {
            startActivity(Intent(this, TouchDemoComposeActivity::class.java))
        }
    }
}