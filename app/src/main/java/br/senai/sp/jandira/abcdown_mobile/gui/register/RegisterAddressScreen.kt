package br.senai.sp.jandira.abcdown_mobile.gui.register

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

@Composable
fun RegisterAddressScreen(navController: NavController) {

    val context = LocalContext.current
    var cep by rememberSaveable { mutableStateOf("") }
    var street by rememberSaveable { mutableStateOf("") }
    var neighborhood by rememberSaveable { mutableStateOf("") }
    var city by rememberSaveable { mutableStateOf("") }
    var state by rememberSaveable { mutableStateOf("") }
    var number by rememberSaveable { mutableStateOf("") }

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

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = stringResource(
                    id = R.string.register_your
                ),
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 33.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = stringResource(id = R.string.address),
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.blue),
                fontSize = 33.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,

                )


            Spacer(modifier = Modifier.height(40.dp))

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.cep,
                placeholder = R.string.example_cep,
                keyboardType = KeyboardType.Number,
                cep
            ) {
                cep = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.street,
                placeholder = R.string.street,
                keyboardType = KeyboardType.Number,
                street
            ) {
                street = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.neighborhood,
                placeholder = R.string.neighborhood,
                keyboardType = KeyboardType.Text,
                neighborhood
            ) {
                neighborhood = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.city,
                placeholder = R.string.city,
                keyboardType = KeyboardType.Password,
                city
            ) {
                city = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.state,
                placeholder = R.string.state,
                keyboardType = KeyboardType.Password,
                state
            ) {
                state = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.number,
                placeholder = R.string.number,
                keyboardType = KeyboardType.Number,
                number
            ) {
                number = it
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth(),
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