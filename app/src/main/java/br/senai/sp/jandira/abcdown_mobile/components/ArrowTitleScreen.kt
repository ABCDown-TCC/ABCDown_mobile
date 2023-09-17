package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R

@Composable
fun ArrowTitleScreen(
    navController: NavController,
    text: String,
    textColor: Color,
    onClick: (NavController) -> Unit,

){
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .clickable(onClick = { onClick(navController) }),

        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow_back),
                contentDescription = null,
            )

        }

        Text(
            text = text,
            color = textColor,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,

        )
    }
}
