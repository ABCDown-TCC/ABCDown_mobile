package br.senai.sp.jandira.abcdown_mobile.gui.studentArea

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.room.util.TableInfo
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ArrowTitleScreen
import br.senai.sp.jandira.abcdown_mobile.components.CardAccompany
import br.senai.sp.jandira.abcdown_mobile.components.OutlinedTextFieldPassword
import br.senai.sp.jandira.abcdown_mobile.ui.theme.ABCDown_mobileTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@Composable
fun PersonalDataScreen(
    navController: NavController
) {
    var password by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.blue)),
        verticalArrangement = Arrangement.SpaceBetween

    ) {
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



        CardAccompany(components = Row {
            OutlinedTextFieldPassword(
                label = R.string.password,
                placeholder = R.string.password,
                password = password
            ) {
                password = it
            }

        })
    }
}


@OptIn(ExperimentalAnimationApi::class)
@Preview(showBackground = true)
@Composable
fun PersonalDataPreview() {
    val navController = rememberAnimatedNavController()
    ABCDown_mobileTheme {
        PersonalDataScreen(navController = navController)
    }
}