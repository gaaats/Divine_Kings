package com.ferrero.app.mainclasa


import io.branch.referral.Branch
import org.koin.android.ext.koin.androidContext
import android.app.Application
import android.content.Context
import com.ferrero.app.modules.appModuleeeeeeeeeeeeeeee
import com.ferrero.app.modules.hy5yh55yh4ju4uj448uj
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class MaaaainClaas:Application() {

    companion object {
        const val LINK_CODE = "http://divinekings.xyz/"
        var instId: String? = "instID"
        var aps_id: String? = "main_id"
        const val ONESIGNAL_APP_ID = "69cf939a-f67b-4059-9342-1b3eda28d473"
        const val APPS_CODE = "CLayTsSJ9W7SLXRaUDSacG"
        const val TRACKER_CODE = "34777832306231257190"
        const val PACK = "com.ferrero.app"


    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)

        gtugtuhgtgthugt()

        // Branch object initialization
        Branch.getAutoInstance(this)

        //Kochava init
//        Tracker.getInstance().startWithAppGuid(applicationContext, "kojoy-of-iridescence-w9gx2r")


        val hyyjuujujufedd = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val vfbhhjedgedy = getSharedPreferences("PREFS_NAME", 0)

        val hyhyhyhyhy = MyTracker.getTrackerParams()
        val trackerConfig6gt5gt65 = MyTracker.getTrackerConfig()

        val instIDgtgt56gt = MyTracker.getInstanceId(this)
        trackerConfig6gt5gt65.isTrackingLaunchEnabled = true



        if (vfbhhjedgedy.getBoolean("my_first_time", true)) {

            hyyjuujujufedd.edit().putString(instId, instIDgtgt56gt).apply()
            vfbhhjedgedy.edit().putBoolean("my_first_time", false).apply()
        } else {
        }
        urhufggfrfrgrfgyrfgyrf()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MaaaainClaas)
            modules(
                listOf(
                    hy5yh55yh4ju4uj448uj, appModuleeeeeeeeeeeeeeee
                )
            )
        }
    }

    private fun urhufggfrfrgrfgyrfgyrf() {
        MyTracker.initTracker(TRACKER_CODE, this)
    }

    private fun gtugtuhgtgthugt() {
        Branch.enableTestMode()
    }
}