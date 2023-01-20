package com.ferrero.app.fraggm


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.ferrero.app.R
import com.ferrero.app.databinding.FragmentStarrtttBinding
import kotlinx.coroutines.delay
import kotlin.random.Random

class StarrtttFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            gtihththihgthigtugt()
            oggtgtihgthgtiigthgthugt()

        } catch (e: Exception){
            efrfrgtgttg5()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun oggtgtihgthgtiigthgthugt() {
        binding.imgEl2.setOnClickListener {
            gtkgtkgtktg()
        }
    }

    private fun gtihththihgthigtugt() {
        binding.imgEl1.setOnClickListener {
            gtkgtkgtktg()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentStaaartBinding = FragmentStarrtttBinding.inflate(inflater, container, false)
        return binding.root
    }

    private var fragmentStaaartBinding: FragmentStarrtttBinding? = null
    private val binding get() = fragmentStaaartBinding ?: throw RuntimeException("FragmentStarrtttBinding = null")



    private fun gtkgtkgtktg() {
        val num = Random.nextInt(from = 200, until = 1000)
        lifecycleScope.launchWhenCreated {
            tgjoiigthgthgthgthgtgtui()
            gtogtjgtihgthgtuhgthugt(num)
            gtigtuhgthgtughugthgtutgh()
            gfpgtijojjgtigtjigtjgti()
        }

    }

    private suspend fun gtigtuhgthgtughugthgtutgh() {
        delay(2600)
    }

    private fun tgjoiigthgthgthgthgtgtui() {
        binding.imgEl1.isEnabled = false
        gtjojgtojgtjgtjgtjgtjgtj()
    }

    private fun gtjojgtojgtjgtjgtjgtjgtj() {
        binding.imgEl2.isEnabled = false
    }

    private fun gtogtjgtihgthgtuhgthugt(num: Int) {
        Toast.makeText(requireContext(), "User get ${num} points!", Toast.LENGTH_SHORT).show()
    }

    private fun gfpgtijojjgtigtjigtjgti() {
        tggthgthgtuhhguthgthugt()
    }

    private fun tggthgthgtuhhguthgthugt() {
        findNavController().navigate(R.id.action_starrtttFragment_to_fastFinishFragment)
    }

    override fun onDestroy() {
        fragmentStaaartBinding = null
        super.onDestroy()
    }

    private fun efrfrgtgttg5() {
        Toast.makeText(
            requireContext(),
            "Error 222...",
            Toast.LENGTH_SHORT
        ).show()
        hkyhykhkykhy()
    }

    private fun hkyhykhkykhy() {
        requireActivity().onBackPressed()
    }
}