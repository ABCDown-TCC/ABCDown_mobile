package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ButtonExtensive(
    navController: NavController

    ){


    Button(
        onClick = { navController.navigate("register") }
    ){}

}
