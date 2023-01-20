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


class PrePreFilterFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        bhnmjjm = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pre_pre_filter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gttgthyhyhy = cdvfedde.getString("apps", null)
        val hyyhyhyhhyhy = cdvfedde.getString("appCamp", null)

        if (gttgthyhyhy=="1" &&hyyhyhyhhyhy == null) {
            hyhyhyhyhy.gt5tg5gt5gt5gt(bhnmjjm)
            hyhyhyhyhy.gt2gt3tg2gt.observe(viewLifecycleOwner) {
                if (it != null) {
                    vgbnnhhn = it.toString()
                    cdvfedde.edit().putString("appCamp", vgbnnhhn).apply()
                    frhrfhfrrfhfrhrf()
                }
            }
        } else {
            frhrfhfrrfhfrhrf()
        }
    }

    private fun frhrfhfrrfhfrhrf() {
        hgthhgt()
    }

    private fun hgthhgt() {
        ogtogtjtgigtjgt()
    }

    private fun ogtogtjtgigtjgt() {
        frygfryfgrgtrgfrfr()
    }

    private fun frygfryfgrgtrgfrfr() {
        frufhrfruhrfhhfr()
    }

    private fun frufhrfruhrfhhfr() {
        rfggthhgthtgh()
    }

    private fun rfggthhgthtgh() {
        findNavController().navigate(R.id.action_prePreFilterFragment_to_filterFilterFragment)
    }

    val hyhyhyhyhy by activityViewModel<ViMod>(named("MainModel"))
    val cdvfedde: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var vgbnnhhn: String
    private lateinit var bhnmjjm: Context

}