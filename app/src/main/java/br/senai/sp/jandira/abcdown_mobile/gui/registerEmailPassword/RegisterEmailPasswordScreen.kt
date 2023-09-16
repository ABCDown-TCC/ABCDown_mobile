package br.senai.sp.jandira.abcdown_mobile.gui.registerEmailPassword

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ButtonArrowCircular
import br.senai.sp.jandira.abcdown_mobile.components.ButtonExtensive
import br.senai.sp.jandira.abcdown_mobile.components.TextField

@Composable
fun RegisterEmailPasswordScreen(navController: NavController) {

    val context = LocalContext.current
    var password by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 15.dp, top = 25.dp, end = 15.dp, bottom = 25.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {


        Column(

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
                    navController.navigate("registerAddress")
                },
                color = colorResource(id = R.color.blue)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = stringResource(
                    id = R.string.to_finish
                ),
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 31.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = stringResource(id = R.string.to_finish_email),
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 31.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,

                )
            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = stringResource(id = R.string.to_finish_password),
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 31.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,

                )


            Spacer(modifier = Modifier.height(40.dp))

            TextField(
                text = R.string.type_your_email_or_user,
                fieldName = R.string.email_or_user,
                keyboardType = KeyboardType.Text,
                email
            ) {
                email = it
            }

            TextField(
                text = R.string.type_your_email_or_user,
                fieldName = R.string.email_or_user,
                keyboardType = KeyboardType.Text,
                email
            ) {
                email = it
            }

            TextField(
                text = R.string.type_your_email_or_user,
                fieldName = R.string.email_or_user,
                keyboardType = KeyboardType.Text,
                password
            ) {
                password = it
            }

            TextField(
                text = R.string.type_your_email_or_user,
                fieldName = R.string.email_or_user,
                keyboardType = KeyboardType.Text,
                password
            ) {
                password = it
            }


        }

        Column(

        ) {
            ButtonExtensive(navController = navController, text = R.string.register, onClick = {
                navController.navigate("login")
            })
        }
    }
}