package br.senai.sp.jandira.abcdown_mobile.gui.studentArea

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ArrowTitleScreen
import br.senai.sp.jandira.abcdown_mobile.components.CardCompany
import br.senai.sp.jandira.abcdown_mobile.ui.theme.ABCDown_mobileTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@Composable
fun AccompanyStudentScreen(navController: NavController) {


    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.blue)),
        verticalArrangement = Arrangement.SpaceBetween

    ){
        Row(
            modifier = Modifier.padding(start = 15.dp, top = 25.dp, end = 15.dp)
        ) {
            ArrowTitleScreen(
                navController = navController,
                text = stringResource(id = R.string.studant_area),
                textColor = Color.White,
                arrowColor = Color.White,
                onClick = {
                    navController.navigate("studentArea")
                },
            )
        }


        CardCompany()
    }


}

@OptIn(ExperimentalAnimationApi::class)
@Preview(showBackground = true)
@Composable
fun AccompanyStudentPreview() {
    val navController = rememberAnimatedNavController()
    ABCDown_mobileTheme {
        AccompanyStudentScreen(navController = navController)
    }
}
