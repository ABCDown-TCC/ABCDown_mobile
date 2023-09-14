package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.abcdown_mobile.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField(
    text: Int,
    fieldName: Int,
    keyboardType: KeyboardType,
    value: String,
    onValueChange: (String) -> Unit,

    ) {
    var isFocused by remember { mutableStateOf(false) }
    val borderColor = if (isFocused) {
        colorResource(id = R.color.blue) // Cor da borda quando o campo de texto está em foco
    } else {
        colorResource(id = R.color.grey_border_textfild) // Cor da borda quando o campo de texto não está em foco
    }

    val textColor = if (isFocused) {
        colorResource(id = R.color.blue) // Cor do texto quando o campo de texto está em foco
    } else {
        Color.Black // Cor do texto quando o campo de texto não está em foco
    }

    val textFieldColors = TextFieldDefaults.textFieldColors(
        unfocusedIndicatorColor = borderColor,
        focusedIndicatorColor = borderColor,
    )

    Text(
        text = stringResource(id = fieldName),
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        color = textColor
    )

    TextField(
        value = value,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        onValueChange = { onValueChange(it) },
        textStyle = TextStyle(
            color = colorResource(id = R.color.grey_placeholder),
            fontSize = 13.sp
        ),
        placeholder = {
            Text(
                text = stringResource(id = text),
                color = colorResource(id = R.color.grey_placeholder)
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.Transparent
        ),
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background.copy(alpha = 0f))
            .onFocusChanged { focusState ->
                isFocused = focusState.isFocused
            },
        singleLine = true,


        )

}
