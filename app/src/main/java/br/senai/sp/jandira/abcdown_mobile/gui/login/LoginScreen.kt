package br.senai.sp.jandira.abcdown_mobile.gui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ButtonArrowCircular
import br.senai.sp.jandira.abcdown_mobile.components.ButtonExtensive
import br.senai.sp.jandira.abcdown_mobile.components.ContinueWithGoogle
import br.senai.sp.jandira.abcdown_mobile.components.FooterWithNavigationText

@Composable
fun LoginScreen(navController: NavController) {

    val context = LocalContext.current
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 15.dp, top = 85.dp, end = 15.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    )
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.logo_login),
                contentDescription = "image logo",
                modifier = Modifier
                    .width(93.dp)
                    .height(83.dp)
            )

            Text(
                text = stringResource(id = R.string.welcome),
                modifier = Modifier.padding(top = 20.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )

            Text(
                text = stringResource(id = R.string.log_in_to_your_account),
                modifier = Modifier.padding(top = 6.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.email_or_user,
                placeholder = R.string.type_your_email_or_user,
                keyboardType = KeyboardType.Text,
                email
            ) {
                email = it
            }
            
            Spacer(modifier = Modifier.height(15.dp))

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.password,
                placeholder = R.string.enter_with_your_password,
                keyboardType = KeyboardType.Password,
                password
            ) {
                password = it
            }



            Text(
                text = stringResource(id = R.string.forget_password),
                modifier = Modifier
                    .clickable {
                        navController.navigate("forgetPassword")
                    }
                    .align(Alignment.End)
                    .padding(top = 20.dp, bottom = 20.dp),

                fontSize = 14.sp

            )

            ButtonExtensive(navController = navController, text = R.string.enter, onClick = {
                navController.navigate("registerStudent")
            })

            Spacer(modifier = Modifier.height(15.dp))

            ContinueWithGoogle(text = stringResource(id = R.string.continue_with_google))

            ButtonArrowCircular(
                navController = navController,
                modifier = Modifier
                    .width(55.dp)
                    .height(55.dp)
                    .shadow(3.dp, shape = CircleShape),
                modifierImage = Modifier.size(45.dp),
                imageResId = R.drawable.logo_google,
                onClick = {
                    navController.navigate("login")
                },
                color = Color.White

            )
        }


        FooterWithNavigationText(
            navController = navController,
            text = stringResource(id = R.string.dont_have_an_account),
            textNavigation = stringResource(id = R.string.create_an_account),
            modifier = Modifier,
            navigate = "register"
        )


    }
}


