package br.senai.sp.jandira.abcdown_mobile.gui.studentArea

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ArrowTitleScreen
import br.senai.sp.jandira.abcdown_mobile.components.ButtonExtensive
import java.nio.file.WatchEvent

@Composable
fun RegisterClassPasswordScreen(navController: NavController){
    var password by rememberSaveable { mutableStateOf("") }
    var codeClass by rememberSaveable { mutableStateOf("") }

    
    Column(
        
    ) {

        ArrowTitleScreen(
            navController = navController,
            text = stringResource(id = R.string.register_student),
            textColor = Color.Black,
            onClick = {
                navController.navigate("studentArea")
            },
        )
        
        Text(
            text = stringResource(id = R.string.set_student_password),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        )
        
        Spacer(modifier = Modifier.height(15.dp) )
        
        br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
            label = R.string.password,
            placeholder = R.string.password,
            keyboardType = KeyboardType.Password,
            password
        ) {
            password = it
        }

        Spacer(modifier = Modifier.height(10.dp))

        br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
            label = R.string.confirm_password,
            placeholder = R.string.confirm_password,
            keyboardType = KeyboardType.Password,
            password
        ) {
            password = it
        }
    }

    Text(
        text = stringResource(id = R.string.explanation_class_code),
        fontSize = 12.sp
    )

    br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextField(
        label = R.string.password,
        placeholder = R.string.password,
        keyboardType = KeyboardType.Password,
        password
    ) {
        password = it
    }
    
    Spacer(modifier = Modifier.height(30.dp))

    Box(
        modifier = Modifier
    ) {
        Text(text = stringResource(id = R.string.class_code))
        Text(text = stringResource(id = R.string.explanation_class_code))
//        OutlinedTextField(
//            modifier = Modifier,
//            label = {
//                    Text(text = "")
//            },
//            codeClass
//        ) {
//            codeClass = it
//        }
    }

    ButtonExtensive(navController = navController, text = R.string.register, onClick = {
        navController.navigate("login")
    })
}
