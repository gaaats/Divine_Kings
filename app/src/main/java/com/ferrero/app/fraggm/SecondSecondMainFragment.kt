package com.ferrero.app.fraggm


import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ferrero.app.R
import com.ferrero.app.vieeevmod.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SecondSecondMainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_second_main, container, false)
    }

    val hyhyhyhyhy5 by activityViewModel<ViMod>(named("MainModel"))
    lateinit var gtgt5hy5hy6: String
    lateinit var wv65558: String
    lateinit var apps265: String
    private lateinit var mContext2655: Context

    val shareP6558: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext2655 = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gjtgtigtgthgthtghigtigt()

        gtgthgtiuhtgihtghhhdegfeded()
    }

    private fun gtgthgtiuhtgihtghhhdegfeded() {
        hyhyhyhyhy5.gt5t5h84hy448.observe(viewLifecycleOwner) {
            if (it != null) {

                gtgt5hy5hy6 = it.geo
                apps265 = it.appsChecker
                wv65558 = it.view

                iogtjitgjgtgthgtu()

                gjtigtjgtijgt()
            }
        }
    }

    private fun gjtgtigtgthgthtghigtigt() {
        hyhyhyhyhy5.gt2gt2tggttg5.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                shareP6558.edit().putString("mainId", main).apply()
            }
        }
    }

    private fun iogtjitgjgtgthgtu() {
        ogthgtuhgthtghu()
        gttghuuthgthgt()
        gjtitgijgtjgtjigt()
    }

    private fun gttghuuthgthgt() {
        shareP6558.edit().putString("apps", apps265).apply()
    }

    private fun ogthgtuhgthtghu() {
        shareP6558.edit().putString("countryDev", gtgt5hy5hy6).apply()
    }

    private fun gjtitgijgtjgtjigt() {
        shareP6558.edit().putString("wv", wv65558).apply()
    }

    private fun gjtigtjgtijgt() {
        findNavController().navigate(R.id.action_secondSecondMainFragment_to_prePreFilterFragment)
    }
}