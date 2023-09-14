package br.senai.sp.jandira.abcdown_mobile.gui.forgetPassword

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ButtonArrowCircular
import br.senai.sp.jandira.abcdown_mobile.components.ButtonExtensive
import br.senai.sp.jandira.abcdown_mobile.components.HeaderForgetPassword
import br.senai.sp.jandira.abcdown_mobile.components.TextField
import kotlinx.coroutines.delay

@Composable
fun ForgetPasswordScreen(navController: NavController) {
    val context = LocalContext.current
    var email by rememberSaveable { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()

    ) {
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

        HeaderForgetPassword(
            imageResId = R.drawable.icon_email,
            title = stringResource(id = R.string.forgot_my_password),
            description = stringResource(id = R.string.forgot_my_password_description)
        )


        TextField(
            text = R.string.type_your_email_or_user,
            fieldName = R.string.email_or_user,
            keyboardType = KeyboardType.Text,
            email
        ) {
            email = it
        }

        ButtonExtensive(navController = navController, text = R.string.send, onClick = {
            navController.navigate("codeCheck")
        })


    }



}
