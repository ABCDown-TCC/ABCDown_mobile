package br.senai.sp.jandira.abcdown.gui.Login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.TextField

@Composable
fun LoginScreen(navController: NavController) {

    val context = LocalContext.current
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.logo_login),
            contentDescription = "image logo",
            modifier = Modifier
                .width(83.dp)
                .height(73.dp)
        )


        TextField(
            text = R.string.type_your_email_or_user,
            fieldName = R.string.email_or_user,
            keyboardType = KeyboardType.Text,
            email
        ) {
            email = it
        }

        TextField(
            text = R.string.enter_with_your_password,
            fieldName = R.string.password,
            keyboardType = KeyboardType.Text,
            password
        ) {
            password = it
        }
        
        Text(
            text = stringResource(id = R.string.forget_password),
            modifier = Modifier
                .fillMaxWidth()
                .clickable { 
                    navController.navigate("forgetPassword")
                },
            
        )



        Button(
            onClick = { navController.navigate("register") }
        )
        {
            Text(text = "Cadastrar-me")
        }

    }
}


