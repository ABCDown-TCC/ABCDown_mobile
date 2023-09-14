package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.abcdown_mobile.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldForVerificationCode(
    keyboardType: KeyboardType,
    value: String,
    onValueChange: (String) -> Unit,
) {

    val blueColor = colorResource(id = R.color.blue)
    val blueColorReducedOpacity = blueColor.copy(0.4f)

    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()
    ){

        OutlinedTextField(value = value,
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            onValueChange = { onValueChange(it) },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = blueColorReducedOpacity,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier
                .size(52.dp)
                .clip(RoundedCornerShape(10.dp))
        )

        OutlinedTextField(value = value,
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            onValueChange = { onValueChange(it) },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = blueColorReducedOpacity,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier
                .size(52.dp)
                .clip(RoundedCornerShape(10.dp))
        )

        OutlinedTextField(value = value,
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            onValueChange = { onValueChange(it) },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = blueColorReducedOpacity,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier
                .size(52.dp)
                .clip(RoundedCornerShape(10.dp))
        )

        OutlinedTextField(value = value,
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            onValueChange = { onValueChange(it) },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = blueColorReducedOpacity,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            modifier = Modifier
                .size(52.dp)
                .clip(RoundedCornerShape(10.dp))
        )
    }


}
