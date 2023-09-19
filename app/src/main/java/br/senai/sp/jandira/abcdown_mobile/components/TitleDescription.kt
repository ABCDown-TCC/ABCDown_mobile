package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.abcdown_mobile.R

@Composable
fun TitleDescription(
    title: String,
    description: String
){

    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(
            text = title,
            modifier = Modifier,
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = description,
            modifier = Modifier,
            color = colorResource(id = R.color.grey_placeholder),
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )
    }

}