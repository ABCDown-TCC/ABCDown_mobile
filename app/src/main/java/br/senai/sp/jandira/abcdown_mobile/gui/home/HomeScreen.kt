package br.senai.sp.jandira.abcdown_mobile.gui.home

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.ui.theme.ABCDown_mobileTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),

            ) {
            Image(
                painter = painterResource(id = R.drawable.logo_login),
                contentDescription = "image logo",
                modifier = Modifier
                    .width(93.dp)
                    .height(83.dp)
            )

            Text(text = stringResource(id = R.string.educational_platform))

            Text(text = stringResource(id = R.string.loren))
        }

        Column {
            Text(text = stringResource(id = R.string.about))

            Text(text = stringResource(id = R.string.loren))

            Text(text = stringResource(id = R.string.teaching_strategy))

            Text(text = stringResource(id = R.string.loren))
        }
    }


}
@OptIn(ExperimentalAnimationApi::class)
@Preview()
@Composable
fun HomePreview() {
    val navController = rememberAnimatedNavController()
    ABCDown_mobileTheme {
        HomeScreen(navController = navController)
    }
}
