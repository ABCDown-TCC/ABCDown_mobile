package br.senai.sp.jandira.abcdown_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.abcdown_mobile.gui.applicationStartup.ApplicationStartupScreenScreen
import br.senai.sp.jandira.abcdown_mobile.gui.forgetPassword.CodeCheckScreen
import br.senai.sp.jandira.abcdown_mobile.gui.forgetPassword.ForgetPasswordScreen
import br.senai.sp.jandira.abcdown_mobile.gui.login.LoginScreen
import br.senai.sp.jandira.abcdown_mobile.gui.register.RegisterScreen
import br.senai.sp.jandira.abcdown_mobile.gui.register.RegisterAddressScreen
import br.senai.sp.jandira.abcdown_mobile.gui.register.RegisterEmailPasswordScreen
import br.senai.sp.jandira.abcdown_mobile.gui.studentArea.StudentAreaScreen
import br.senai.sp.jandira.abcdown_mobile.gui.forgetPassword.ResetNewPasswordScreen
import br.senai.sp.jandira.abcdown_mobile.gui.studentArea.AccompanyStudentScreen
import br.senai.sp.jandira.abcdown_mobile.gui.studentArea.RegisterClassPasswordScreen
import br.senai.sp.jandira.abcdown_mobile.gui.studentArea.RegisterStudentScreen
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
        composable(route = "studentArea") { StudentAreaScreen(navController) }
        composable(route = "registerClassPassword") { RegisterClassPasswordScreen(navController) }
        composable(route = "registerStudent") { RegisterStudentScreen(navController) }
        composable(route = "accompanyStudent") { AccompanyStudentScreen(navController) }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ABCDown_mobileTheme {
//        Greeting("Android")
//    }
//}