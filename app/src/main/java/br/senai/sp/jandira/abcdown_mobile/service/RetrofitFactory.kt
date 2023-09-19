package br.senai.sp.jandira.abcdown_mobile.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


class RetrofitFactory {

    // pesquisar ip base
    private val URL_BASE = "http://10.107.144.25:3000"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(URL_BASE)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

//    fun getCourseService(): CourseService {
//        return retrofitFactory.create(CourseService::class.java)
//    }
//
//    fun getAunosService(): StudentService{
//        return retrofitFactory.create(StudentService::class.java)
//    }

    fun getResponsibleService(): ResponsibleService{
        return retrofitFactory.create(ResponsibleService::class.java)
    }


    class RetrofitFactoryViaCep {
        private val URL_BASE = " https://viacep.com.br/ws/"
        private val retrofitFactory = Retrofit
            .Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        fun getCep(): ViaCepService {
            return retrofitFactory.create(ViaCepService::class.java)
        }
    }

}