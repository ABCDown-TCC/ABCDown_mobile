package br.senai.sp.jandira.abcdown.gui.Login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    )
    {
        Text(text = "Login", color = Color.Magenta)
        Button(
            onClick = { navController.navigate("register") }
        )
        {
            Text(text = "Cadastrar-me")
        }

    }
}


