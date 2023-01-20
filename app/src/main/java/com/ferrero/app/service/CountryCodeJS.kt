package com.ferrero.app.service

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class CountryCodeJS(
    @SerializedName("countryCode")
    val cou: String,
)