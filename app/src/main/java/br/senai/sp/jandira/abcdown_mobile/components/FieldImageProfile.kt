package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.abcdown_mobile.R

@Composable
fun FieldImageProfile() {
    Box(
        modifier = Modifier

            .width(160.dp)
            .height(165.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.image_profile_field),
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
                .align(Alignment.BottomEnd)

        )


    }

}