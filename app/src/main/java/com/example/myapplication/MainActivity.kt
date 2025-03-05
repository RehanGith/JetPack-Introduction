package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Layout()
        }

    }

    @Composable
    fun Layout() {
        var context = LocalContext.current
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center) {
            Text(text = "Muhammad Rehan", modifier = Modifier
                .background(Color.Gray)
                .align(Alignment.TopStart)
                .fillMaxWidth(), fontSize = 20.sp )
            Text(text = "Muhammad Rehan", modifier = Modifier
                .background(Color.Gray)
                .align(Alignment.CenterStart), fontSize = 20.sp )
            Text(text = "Muhammad Rehan", modifier = Modifier
                .background(Color.Gray)
                .align(Alignment.BottomStart)
                .fillMaxWidth(), fontSize = 20.sp )
            Button(onClick = {
                Toast.makeText(context, "Button Click", Toast.LENGTH_SHORT).show()
            }
            , modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .background(Color.DarkGray))  {
                Text(text = "Click me")
            }
        }
    }
}



