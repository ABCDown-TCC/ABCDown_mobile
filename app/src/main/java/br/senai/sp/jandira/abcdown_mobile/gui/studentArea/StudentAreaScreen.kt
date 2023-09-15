package br.senai.sp.jandira.abcdown_mobile.gui.studentArea

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ButtonExtensive
import br.senai.sp.jandira.abcdown_mobile.components.ButtonOutlined
import br.senai.sp.jandira.abcdown_mobile.components.FieldImageProfile
import br.senai.sp.jandira.abcdown_mobile.components.TextField
import br.senai.sp.jandira.abcdown_mobile.components.TitleDescriptionScreen
import java.lang.reflect.Modifier

@Composable
fun StudentAreaScreen(navController: NavController) {

    var password by rememberSaveable { mutableStateOf("") }
    var nome by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .padding(start = 15.dp, top = 25.dp, end = 15.dp, bottom = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TitleDescriptionScreen(
            title = stringResource(id = R.string.studant_area),
            description = stringResource(
            id = R.string.track_registered_students
        ) )

        Row() {
            Text(text = stringResource(id = R.string.all_option))
            Text(text = stringResource(id = R.string.new_option))
        }

        FieldImageProfile()

        TextField(
            text = R.string.enter_with_your_password,
            fieldName = R.string.password,
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

        TextField(
            text = R.string.enter_with_your_password,
            fieldName = R.string.password,
            keyboardType = KeyboardType.Text,
            nome
        ) {
            nome = it
        }
        TextField(
            text = R.string.enter_with_your_password,
            fieldName = R.string.password,
            keyboardType = KeyboardType.Text,
            nome
        ) {
            nome = it
        }





        Text(
            text = stringResource(id = R.string.explanation_class_code),
            fontSize = 12.sp
        )

        TextField(
            text = R.string.enter_with_your_password,
            fieldName = R.string.password,
            keyboardType = KeyboardType.Text,
            nome
        ) {
            nome = it
        }

        ButtonOutlined(
            navController = navController,
            text = R.string.cancel,
            colorText = colorResource(id = R.color.orange),
            colorStroke = colorResource(id = R.color.orange),
            onClick = {navController.navigate("studentArea")})
        
        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
        
        ButtonExtensive(navController = navController, text = R.string.register, onClick = {
            navController.navigate("studentArea")
        })


    }

}