package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.abcdown_mobile.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextField(
    label: Int,
    placeholder: Int,
    keyboardType: KeyboardType,
    value: String,
    onValueChange: (String) -> Unit,

    ) {


    androidx.compose.material3.OutlinedTextField(
        value = value,
        onValueChange = { onValueChange(it) },
        modifier = Modifier.fillMaxWidth(),
        label = {
            Text(
                text = stringResource(id = label),
                fontSize = 16.5.sp,
                modifier = Modifier,

                )
        },
        placeholder = {
            Text(
                text = stringResource(id = placeholder),
                fontSize = 16.sp,
                modifier = Modifier,

                )
        },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = Color.Transparent,
            focusedBorderColor = colorResource(id = R.color.blue),
            unfocusedBorderColor = colorResource(id = R.color.grey_border_textfield),
            focusedLabelColor = colorResource(id = R.color.blue),
            unfocusedLabelColor = colorResource(id = R.color.grey_placeholder),
            textColor = Color.Black,
        ),
        shape = RoundedCornerShape(8.dp)

    )


}
