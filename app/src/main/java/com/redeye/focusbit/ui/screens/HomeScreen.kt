package com.redeye.focusbit.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.redeye.focusbit.R
import com.redeye.focusbit.ui.theme.InterFamily
import com.redeye.focusbit.ui.theme.JetBrainsMonoFamily
import com.redeye.focusbit.ui.theme.ManropeFamily

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
   Box(
      modifier = modifier
         .fillMaxSize()
         .background(Color.Black)
   ) {
      // ===== PADDING FROM TOP =====
      Column(
         modifier = Modifier
            .fillMaxSize()
            .padding(
               top = 40.dp,
               start = 28.dp,
               end = 28.dp
            ),
         horizontalAlignment = Alignment.CenterHorizontally
      ) {
         // ===== TOP BAR =====
         Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
         ) {
            // ===== LOGO & TITLE =====
            Row(verticalAlignment = Alignment.CenterVertically) {
               Image(
                  painter = painterResource(id = R.drawable.logo),
                  contentDescription = "FocusBit Logo",
                  modifier = Modifier
                     .size(36.dp)
                     .clip(CircleShape)
               )
               Text(
                  text = "FocusBit",
                  color = Color.White,
                  fontSize = 20.sp,
                  fontWeight = FontWeight.Bold,
                  fontFamily = InterFamily,
                  modifier = Modifier.padding(start = 10.dp)
               )
            }

            // ===== SPACE BTWN LOGO & STREAK =====
            Spacer(modifier = Modifier.width(110.dp))

            // ===== STREAK PILL =====
            Row(
               modifier = Modifier
                  .clip(RoundedCornerShape(percent = 50))
                  .background(Color(0xFF16332B))
                  .border(
                     BorderStroke(0.8.dp, Color(0xFF2ECC71)),
                     shape = RoundedCornerShape(percent = 50)
                  )
                  .padding(horizontal = 12.dp, vertical = 4.dp),
               verticalAlignment = Alignment.CenterVertically
            ) {
               Icon(
                  imageVector = Icons.Default.Bolt,
                  contentDescription = "Streak",
                  tint = Color(0xFF00FFBF)
               )
               Text(
                  text = "6",
                  color = Color.White,
                  fontSize = 14.sp,
                  fontWeight = FontWeight.Bold,
                  modifier = Modifier.padding(start = 1.dp)
               )
            }

            Spacer(modifier = Modifier.weight(1f))

            // ===== SETTINGS ICON =====
            Icon(
               imageVector = Icons.Default.Settings,
               contentDescription = "Settings",
               tint = Color.White,
               modifier = Modifier.size(30.dp)
            )
         }

         // ===== SPACE BTWN TOP BAR & CONTENT =====
         Spacer(modifier = Modifier.height(100.dp))

         // ===== READY TO FOCUS =====
         Text(
            text = "Ready To Focus?",
            color = Color.White,
            fontSize = 16.sp,
            fontFamily = ManropeFamily
         )

         Spacer(modifier = Modifier.height(30.dp))

         // ===== STOPWATCH =====
         Text(
            text = "00:00:00",
            color = Color.White,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = JetBrainsMonoFamily
         )

         Spacer(modifier = Modifier.height(30.dp))

         // ===== START BUTTON =====
         Button(
            onClick = { /* TODO: implement start logic later */ },
            modifier = Modifier
               .fillMaxWidth(0.85f)
               .height(56.dp),
            shape = RoundedCornerShape(percent = 50),
            colors = ButtonDefaults.buttonColors(
               containerColor = Color(0xFF00FFBF)
            )
         ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
               // === START ICON
               Icon(
                  imageVector = Icons.Default.PlayArrow,
                  contentDescription = "Start",
                  tint = Color.White,
                  modifier = Modifier.size(30.dp)
               )
               // === START TEXT
               Text(
                  text = "START",
                  color = Color.White,
                  fontSize = 20.sp,
                  fontWeight = FontWeight.Bold,
                  fontFamily = InterFamily,
                  modifier = Modifier.padding(start = 5.dp)
               )
            }
         }
      }
   }
}