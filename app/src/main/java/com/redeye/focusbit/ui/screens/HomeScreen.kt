package com.redeye.focusbit.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.redeye.focusbit.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
   // ===== Background =====
   Box(
      modifier = modifier
         .fillMaxSize()
         .background(Color.Black)
   ) {
      // ===== Padding =====
      Row(
         modifier = Modifier
            .align(Alignment.TopStart)
            .fillMaxWidth()
            .padding(24.dp),
         horizontalArrangement = Arrangement.Start,
         verticalAlignment = Alignment.CenterVertically
      ) {
         // ===== Title + Logo =====
         Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
               painter = painterResource(id = R.drawable.logo),
               contentDescription = "FocusBit Logo",
               modifier = Modifier
                  .size(32.dp)
                  .clip(CircleShape)
            )
            Text(
               text = "FocusBit",
               color = Color.White,
               fontSize = 20.sp,
               fontWeight = FontWeight.Bold,
               modifier = Modifier.padding(start = 10.dp),

            )
         }

         Spacer(modifier = Modifier.width(120.dp))

         // ===== Streak Pill =====
         Row(
            modifier = Modifier
               .clip(RoundedCornerShape(percent = 50))
               .background(Color(0xFF16332B))
               .border(
                  BorderStroke(1.dp, Color(0xFF2ECC71)),
                  shape = RoundedCornerShape(percent = 50)
               )
               .padding(horizontal =12.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
         ) {
            Icon(
               imageVector = Icons.Default.Bolt,
               contentDescription = "Streak",
               tint = Color(0xFF2ECC71)
            )
            Text(
               text = "6",
               color = Color.White,
               fontSize = 14.sp,
               fontWeight = FontWeight.Bold,
               modifier = Modifier.padding(start = 4.dp)
            )
         }

         Spacer(modifier = Modifier.width(30.dp))

         // ===== Settings Icon =====
         Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = "Settings",
            tint = Color.White,
            modifier = Modifier.size(28.dp)
         )
      }
   }
}