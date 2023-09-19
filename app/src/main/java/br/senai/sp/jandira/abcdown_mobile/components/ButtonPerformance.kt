package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R

@Composable
fun ButtonPerformance(
    navController: NavController,
    text: Int,
    description: Int,
//    modifierImage: Modifier,
    imageResId: Int,
    onClick: (NavController) -> Unit,
){

    Button(
        onClick = { onClick(navController) },
        modifier = Modifier
            .width(230.dp)
            .height(220.dp)
            .shadow(25.dp),
        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.blue)),
        shape = RoundedCornerShape(8.dp),
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 0.dp, vertical = 30.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier.height(28.dp),

                )

            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = stringResource(id = text),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = stringResource(id = description),
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                color = Color.White
            )
        }

    }

}