package com.redeye.focusbit.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.redeye.focusbit.ui.screens.HistoryScreen
import com.redeye.focusbit.ui.screens.HomeScreen
import com.redeye.focusbit.ui.screens.StatsScreen
import com.redeye.focusbit.ui.screens.SettingsScreen


@Composable
fun FocusBitNavHost() {
   val navController = rememberNavController()

   NavHost(
      navController = navController,
      startDestination = "home"
   ) {
      composable("home") {
         HomeScreen(
            onNavigateToHistory = { navController.navigate("history") },
            onNavigateToStats = { navController.navigate("stats") },
            onNavigateToSettings = { navController.navigate("settings") }
         )
      }
      composable("history") {
         HistoryScreen()
      }
      composable("stats") {
         StatsScreen()
      }

//      // ------------ Remove
      composable("settings") {
         SettingsScreen(
            onNavigateBack = { navController.popBackStack() }
         )
      }
      // ------------ Remove
   }
}