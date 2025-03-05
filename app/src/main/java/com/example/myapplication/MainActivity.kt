package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

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
//        Column(modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Black)
//            .verticalScroll(
//                rememberScrollState()
//            ), verticalArrangement = Arrangement.SpaceAround,
//            horizontalAlignment = Alignment.CenterHorizontally) {
//            for(i in 1..5) {
//                Text(
//                    text = "Hello Rehan!",
//                    modifier = Modifier
//                        .fillMaxWidth(1f)
//                        .background(Color.Gray),
//                    color = Color.Cyan,
//                    fontFamily = FontFamily.SansSerif,
//                    fontSize = 30.sp,
//                    textAlign = TextAlign.Center
//                )
//            }
        LazyColumn(content = {
            item {
                for(i in 1..5) {
                    Text(text = "Hello From Rehan!", modifier = Modifier
                        .background(Color.Cyan)
                        .fillMaxWidth(), fontSize = 20.sp )
                }
            }
        }
        )
    }
}



