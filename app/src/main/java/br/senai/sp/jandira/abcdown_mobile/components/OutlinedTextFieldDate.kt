//package br.senai.sp.jandira.abcdown_mobile.components
//
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.text.BasicTextField
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.LocalContentColor
//import androidx.compose.material3.LocalTextStyle
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.unit.dp
//import java.text.SimpleDateFormat
//import java.util.Locale
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun OutlinedTextFieldDate(
//    value: String,
//    onValueChange: (String) -> Unit,
//){
//
//    var dateOfBirthText by remember {
//        mutableStateOf(value)
//    }
//    var isDateValid by remember { mutableStateOf(true) }
//
//    val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.US)
//
//    Column {
//        TextField(
//            value = dateOfBirthText,
//            onValueChange = {  onValueChange
//                // Verifica se o novo texto possui o formato válido de data
//                val parsedDate = try {
//                    dateFormat.parse(?onValueChange)
//                } catch (ex: Exception) {
//                    null
//                }
//
//                if (parsedDate != null) {
//                    dateOfBirthText = dateFormat.format(parsedDate)
//                    isDateValid = true
//                } else {
//                    isDateValid = false
//                }
//            },
//            textStyle = LocalTextStyle.current.copy(color = if (isDateValid) LocalContentColor.current else Color.Red),
//            modifier = Modifier.fillMaxWidth(),
//            placeholder = { Text(text = "Data de nascimento") },
//            singleLine = true
//        )
//
//        if (!isDateValid) {
//            Text(
//                text = "Data de nascimento inválida",
//                color = Color.Red,
//                modifier = Modifier.padding(start = 8.dp)
//            )
//        }
//    }
//}

