package br.senai.sp.jandira.abcdown.gui.Register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun RegisterScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    )
    {
        Text(text = "register", color = Color.Magenta)
        Button(
            onClick = { navController.navigate("login") },
        )
        {
            Text(text = "log in")
        }

    }
}