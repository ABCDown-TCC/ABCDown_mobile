package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import br.senai.sp.jandira.abcdown_mobile.R
import org.w3c.dom.Text

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropdownGender() {
    var isExpanded by remember {
        mutableStateOf(false)
    }

    var gender by remember {
        mutableStateOf("")
    }

    var textFiledSize by remember {
        mutableStateOf(Size.Zero)
    }

    var icon = if (isExpanded){
        Icons.Filled.KeyboardArrowUp
    } else{
        Icons.Filled.KeyboardArrowDown
    }


    Box(modifier = Modifier.fillMaxWidth()) {

            androidx.compose.material3.OutlinedTextField(
                value = gender,
                onValueChange = {},
                readOnly = true,
                label = {
                    Text(
                        text = stringResource(id = R.string.gender),
                        fontSize = 16.5.sp,


                        )
                },
                placeholder = {
                    Text(
                        text = stringResource(id = R.string.gender),
                        fontSize = 16.sp,


                        )
                },
                trailingIcon = {
                   Icon(imageVector = icon, contentDescription = "", Modifier.clickable { isExpanded = !isExpanded })
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Transparent,
                    focusedBorderColor = colorResource(id = R.color.blue),
                    unfocusedBorderColor = colorResource(id = R.color.grey_border_textfield),
                    focusedLabelColor = colorResource(id = R.color.blue),
                    unfocusedLabelColor = colorResource(id = R.color.grey_placeholder),
                    textColor = Color.Black,
                ),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .onGloballyPositioned { coordinates ->
                        textFiledSize = coordinates.size.toSize()
                    }
            )

            DropdownMenu(expanded = isExpanded,
                onDismissRequest = { isExpanded = false },
                modifier = Modifier
                    .background(Color.White)
                    .width(with(LocalDensity.current){textFiledSize.width.toDp()}
                    )
            ) {
                DropdownMenuItem(
                    text = {
                        Text(text = stringResource(id = R.string.male))

                    }, onClick = {
                        gender = "Masculino"
                        isExpanded = false
                    }

                )

                DropdownMenuItem(
                    text = {
                        Text(text = stringResource(id = R.string.feminine))

                    }, onClick = {
                        gender = "Feminino"
                        isExpanded = false
                    }
                )

                DropdownMenuItem(
                    text = {
                        Text(text = stringResource(id = R.string.outhers))

                    }, onClick = {
                        gender = "Outros"
                        isExpanded = false
                    }
                )
            }

        }


    }



