package com.example.stackedPrs.ui.firstScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.stackedPrs.R

@Composable
fun FirstScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .clickable(onClick = { }),
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "Launcher Background"
        )
    }
}