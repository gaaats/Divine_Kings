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


class CouuntryCountryFragment : Fragment() {

    val gtgtggtgt: SharedPreferences by inject(named("SharedPreferences"))
    val hyhyyhyhyh by activityViewModel<ViMod>(named("MainModel"))

    lateinit var country: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_couuntry_country, container, false)
    }

    private lateinit var gttgtggttgtg: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gttgtggttgtg = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gijtotjgitjgjjtgjt()
    }

    private fun gijtotjgitjgjjtgjt() {
        hyhyyhyhyh.gt95hy5yhhy98.observe(viewLifecycleOwner) {
            if (it != null) {
                country = it.cou
                gtgtggtgt.edit().putString("country", country).apply()
                jogjgtjogtjtgjgtj()
            }
        }
    }

    private fun jogjgtjogtjtgjgtj() {
        gtjigjttgjgtjjgt()
    }

    private fun gtjigjttgjgtjjgt() {
        findNavController().navigate(R.id.action_couuntryCountryFragment_to_secondSecondMainFragment)
    }
}