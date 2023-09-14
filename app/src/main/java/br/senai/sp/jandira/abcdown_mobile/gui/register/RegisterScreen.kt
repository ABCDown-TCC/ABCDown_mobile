package br.senai.sp.jandira.abcdown_mobile.gui.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ButtonArrowCircular
import br.senai.sp.jandira.abcdown_mobile.components.FieldImageProfile
import br.senai.sp.jandira.abcdown_mobile.components.TextField

@Composable
fun RegisterScreen(navController: NavController) {
    val context = LocalContext.current
    var name by rememberSaveable { mutableStateOf("") }
    var cpf by rememberSaveable { mutableStateOf("") }
    var dateOfBirth by rememberSaveable { mutableStateOf("") }
    var gender by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    {

        
        ButtonArrowCircular(
            navController = navController,
            modifier = Modifier
                .width(40.dp)
                .height(40.dp),
            imageResId = R.drawable.arrow_back_24,
            onClick = {
                navController.navigate("login")
            },
            color = colorResource(id = R.color.blue)

        )

        Text(text = stringResource(
            id = R.string.create_an_account_now),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold)

        FieldImageProfile()

        TextField(
            text = R.string.type_your_email_or_user,
            fieldName = R.string.email_or_user,
            keyboardType = KeyboardType.Text,
            name
        ) {
            name = it
        }

        TextField(
            text = R.string.type_your_email_or_user,
            fieldName = R.string.email_or_user,
            keyboardType = KeyboardType.Text,
            cpf
        ) {
            cpf = it
        }

        TextField(
            text = R.string.type_your_email_or_user,
            fieldName = R.string.email_or_user,
            keyboardType = KeyboardType.Text,
            dateOfBirth
        ) {
            dateOfBirth = it
        }

        TextField(
            text = R.string.type_your_email_or_user,
            fieldName = R.string.email_or_user,
            keyboardType = KeyboardType.Text,
            gender
        ) {
            gender = it
        }

        ButtonArrowCircular(
            navController = navController,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp),
            imageResId = R.drawable.arrow_next_24,
            onClick = {
                navController.navigate("registerAddress")
            },
            color = colorResource(id = R.color.blue)


        )

    }
}