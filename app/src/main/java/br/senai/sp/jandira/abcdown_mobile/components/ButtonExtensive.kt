package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ButtonExtensive(
    navController: NavController,
    text: Int,
    modifier: Modifier = Modifier,
    onClick: (NavController) -> Unit

    ){


    Button(
        onClick = { onClick(navController) },
        modifier = modifier
            .fillMaxWidth()
            .height(55.dp),
        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.blue)),
        shape = RoundedCornerShape(8.dp),
    ){
        Text(
            text = stringResource(id = text).uppercase(),
            fontSize = 15.5.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White
        )
    }

}
