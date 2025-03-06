package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.safeGestures
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
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


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Layout() {
        MyApplicationTheme {

            Scaffold(
                contentWindowInsets = WindowInsets.safeGestures,
                topBar = {
                    TopAppBar(title = { Text(text = "Hello") },
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = Color.LightGray
                        )
                        )
                },
                bottomBar = {
                    BottomAppBar {

                    }
                }
            ) { contentPadding ->
                LazyVerticalGrid(columns = GridCells.Adaptive(100.dp),
                    contentPadding = contentPadding,
                    content =
                    {
                        items(100) {
                            Box(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .background(Color.Green)
                                    .clip(
                                        RoundedCornerShape(10.dp)
                                    )
                                    .aspectRatio(1f), contentAlignment = Alignment.Center
                            ) {
                                Text(text = "Hello $it", fontSize = 20.sp)
                            }
                        }

                    }
                )

            }
        }
    }
}




