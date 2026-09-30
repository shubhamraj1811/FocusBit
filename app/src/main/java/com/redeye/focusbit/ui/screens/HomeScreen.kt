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
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.BarChart

// ===== DATA CLASS FOR CATEGORY SUMMARY =====
data class CategorySummary(
   val name: String,
   val duration: String,
   val color: Color
)

// ===== NAV ITEM =====
@Composable
fun NavItem(icon: androidx.compose.ui.graphics.vector.ImageVector, label: String, isSelected: Boolean) {
   val color = if (isSelected) Color(0xFF00FFBF) else Color.Gray
   Column(horizontalAlignment = Alignment.CenterHorizontally) {
      Icon(
         imageVector = icon,
         contentDescription = label,
         tint = color
      )
      Text(
         text = label,
         color = color,
         fontSize = 12.sp,
         fontFamily = ManropeFamily,
         modifier = Modifier.padding(top = 4.dp)
      )
   }
}

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

            // ===== SPACE BETWEEN LOGO & STREAK =====
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

         // ===== SPACE BETWEEN TOP BAR & CONTENT =====
         Spacer(modifier = Modifier.height(100.dp))

         // ===== READY TO FOCUS =====
         Text(
            text = "Ready To Focus?",
            color = Color.Gray,
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
               .height(60.dp),
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

         // ===== CATEGORY SELECTOR

         Spacer(modifier = Modifier.height(28.dp))

         Row(
            modifier = Modifier
               .fillMaxWidth(0.90f)
               .clip(RoundedCornerShape(percent = 50))
               .border(
                  BorderStroke(1.dp, Color.DarkGray),
                  shape = RoundedCornerShape(percent = 50)
               )
               .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
         ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
               Spacer(modifier = Modifier.width(10.dp))
               // === MENU ICON
               Icon(
                  imageVector = Icons.Default.GridView,
                  contentDescription = "Category",
                  tint = Color.Gray,
                  modifier = Modifier
                     .size(20.dp)
               )
               Text(
                  text = "Focus on:",
                  color = Color.Gray,
                  fontSize = 15.sp,
                  fontFamily = ManropeFamily,
                  modifier = Modifier.padding(start = 10.dp)
               )
               Text(
                  text = "Android",
                  color = Color.White,
                  fontSize = 15.sp,
                  fontWeight = FontWeight.SemiBold,
                  fontFamily = InterFamily,
                  modifier = Modifier.padding(start = 16.dp)
               )
            }
            Icon(
               imageVector = Icons.Default.KeyboardArrowDown,
               contentDescription = "Select category",
               tint = Color.Gray
            )
         }

         // ===== SUMMARY CARD =====
         Spacer(modifier = Modifier.height(24.dp))

         Column(
            modifier = Modifier
               .fillMaxWidth()
               .clip(RoundedCornerShape(16.dp))
               .background(Color(0xFF121212))
               .padding(20.dp)
         ) {
            Text(
               text = "Today",
               color = Color.Gray,
               fontSize = 14.sp,
               fontFamily = ManropeFamily
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
               text = "6h 30m",
               color = Color.White,
               fontSize = 28.sp,
               fontWeight = FontWeight.Bold,
               fontFamily = InterFamily
            )

            Spacer(modifier = Modifier.height(14.dp))

            val categoryBreakdown = listOf(
               CategorySummary("Android", "1h 30m", Color(0xFF2ECC71)),
               CategorySummary("DSA", "3h 00m", Color(0xFFE040FB)),
               CategorySummary("GATE", "2h 00m", Color(0xFF448AFF))
            )

            categoryBreakdown.forEach { category ->
               Row(
                  modifier = Modifier
                     .fillMaxWidth()
                     .padding(vertical = 6.dp),
                  horizontalArrangement = Arrangement.SpaceBetween,
                  verticalAlignment = Alignment.CenterVertically
               ) {
                  Row(verticalAlignment = Alignment.CenterVertically) {
                     Box(
                        modifier = Modifier
                           .size(8.dp)
                           .clip(CircleShape)
                           .background(category.color)
                     )
                     Text(
                        text = category.name,
                        color = Color.White,
                        fontSize = 14.sp,
                        fontFamily = ManropeFamily,
                        modifier = Modifier.padding(start = 8.dp)
                     )
                  }

                  Text(
                     text = category.duration,
                     color = Color.Gray,
                     fontSize = 14.sp,
                     fontFamily = InterFamily
                  )
               }
            }
         }
         //
      }
      // ===== NAV BAR =====
      Row(
         modifier = Modifier
            .align(Alignment.BottomCenter)
            .fillMaxWidth()
            .padding(horizontal = 0.dp, vertical = 16.dp),
         horizontalArrangement = Arrangement.SpaceEvenly
      ) {
         NavItem(icon = Icons.Default.Home, label = "Home", isSelected = true)
         NavItem(icon = Icons.Default.History, label = "History", isSelected = false)
         NavItem(icon = Icons.Default.BarChart, label = "Stats", isSelected = false)
      }
   }
}