package com.ferrero.app.service

import retrofit2.Response
import retrofit2.http.GET

interface HostInterfaceeededed {
    @GET("typo.json")
    suspend fun getDataDev(): Response<GeoDev>
}