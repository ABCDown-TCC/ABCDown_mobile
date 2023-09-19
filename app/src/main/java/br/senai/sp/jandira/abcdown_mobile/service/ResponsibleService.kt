package br.senai.sp.jandira.abcdown_mobile.service

import br.senai.sp.jandira.abcdown_mobile.model.Responsible
import br.senai.sp.jandira.abcdown_mobile.model.get.ResponsibleList
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ResponsibleService {

    @POST("responsavel")
    fun insertResponsible(@Body responsible: Responsible): Call<ResponseBody>

    @GET("responsavel/{id}")
    fun getResponsible(@Path("id") id: Int): Call<ResponsibleList>

    @PUT("responsavel/{id}")
    fun updateResponsible(@Path("id") id: Int, @Body responsible: Responsible): Call<Responsible>
}