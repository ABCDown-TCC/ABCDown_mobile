package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.abcdown_mobile.R

@Composable
fun ClickableCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .width(160.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.image_student),
            contentDescription = "field image profile",
            modifier = Modifier.size(160.dp),
            alignment = Alignment.Center
        )
        Image(
            painter = painterResource(
                id = R.drawable.add_photo_24
            ),
            contentDescription = "icon adding photo",
            modifier = Modifier
                .width(50.dp)
                .height(42.dp)


        )


    }

}