package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
    ) {
        Text(
            text = text,
            fontSize = 13.sp
        )

        Spacer(modifier = Modifier.width(2.dp))
        
        Text(
            text = textNavigation,
            modifier = modifier
                .clickable {
                    navController.navigate(navigate!!)
                },
            fontSize = 13.sp,
            color = colorResource(id = R.color.blue),
            fontWeight = FontWeight.Medium
        )
    }
}