package com.ferrero.app.service

import retrofit2.Response
import retrofit2.http.GET

interface ApiInterfaceggtgtgtgt {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJS>
}