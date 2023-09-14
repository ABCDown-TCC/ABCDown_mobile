package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R

@Composable
fun FooterWithNavigationText(
    navController: NavController,
    text: String,
    textNavigation: String,
    modifier: Modifier,
    navigate: String?

    ){

    Row(
        modifier = Modifier
    ) {
        Text(
            text = text
        )

        Text(
            text = textNavigation,
            modifier = modifier
                .clickable {
                    navController.navigate(navigate!!)
                },
            color = colorResource(id = R.color.blue),
            fontWeight = FontWeight.Medium
        )
    }
}