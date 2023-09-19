package br.senai.sp.jandira.abcdown_mobile.service

import br.senai.sp.jandira.abcdown_mobile.model.login.LoginList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LoginService {

    @GET("login/responsável")
    fun getLogin(@Query("email") email: String, @Query("senha") senha: String): Call<LoginList>
}