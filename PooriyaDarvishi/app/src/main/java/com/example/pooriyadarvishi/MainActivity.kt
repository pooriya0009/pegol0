package com.example.pooriyadarvishi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pooriyadarvishi.ui.theme.PooriyaDarvishiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PooriyaDarvishiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyNavigation()
                }
            }
        }
    }
}
@Composable
fun MyNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.Route){
        composable(Home.Route){
            HomeScreen(navController)
        }
        composable(Second.Route){
            SecondScreen(navController)
        }
    }
}