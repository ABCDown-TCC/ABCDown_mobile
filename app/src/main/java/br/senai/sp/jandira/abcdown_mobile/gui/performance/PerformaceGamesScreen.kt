package br.senai.sp.jandira.abcdown_mobile.gui.performance

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.ButtonPerformance
import br.senai.sp.jandira.abcdown_mobile.ui.theme.ABCDown_mobileTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@Composable
fun PerformanceGamesScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ButtonPerformance(
            navController = navController,
            text = R.string.game,
            description = R.string.game_description,
            imageResId = R.drawable.control,
            onClick = {
                navController.navigate("performanceGames")
            }
        )

        Spacer(modifier = Modifier.height(30.dp))

        ButtonPerformance(
            navController = navController,
            text = R.string.tasks,
            description = R.string.tasks_description,
            imageResId = R.drawable.book,
            onClick = {
                navController.navigate("performanceGames")
            }
        )
    }

}

@OptIn(ExperimentalAnimationApi::class)
@Preview()
@Composable
fun PerformanceGamesPreview() {
    val navController = rememberAnimatedNavController()
    ABCDown_mobileTheme {
        PerformanceGamesScreen(navController = navController)
    }
}