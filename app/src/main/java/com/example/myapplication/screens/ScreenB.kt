package com.example.myapplication.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.myapplication.model.Person


@Composable
fun ScreenB(
    person: Person
) {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center ) {
        Text(text = person.toString(), modifier = Modifier.align(Alignment.Center))
    }

}