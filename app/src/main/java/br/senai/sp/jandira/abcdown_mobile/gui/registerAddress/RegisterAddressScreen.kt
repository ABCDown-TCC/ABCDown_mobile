package br.senai.sp.jandira.abcdown_mobile.gui.registerAddress

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.components.TextField

@Composable
fun RegisterAddressScreen(navController: NavController) {

    val context = LocalContext.current
    var cep by rememberSaveable { mutableStateOf("") }
    var numero by rememberSaveable { mutableStateOf("") }


    TextField(
        text = R.string.type_your_email_or_user,
        fieldName = R.string.email_or_user,
        keyboardType = KeyboardType.Text,
        cep
    ) {
        cep = it
    }

    TextField(
        text = R.string.type_your_email_or_user,
        fieldName = R.string.email_or_user,
        keyboardType = KeyboardType.Text,
        cep
    ) {
        cep = it
    }
    TextField(
        text = R.string.type_your_email_or_user,
        fieldName = R.string.email_or_user,
        keyboardType = KeyboardType.Text,
        cep
    ) {
        cep = it
    }

    TextField(
        text = R.string.type_your_email_or_user,
        fieldName = R.string.email_or_user,
        keyboardType = KeyboardType.Text,
        cep
    ) {
        cep = it
    }

    TextField(
        text = R.string.type_your_email_or_user,
        fieldName = R.string.email_or_user,
        keyboardType = KeyboardType.Text,
        cep
    ) {
        cep = it
    }



}