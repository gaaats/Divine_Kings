package com.ferrero.app.vieeevmod


import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import org.json.JSONException
import org.json.JSONObject

class BeamModel(application: Application): ViewModel() {

    val gtkokogtgtjjgtjitg = application.packageManager

    fun gtgtiogtiojgtjijigt(g5gt5gt: WebView): WebSettings{
       val bbnn5n5n6n = g5gt5gt.settings
        bbnn5n5n6n.javaScriptEnabled = true
        bbnn5n5n6n.useWideViewPort = true
        bbnn5n5n6n.loadWithOverviewMode = true
        bbnn5n5n6n.allowFileAccess = true
        bbnn5n5n6n.domStorageEnabled = true
        bbnn5n5n6n.userAgentString = bbnn5n5n6n.userAgentString.replace("; wv", "")
        bbnn5n5n6n.javaScriptCanOpenWindowsAutomatically = true
        bbnn5n5n6n.setSupportMultipleWindows(false)
        bbnn5n5n6n.displayZoomControls = false
        bbnn5n5n6n.builtInZoomControls = true
        bbnn5n5n6n.allowFileAccess = true
        bbnn5n5n6n.allowContentAccess = true
        bbnn5n5n6n.setSupportZoom(true)
        bbnn5n5n6n.pluginState = WebSettings.PluginState.ON
        bbnn5n5n6n.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        bbnn5n5n6n.setAppCacheEnabled(true)
        bbnn5n5n6n.allowContentAccess = true
        bbnn5n5n6n.mediaPlaybackRequiresUserGesture = false

        return bbnn5n5n6n
    }

    fun gtkgtjogtojjj(gtgthyhyhy: String): Boolean {
        try {
            gtkokogtgtjjgtjitg.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    fun giogtgtjiogt(id: String) {
        OneSignal.setExternalUserId(
            id,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val gttgjgtgtji = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $gttgjgtgtji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val bvfcdvcdgcdcd =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $bvfcdvcdgcdcd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val gtjiogtitigtgiohtjh = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $gtjiogtitigtgiohtjh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }
}