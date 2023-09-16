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
import androidx.compose.material3.Button
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
import androidx.compose.ui.unit.TextUnit
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
            .padding(start = 15.dp, top = 25.dp, end = 15.dp, bottom = 25.dp),
        verticalArrangement = Arrangement.SpaceBetween
    )
    {

        Column() {

            ButtonArrowCircular(
                navController = navController,
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .shadow(4.dp, shape = CircleShape),
                modifierImage = Modifier.size(18.dp),
                imageResId = R.drawable.arrow_back_24,
                onClick = {
                    navController.navigate("login")
                },
                color = colorResource(id = R.color.blue)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = stringResource(
                        id = R.string.create_an_account_register
                    ),
                    color = colorResource(id = R.color.blue),
                    fontSize = 33.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )
                
                Spacer(modifier = Modifier.height(2.dp))
                
                 Text(
                     text = stringResource(id = R.string.now_register),
                     modifier = Modifier.fillMaxWidth(),
                     color = colorResource(id = R.color.blue),
                     fontSize = 33.sp,
                     fontWeight = FontWeight.Bold,
                     textAlign = TextAlign.Center,

                 )
                
                Spacer(modifier = Modifier.height(20.dp))

                FieldImageProfile()
            }

            Spacer(modifier = Modifier.height(40.dp))

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.name,
                placeholder = R.string.name,
                keyboardType = KeyboardType.Text,
                name
            ) {
                name = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.cpf,
                placeholder = R.string.example_cpf,
                keyboardType = KeyboardType.Number,
                cpf
            ) {
                cpf = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.date_of_birthday,
                placeholder = R.string.date_of_birthday,
                keyboardType = KeyboardType.Text,
                dateOfBirth
            ) {
                dateOfBirth = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
                label = R.string.gender,
                placeholder = R.string.gender,
                keyboardType = KeyboardType.Password,
                gender
            ) {
                gender = it
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
                    navController.navigate("registerAddress")
                },
                color = colorResource(id = R.color.blue)


            )
        }




    }
}