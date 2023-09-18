package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.abcdown_mobile.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedTextFieldPassword(
    label: Int,
    placeholder: Int,
    password: String,
    onValueChange: (String) -> Unit
) {
    var isPasswordVisible by remember { mutableStateOf(false) }

   val icon = if (isPasswordVisible)
       painterResource(id = R.drawable.visibility_24)
    else
        painterResource(id = R.drawable.visibility_off_24)

    androidx.compose.material3.OutlinedTextField(
        value = password,
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
        trailingIcon = {
                       IconButton(onClick = {
                        isPasswordVisible = !isPasswordVisible
                       }) {
                          Icon(painter = icon, contentDescription = "Visibility icon")
                       }
        },
        visualTransformation = if (isPasswordVisible) VisualTransformation.None
        else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
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
