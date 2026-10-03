package com.redeye.focusbit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.redeye.focusbit.ui.screens.HomeScreen
import com.redeye.focusbit.ui.theme.FocusBitTheme
import com.redeye.focusbit.ui.navigation.FocusBitNavHost

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      enableEdgeToEdge()
      setContent {
         FocusBitTheme {
            //
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
               FocusBitNavHost()
            }
         }
      }
   }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
   Text(
      text = "FocusBit $name!",
      modifier = modifier
   )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   FocusBitTheme {
      Greeting("Android")
   }
}