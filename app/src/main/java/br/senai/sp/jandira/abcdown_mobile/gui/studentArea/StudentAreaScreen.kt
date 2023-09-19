package br.senai.sp.jandira.abcdown_mobile.gui.studentArea

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ButtonArrowCircular
import br.senai.sp.jandira.abcdown_mobile.components.CardStudent
import br.senai.sp.jandira.abcdown_mobile.components.TitleDescription
import br.senai.sp.jandira.abcdown_mobile.ui.theme.ABCDown_mobileTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import retrofit2.Call
import retrofit2.Response

@Composable
fun StudentAreaScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 15.dp, top = 25.dp, end = 15.dp, bottom = 25.dp)
            .background(Color.White)) {
        TitleDescription(
            title = stringResource(id = R.string.studant_area), description = stringResource(
                id = R.string.track_registered_students
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        CardStudent(
            navController = navController,
            photo = R.drawable.student_photo,
            name = "Roberto Ferreira",
            dateOfBirth = "12/04/2006",
            gender = "Masculino",
            onClick = {
                navController.navigate("accompanyStudent")
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            ButtonArrowCircular(
                navController = navController,
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .shadow(3.dp, shape = CircleShape),
                modifierImage = Modifier.size(24.dp),
                imageResId = R.drawable.add_24,
                onClick = {
                    navController.navigate("registerStudent")
                },
                color = Color.White

            )
        }

    }


}

@OptIn(ExperimentalAnimationApi::class)
@Preview()
@Composable
fun StudentAreaPreview() {
    val navController = rememberAnimatedNavController()
    ABCDown_mobileTheme {
        StudentAreaScreen(navController = navController)
    }
}