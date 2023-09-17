package br.senai.sp.jandira.abcdown_mobile.gui.studentArea

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ArrowTitleScreen
import br.senai.sp.jandira.abcdown_mobile.components.ButtonOutlined
import br.senai.sp.jandira.abcdown_mobile.components.FieldImageProfile
import br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField

@Composable
fun RegisterStudentScreen(
    navController: NavController
) {

    var name by rememberSaveable { mutableStateOf("") }
    var cpf by rememberSaveable { mutableStateOf("") }
    var gender by rememberSaveable { mutableStateOf("") }
    var dateOfBirth by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 15.dp, top = 25.dp, end = 15.dp, bottom = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        ArrowTitleScreen(
            navController = navController,
            text = stringResource(id = R.string.register_student),
            textColor = Color.Black,
            onClick = {
                navController.navigate("studentArea")
            },
        )

        FieldImageProfile()

        OutlinedTextField(
            label = R.string.name,
            placeholder = R.string.name,
            keyboardType = KeyboardType.Text,
            name
        ) {
            name = it
        }

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            label = R.string.cpf,
            placeholder = R.string.example_cpf,
            keyboardType = KeyboardType.Number,
            cpf
        ) {
            cpf = it
        }

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            label = R.string.date_of_birth,
            placeholder = R.string.date_of_birth,
            keyboardType = KeyboardType.Text,
            dateOfBirth
        ) {
            dateOfBirth = it
        }

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            label = R.string.gender,
            placeholder = R.string.gender,
            keyboardType = KeyboardType.Password,
            gender
        ) {
            gender = it
        }








        ButtonOutlined(
            navController = navController,
            text = R.string.continue_register,
            colorText = colorResource(id = R.color.blue),
            colorStroke = colorResource(id = R.color.blue),
            onClick = { navController.navigate("registerClassPassword") })

    }
}
