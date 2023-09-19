package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.abcdown_mobile.R

@Composable
fun CardCompany(

) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(700.dp)
            .background(colorResource(id = R.color.blue)),
        contentAlignment = Alignment.TopCenter

    ) {


        Surface(
            modifier = Modifier
                .height(638.dp)
                .fillMaxWidth()
                .background(colorResource(id = R.color.blue))
                .clip(
                    RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomEnd = 0.dp,
                        bottomStart = 0.dp
                    )
                )
                .align(
                    Alignment.BottomCenter
                ),

            ) {

        }

        Card(
            modifier = Modifier
                .size(124.dp),
            shape = CircleShape,
            border = BorderStroke(1.5.dp, Color.White)


        ) {
            Image(
                painter = painterResource(id = R.drawable.student_photo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(124.dp)
                    .clip(CircleShape)
                    .border(width = 2.dp, Color.White),
            )
        }


    }
}
