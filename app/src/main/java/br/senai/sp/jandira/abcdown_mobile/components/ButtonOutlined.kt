package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R

@Composable
fun ButtonOutlined(
    navController: NavController,
    text: Int,
    modifier: Modifier = Modifier,
    colorText: Color,
    colorStroke: Color,
    onClick: (NavController) -> Unit
){
    Button(
        onClick = { onClick(navController) },
        modifier = modifier
            .fillMaxWidth()
            .height(45.dp)
            .background(Color.White)
        ,
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        border = BorderStroke(2.dp, colorStroke),
        shape = RoundedCornerShape(8.dp),
    ){
        Text(
            text = stringResource(id = text).uppercase(),
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            color = colorText
        )
    }
}
