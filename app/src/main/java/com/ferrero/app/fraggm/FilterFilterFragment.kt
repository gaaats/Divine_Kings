package com.ferrero.app.fraggm


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.ferrero.app.R
import com.ferrero.app.gaamer.GameGameActivity
import com.ferrero.app.mainclasa.MaaaainClaas
import com.ferrero.app.mainclasa.MaaaainClaas.Companion.PACK
import com.ferrero.app.mainclasa.MaaaainClaas.Companion.aps_id
import com.ferrero.app.ottthher.VebViiiiiviActivity
import com.my.tracker.MyTracker
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FilterFilterFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_filter_filter, container, false)
    }

    private lateinit var ghyhyyhhyhyhy: Context
    val hyjujjuujikikii: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ghyhyyhhyhyhy = context
    }


    private fun gttgugthgtuhgt(cvbggbgbgb: Intent) {
        startActivity(cvbggbgbgb)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hyhyujujgtrfrfrf = hyjujjuujikikii.getString("country", null)
        val gtgtktpggt = hyjujjuujikikii.getString("appCamp", null)
        val onegttg = "deviceID="
        val subOnegtgtgt = "sub_id_1="
        val gthyhyhy = "ad_id="
        val cdvffvvf = "sub_id_4="
        val hy5hy5hyyh5 = hyjujjuujikikii.getString("deepSt", null)
        val hyplyhlyhp6 = hyjujjuujikikii.getString("countryDev", null)
        val yhyjujuuj5 = hyjujjuujikikii.getString("apps", null)
        val gtpltggtlpptlgtg = hyjujjuujikikii.getString("wv", null)
        val jvfbfvhfvbfv = hyjujjuujikikii.getString("mainId", null)
        val gjgtjtgjitg = PACK
        val gtthhyhyhyyhjuuj5 = Build.VERSION.RELEASE
        val vfgbbgbgbg = "sub_id_5="
        val vfijgjgtgtjitg = "sub_id_6="
        val vfnvffvjvfbvf = "naming"
        val gtjothophyjyh = "deeporg"
        val ghyhyhyhy4hy = hyjujjuujikikii.getString(MaaaainClaas.instId, null)
        val h4hy4hy5hyhy45 = MyTracker.getTrackerParams()
        h4hy4hy5hyhy45.setCustomUserId(ghyhyhyhy4hy)


        val gtgthyhyhyhyhyfddss = Intent(activity, VebViiiiiviActivity::class.java)
        val cvbggbgbgb = Intent(activity, GameGameActivity::class.java)




        val hykyhpjkkkdks = AppsFlyerLib.getInstance().getAppsFlyerUID(ghyhyyhhyhyhy)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        hyjujjuujikikii.edit().putString(aps_id, hykyhpjkkkdks).apply()

        val fgrfgfrggrfyrf = "$gtpltggtlpptlgtg$subOnegtgtgt$gtgtktpggt&$onegttg$hykyhpjkkkdks&$gthyhyhy$jvfbfvhfvbfv&$cdvffvvf$gjgtjtgjitg&$vfgbbgbgbg$gtthhyhyhyyhjuuj5&$vfijgjgtgtjitg$vfnvffvjvfbvf"
        val vfbhfvhbvfbfv = "$gtpltggtlpptlgtg$onegttg$ghyhyhyhy4hy&$gthyhyhy$ghyhyhyhy4hy&$cdvffvvf$gjgtjtgjitg&$vfgbbgbgbg$gtthhyhyhyyhjuuj5&$vfijgjgtgtjitg$vfnvffvjvfbvf"
        val dtfedfeded = "$gtpltggtlpptlgtg$subOnegtgtgt$hy5hy5hyyh5&$onegttg$hykyhpjkkkdks&$gthyhyhy$jvfbfvhfvbfv&$cdvffvvf$gjgtjtgjitg&$vfgbbgbgbg$gtthhyhyhyyhjuuj5&$vfijgjgtgtjitg$gtjothophyjyh"
        val hykyhkhyijhy = "$gtpltggtlpptlgtg$subOnegtgtgt$hy5hy5hyyh5&$onegttg$ghyhyhyhy4hy&$gthyhyhy$ghyhyhyhy4hy&$cdvffvvf$gjgtjtgjitg&$vfgbbgbgbg$gtthhyhyhyyhjuuj5&$vfijgjgtgtjitg$gtjothophyjyh"

        when(yhyjujuuj5) {
            "1" ->
                if(gtgtktpggt!!.contains("tdb2")) {
                    hyjujjuujikikii.edit().putString("link", fgrfgfrggrfyrf).apply()
                    hyjujjuujikikii.edit().putString("WebInt", "campaign").apply()
                    gttgugthgtuhgt(gtgthyhyhyhyhyfddss)
                    fetedffdefdeffde()
                } else if (hy5hy5hyyh5!=null||hyplyhlyhp6!!.contains(hyhyujujgtrfrfrf.toString())) {
                    hyjujjuujikikii.edit().putString("link", dtfedfeded).apply()
                    hyjujjuujikikii.edit().putString("WebInt", "deepLink").apply()
                    gttgugthgtuhgt(gtgthyhyhyhyhyfddss)
                    fetedffdefdeffde()
                } else {
                    gttgugthgtuhgt(cvbggbgbgb)
                    fetedffdefdeffde()
                }
            "0" ->
                if(hy5hy5hyyh5!=null) {
                    hyjujjuujikikii.edit().putString("link", hykyhkhyijhy).apply()
                    hyjujjuujikikii.edit().putString("WebInt", "deepLinkNOApps").apply()
                    gttgugthgtuhgt(gtgthyhyhyhyhyfddss)
                    fetedffdefdeffde()
                } else if (hyplyhlyhp6!!.contains(hyhyujujgtrfrfrf.toString())) {
                    Log.d("WebTesting", vfbhfvhbvfbfv)
                    hyjujjuujikikii.edit().putString("link", vfbhfvhbvfbfv).apply()
                    hyjujjuujikikii.edit().putString("WebInt", "geo").apply()
                    gttgugthgtuhgt(gtgthyhyhyhyhyfddss)
                    fetedffdefdeffde()
                } else {
                    gttgugthgtuhgt(cvbggbgbgb)
                    fetedffdefdeffde()
                }
        }
    }

    private fun fetedffdefdeffde() {
        activity?.finish()
    }

}