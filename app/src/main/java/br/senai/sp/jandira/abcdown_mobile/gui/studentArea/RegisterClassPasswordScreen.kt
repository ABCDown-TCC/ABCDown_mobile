package br.senai.sp.jandira.abcdown_mobile.gui.studentArea

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.Greeting
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ArrowTitleScreen
import br.senai.sp.jandira.abcdown_mobile.components.ButtonExtensive
import br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextFieldPassword
import br.senai.sp.jandira.abcdown_mobile.ui.theme.ABCDown_mobileTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import java.nio.file.WatchEvent

@Composable
fun RegisterClassPasswordScreen(navController: NavController) {
    var password by rememberSaveable { mutableStateOf("") }
    var confirmPassword by rememberSaveable { mutableStateOf("") }
    var codeClass by rememberSaveable { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 15.dp, top = 25.dp, end = 15.dp, bottom = 25.dp)
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column {
            ArrowTitleScreen(
                navController = navController,
                text = stringResource(id = R.string.register_student),
                textColor = Color.Black,
                arrowColor = Color.Black,
                onClick = {
                    navController.navigate("registerStudent")
                },
            )

            Spacer(modifier = Modifier.height(20.dp))
            
            Text(
                text = stringResource(id = R.string.set_student_password),
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextFieldPassword(
                label = R.string.password,
                placeholder = R.string.password,
                password
            ) {
                password = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextFieldPassword(
                label = R.string.confirm_password,
                placeholder = R.string.confirm_password,
                confirmPassword
            ) {
                confirmPassword = it
            }

            Spacer(modifier = Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()

                    .height(220.dp)
                    .border(
                        width = 2.dp,
                        color = colorResource(id = R.color.green),
                        shape = RoundedCornerShape(8.dp)
                    )

            )
            {
                Column(
                    modifier = Modifier.padding(15.dp, 15.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.class_code),
                        modifier = Modifier.fillMaxWidth(),
                        color = colorResource(id = R.color.green),
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = stringResource(id = R.string.explanation_class_code),
                        fontSize = 15.5.sp
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextFieldCodeClass(
                        label = R.string.class_code,
                        placeholder = R.string.class_code,
                        keyboardType = KeyboardType.Text,
                        codeClass
                    ){
                        codeClass = it
                    }
                }

            }
        }


        Column {
            ButtonExtensive(navController = navController, text = R.string.register, onClick = {
                navController.navigate("studentArea")
            })
        }


    }


}


@OptIn(ExperimentalAnimationApi::class)
@Preview()
@Composable
fun RegisterClassPreview() {
    val navController = rememberAnimatedNavController()
    ABCDown_mobileTheme {
        RegisterClassPasswordScreen(navController = navController)
    }
}