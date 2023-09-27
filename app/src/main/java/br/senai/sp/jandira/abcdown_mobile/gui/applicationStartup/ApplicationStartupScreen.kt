package br.senai.sp.jandira.abcdown_mobile.gui.applicationStartup

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.model.Responsible
import br.senai.sp.jandira.abcdown_mobile.model.get.ResponsibleList
import br.senai.sp.jandira.abcdown_mobile.model.viaCep.ViaCep
import br.senai.sp.jandira.abcdown_mobile.service.RetrofitFactory
import kotlinx.coroutines.delay
import retrofit2.Call
import retrofit2.Response

@Composable
fun ApplicationStartupScreenScreen(navController: NavController) {

    LaunchedEffect(Unit){
        val call = RetrofitFactory().getResponsibleService().getResponsible(5)
        call.enqueue(object : retrofit2.Callback<ResponsibleList> {
            override fun onResponse(
                call: Call<ResponsibleList>,
                response: Response<ResponsibleList>

            ) {

                println(response.body()!!.responsavel)

            }

            override fun onFailure(call: Call<ResponsibleList>, t: Throwable) {
                Log.i(
                    "ds2m",
                    "onFailure: ${t.message}"
                )
                println(t.message + t.cause)
            }
        })

        val callCep = RetrofitFactory.RetrofitFactoryViaCep().getCep().getCep("06660460")


        callCep.enqueue(object : retrofit2.Callback<ViaCep> {
            override fun onResponse(
                call: Call<ViaCep>,
                response: Response<ViaCep>

            ) {

                println(response.body()!!.logradouro)

            }

            override fun onFailure(call: Call<ViaCep>, t: Throwable) {
                Log.i(
                    "ds2m",
                    "onFailure: ${t.message}"
                )
                println(t.message + t.cause)
            }
        })
    }

    var responsavel: List<Responsible>

    LaunchedEffect(true) {
        // Irá automáticamente para a screen log-in
        delay(1)
        navController.navigate("login")
    }

    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "image logo",
            modifier = Modifier
                .width(140.dp)
                .height(155.dp))
    }
}
