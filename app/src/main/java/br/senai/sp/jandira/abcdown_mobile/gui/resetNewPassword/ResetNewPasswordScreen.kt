package br.senai.sp.jandira.abcdown_mobile.gui.resetNewPassword

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ButtonArrowCircular
import br.senai.sp.jandira.abcdown_mobile.components.ButtonExtensive
import br.senai.sp.jandira.abcdown_mobile.components.HeaderForgetPassword
import br.senai.sp.jandira.abcdown_mobile.components.TextField

@Composable
fun ResetNewPasswordScreen(navController: NavController) {
    val context = LocalContext.current
    var password by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 15.dp, top = 25.dp, end = 20.dp),
    ) {

        ButtonArrowCircular(
            navController = navController,
            modifier = Modifier
                .width(40.dp)
                .height(40.dp)
                .shadow(4.dp, shape = CircleShape),
            modifierImage = Modifier.size(18.dp),
            imageResId = R.drawable.arrow_back_24,
            onClick = {
                navController.navigate("codeCheck")
            },
            color = colorResource(id = R.color.blue)
        )

        Spacer(modifier = Modifier.height(50.dp))

        HeaderForgetPassword(
            imageResId = R.drawable.icon_padlock,
            title = stringResource(id = R.string.reset_my_password),
            description = stringResource(id = R.string.reset_my_password_description)
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            text = R.string.type_your_new_password,
            fieldName = R.string.new_password,
            keyboardType = KeyboardType.Password,
            password
        ) {
            password = it
        }

        TextField(
            text = R.string.confirm_your_new_password,
            fieldName = R.string.confirm_password,
            keyboardType = KeyboardType.Password,
            password
        ) {
            password = it
        }

        Spacer(modifier = Modifier.height(100.dp))

        ButtonExtensive(navController = navController, text = R.string.confirm, onClick = {
            navController.navigate("login")
        })


    }

}