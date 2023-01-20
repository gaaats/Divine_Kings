package com.ferrero.app.modules


import com.ferrero.app.service.DevRepo
import com.ferrero.app.service.HostInterfaceeededed
import com.ferrero.app.vieeevmod.BeamModel
import com.ferrero.app.vieeevmod.ViMod
import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ferrero.app.mainclasa.MaaaainClaas.Companion.LINK_CODE
import com.ferrero.app.service.ApiInterfaceggtgtgtgt
import com.ferrero.app.service.CountryRepo
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModuleeeeeeeeeeeeeeee = module {

    single  <HostInterfaceeededed> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HostInterfaceeededed::class.java)
    }

    single <ApiInterfaceggtgtgtgt> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(ApiInterfaceggtgtgtgt::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl(LINK_CODE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        CountryRepo(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        DevRepo(get(named("HostInter")))
    }
    single{
        h5uj5uj5()
    }
    single (named("SharedPreferences")) {
        hyhyhyhyhyhy(androidApplication())
    }
}



fun h5uj5uj5(): Gson {
    return GsonBuilder().create()
}

fun hyhyhyhyhyhy(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

val hy5yh55yh4ju4uj448uj = module {
    viewModel (named("MainModel")){
        ViMod((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        BeamModel(get())
    }
}
