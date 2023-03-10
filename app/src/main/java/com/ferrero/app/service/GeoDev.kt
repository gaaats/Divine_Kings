package com.ferrero.app.service

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName


@Keep
data class GeoDev(
    @SerializedName("geo")
    val geo: String,
    @SerializedName("view")
    val view: String,
    @SerializedName("appsChecker")
    val appsChecker: String,
)