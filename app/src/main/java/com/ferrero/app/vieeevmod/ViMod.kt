package com.ferrero.app.vieeevmod

import android.app.Application
import com.google.firebase.analytics.FirebaseAnalytics
import com.ferrero.app.mainclasa.MaaaainClaas.Companion.APPS_CODE
import com.ferrero.app.service.CountryCodeJS
import com.appsflyer.AFInAppEventParameterName
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.ferrero.app.service.CountryRepo
import com.ferrero.app.service.DevRepo
import com.ferrero.app.service.GeoDev
import io.branch.referral.util.BRANCH_STANDARD_EVENT
import io.branch.referral.util.BranchEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope




class ViMod(
    private val ghyhyjuuj6ju6uj: CountryRepo,
    private val gt5tg6gt5gt: DevRepo,
    private val gt5gt5hyh8y: SharedPreferences,
    val gt5gtgt8gt84gt: Application
) : ViewModel() {

    init {
        iiiiiiiiiiiiii()
    }

    private fun iiiiiiiiiiiiii() {
        frrfhrfrfhfrhfr()
        frofrofrjjiorf()
    }

    private fun frofrofrjjiorf() {
        viewModelScope.launch(Dispatchers.Main) {
            gtgt2tgtgt65gt5gt()
        }
    }



    private fun frrfhrfrfhfrhfr() {
        viewModelScope.launch(Dispatchers.IO) {
            gt2gtgt5gtgt8()
        }
    }


    private val hyyhjuujuj = MutableLiveData<CountryCodeJS>()



    private val gt5g5hy8hy48 = MutableLiveData<GeoDev>()
    val gt5t5h84hy448: LiveData<GeoDev>
        get() = gt5g5hy8hy48

    private fun gijtgtiogtjgtjjgtigt(gt2gt2gt5gt8: String) {
        ggt2gtgt6gtg5ttg.postValue(gt2gt2gt5gt8)
    }


    private val gtgtgt5h8h4yy48 = MutableLiveData<String>()
    val gt2gt3tg2gt: LiveData<String>
        get() = gtgtgt5h8h4yy48




    private val ggt2gtgt6gtg5ttg = MutableLiveData<String?>()
    val gt2gt2tggttg5: LiveData<String?>
        get() = ggt2gtgt6gtg5ttg


    fun gt5tg5gt5gt5gt(gtgt3gtgt2gt2t5: Context) {
        AppsFlyerLib.getInstance()
            .init(APPS_CODE, ghy2hy2hyhy5hyhy8y, gt5gtgt8gt84gt)
        AppsFlyerLib.getInstance().start(gtgt3gtgt2gt2t5)
    }

    fun gtgt2gt2gt2gt(gt2t32gt2gt5: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            gt2t32gt2gt5
        ) { data: AppLinkData? ->
            data?.let {
                val gt2gt2ggt5gttg = data.targetUri?.host.toString()
                gt5gt5hyh8y.edit().putString("deepSt", gt2gt2ggt5gttg).apply()
            }
        }
    }


    suspend fun gtgt2tgtgt65gt5gt() {
        hy5h5ujuj8ju.postValue(ghyhyjuuj6ju6uj.gttggtgt().body())
        getDevDataggtgtgtgt()
    }

    suspend fun getDevDataggtgtgtgt() {
        gt5g5hy8hy48.postValue(gt5tg6gt5gt.ggtgtgtgtgt().body())
    }

    private val ghy2hy2hyhy5hyhy8y = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val gtgtgtgt5gtgt5 = data?.get("campaign").toString()
            gtgtgt5h8h4yy48.postValue(gtgtgtgt5gtgt5)

            val gt2gt2gtgt8gt = Bundle()
            val gtt22hy5hyhy8 = FirebaseAnalytics.getInstance(gt5gtgt8gt84gt.applicationContext)
            var gt2tg2gtgt5gt = "opened_firstly"
            when (data?.get(AFInAppEventParameterName.AF_CHANNEL).toString()) {
                "ACI_Search" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.ACHIEVE_LEVEL).setDescription("ACI_Search")
                        .logEvent(gt5gtgt8gt84gt.applicationContext)
                    gt2tg2gtgt5gt = "first_open_s"
                    gtt22hy5hyhy8.logEvent(gt2tg2gtgt5gt, gt2gt2gtgt8gt)
//                    Event.buildWithEventName("ACI_Search").send()

//                    Event.buildWithEventType(EventType.ACHIEVEMENT)
//                        .setName("ACI_Search").send()
                }
                "ACI_Youtube" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.SHARE).setDescription("ACI_Youtube")
                        .logEvent(gt5gtgt8gt84gt.applicationContext)
                    gt2tg2gtgt5gt = "first_open_y"
                    gtt22hy5hyhy8.logEvent(gt2tg2gtgt5gt, gt2gt2gtgt8gt)

//                    Event.buildWithEventType(EventType.SEARCH)
//                        .setName("ACI_Youtube").send()
                }
                "ACI_Display" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.RATE).setDescription("ACI_Display")
                        .logEvent(gt5gtgt8gt84gt.applicationContext)
                    gt2tg2gtgt5gt = "first_open_d"
                    gtt22hy5hyhy8.logEvent(gt2tg2gtgt5gt, gt2gt2gtgt8gt)
//                    Event.buildWithEventType(EventType.RATING)
//                        .setName("ACI_Display").send()
                }

                else -> {
//                    Event.buildWithEventType(EventType.AD_VIEW)
//                        .setName("NoChannel").send()

                    BranchEvent(BRANCH_STANDARD_EVENT.VIEW_AD).setDescription("NoChannel")
                        .logEvent(gt5gtgt8gt84gt.applicationContext)
                    Log.d("Branch Check", "I'm here, branch bitch! No source though")
                }

            }

            gtt22hy5hyhy8.logEvent(gt2tg2gtgt5gt, gt2gt2gtgt8gt)
        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun gt2gtgt5gtgt8() {
        val gtgt5gtgt8gt8 = AdvertisingIdClient(gt5gtgt8gt84gt)
        gtgt5gtgt8gt8.start()
        val gt2gt2gt5gt8 = gtgt5gtgt8gt8.info.id.toString()
        gijtgtiogtjgtjjgtigt(gt2gt2gt5gt8)
    }

    private val gtgt226gt5gt = MutableLiveData<String>()
    val deepS: LiveData<String>
        get() = gtgt226gt5gt


    private val hy5h5ujuj8ju = MutableLiveData<CountryCodeJS>()
    val gt95hy5yhhy98: LiveData<CountryCodeJS>
        get() = hy5h5ujuj8ju



}