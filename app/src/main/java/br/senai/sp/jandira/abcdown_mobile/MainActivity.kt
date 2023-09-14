package br.senai.sp.jandira.abcdown_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.abcdown.gui.ApplicationStartup.ApplicationStartupScreenScreen
import br.senai.sp.jandira.abcdown.gui.CodeCheck.CodeCheckScreen
import br.senai.sp.jandira.abcdown.gui.ForgetPassword.ForgetPasswordScreen
import br.senai.sp.jandira.abcdown.gui.Login.LoginScreen
import br.senai.sp.jandira.abcdown.gui.Register.RegisterScreen
import br.senai.sp.jandira.abcdown.gui.RegisterAddress.RegisterAddressScreen
import br.senai.sp.jandira.abcdown.gui.RegisterEmailPassword.RegisterEmailPasswordScreen
import br.senai.sp.jandira.abcdown.gui.RegisterStudent.RegisterStudentScreen
import br.senai.sp.jandira.abcdown.gui.ResetNewPassword.ResetNewPasswordScreen
import br.senai.sp.jandira.abcdown_mobile.ui.theme.ABCDown_mobileTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ABCDown_mobileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")


                }
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val navController = rememberAnimatedNavController()
    AnimatedNavHost(
        navController = navController,
        startDestination = "startup",
    ) {
        composable(route = "startup") { ApplicationStartupScreenScreen(navController) }
        composable(route = "login") { LoginScreen(navController) }
        composable(route = "register") { RegisterScreen(navController) }
        composable(route = "registerImageChoose") { ForgetPasswordScreen(navController) }
        composable(route = "registerAddress") { RegisterAddressScreen(navController) }
        composable(route = "registerEmailPassword") { RegisterEmailPasswordScreen(navController) }
        composable(route = "forgetPassword") { ForgetPasswordScreen(navController) }
        composable(route = "codeCheck") { CodeCheckScreen(navController) }
        composable(route = "resetNewPassword") { ResetNewPasswordScreen(navController) }
        composable(route = "registerStudent") { RegisterStudentScreen(navController) }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ABCDown_mobileTheme {
        Greeting("Android")
    }
}