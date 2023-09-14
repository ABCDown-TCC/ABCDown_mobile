package br.senai.sp.jandira.abcdown_mobile.gui.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ButtonArrowCircular

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
        
        ButtonArrowCircular(
            navController = navController,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp),
            imageResId = R.drawable.arrow_back_24,
            onClick = {
                navController.navigate("login")
            },
            color = colorResource(id = R.color.blue)


        )

        ButtonArrowCircular(
            navController = navController,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp),
            imageResId = R.drawable.arrow_next_24,
            onClick = {
                navController.navigate("login")
            },
            color = colorResource(id = R.color.blue)


        )

    }
}