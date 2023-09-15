package br.senai.sp.jandira.abcdown_mobile.gui.registerAddress

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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ButtonArrowCircular
import br.senai.sp.jandira.abcdown_mobile.components.TextField

@Composable
fun RegisterAddressScreen(navController: NavController) {

    val context = LocalContext.current
    var cep by rememberSaveable { mutableStateOf("") }
    var numero by rememberSaveable { mutableStateOf("") }

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
                    navController.navigate("register")
                },
                color = colorResource(id = R.color.blue)
            )

            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                text = R.string.type_your_email_or_user,
                fieldName = R.string.email_or_user,
                keyboardType = KeyboardType.Text,
                cep
            ) {
                cep = it
            }

            TextField(
                text = R.string.type_your_email_or_user,
                fieldName = R.string.email_or_user,
                keyboardType = KeyboardType.Text,
                cep
            ) {
                cep = it
            }
            TextField(
                text = R.string.type_your_email_or_user,
                fieldName = R.string.email_or_user,
                keyboardType = KeyboardType.Text,
                cep
            ) {
                cep = it
            }

            TextField(
                text = R.string.type_your_email_or_user,
                fieldName = R.string.email_or_user,
                keyboardType = KeyboardType.Text,
                cep
            ) {
                cep = it
            }

            TextField(
                text = R.string.type_your_email_or_user,
                fieldName = R.string.email_or_user,
                keyboardType = KeyboardType.Text,
                cep
            ) {
                cep = it
            }

            TextField(
                text = R.string.type_your_email_or_user,
                fieldName = R.string.email_or_user,
                keyboardType = KeyboardType.Text,
                cep
            ) {
                cep = it
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
            ,
            horizontalAlignment = Alignment.End
        ) {
            ButtonArrowCircular(
                navController = navController,
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .shadow(4.dp, shape = CircleShape),
                modifierImage = Modifier.size(18.dp),
                imageResId = R.drawable.arrow_next_24,
                onClick = {
                    navController.navigate("registerEmailPassword")
                },
                color = colorResource(id = R.color.blue)


            )
        }
    }




}