package com.sherry.yuan.touchdemoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sherry.yuan.touchdemoapp.ui.theme.*

class TouchDemoComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoContent()
        }
    }
}

@Composable
fun DemoContent() {
    Surface(
        modifier = Modifier.wrapContentSize(),
        color = LightestBlue
    ) {
        Box(
            modifier = Modifier
                .wrapContentSize()
                .padding(16.dp)
                .background(color = LightBlue)
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(1000.dp)
                    .align(Alignment.TopCenter)
                    .background(color = MedBlue)
            )
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .align(Alignment.Center)
                    .background(color = Mauve)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DemoContent()
}