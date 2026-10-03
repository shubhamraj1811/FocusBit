package com.redeye.focusbit.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.redeye.focusbit.ui.theme.Bg
import com.redeye.focusbit.ui.theme.TextWhite

@Composable
fun HistoryScreen() {
   Box(
      modifier = Modifier
         .fillMaxSize()
         .background(Bg),
      contentAlignment = Alignment.Center
   ) {
      Text(
         text = "History Screen",
         color = TextWhite
      )
   }
}