package com.ferrero.app.fraggm


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ferrero.app.R
import com.ferrero.app.vieeevmod.ViMod
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class MainMainFragment : Fragment() {
    private lateinit var gtjgtjtgjgt: Context

    val ggttggt by activityViewModel<ViMod>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_main, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtjgtjtgjgt=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fruirfhrfhrfhhrf()

        frhrfhfrhhfrhuffrhfr()

    }

    private fun fruirfhrfhrfhhrf() {
        ggttggt.gtgt2gt2gt2gt(gtjgtjtgjgt)
    }

    private fun frhrfhfrhhfrhuffrhfr() {
        frrfjfjrfifjrjirf()
    }

    private fun frrfjfjrfifjrjirf() {
        findNavController().navigate(R.id.action_mainMainFragment_to_couuntryCountryFragment)
    }
}