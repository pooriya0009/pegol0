package com.example.pooriyadarvishi

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize() ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = username,
            onValueChange = {username=it},
            label = { Text(text = "Username") },
        )
        TextField(
            value = password,
            onValueChange = {password=it},
            label = { Text(text = "Password") },
        )
        val context= LocalContext.current
        Button(
            onClick = {
                if (username=="ali" && password=="111"){
                    Toast.makeText(context,"CORRECT", Toast.LENGTH_SHORT).show()
                    navController.navigate(Second.Route)
                }else{
                    Toast.makeText(context,"WRONG!", Toast.LENGTH_SHORT).show()
                }

            },
            colors = ButtonDefaults.buttonColors(
                Color(0xFF1100FF)
            )
        ) {
            Text(
                text = "ورود",
                color = Color(0xFFFF3D00)
            )
        }

    }

    fun LoginScreen(){

    }
}