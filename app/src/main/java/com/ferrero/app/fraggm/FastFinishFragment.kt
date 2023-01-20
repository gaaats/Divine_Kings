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
import com.ferrero.app.databinding.FragmentFastFinishBinding
import kotlinx.coroutines.delay
import kotlin.random.Random


class FastFinishFragment : Fragment() {

    val naaaaaaaaaa = listOf(
        "Jameson",
        "Ian",
        "Everett",
        "Greyson",
        "Wesley",
        "Jeremiah",
        "Hunter",
        "Leonardo",
        "Jordan",
        "Jose",
        "Bennett",
        "Silas",
        "Nicholas",
        "Parker",
        "Beau",
        "Weston",
        "Austin",
        "Connor",
        "Carson",
        "Dominic",
        "Xavier",
        "Jaxson",
        "Jace",
        "Emmett",
        "Adam",
        "Declan",
        "Rowan",
        "Micah",
        "Kayden",
        "Gael",
        "River",
        "Ryder",
        "Kingston",
        "Damian",
        "Sawyer",
        "Luka",
        "Evan",
        "Vincent",
        "Legend",
        "Myles",
        "Harrison"
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            gtihththihgthigtugt()

        } catch (e: Exception){
            efrfrgtgttg5()
        }
        super.onViewCreated(view, savedInstanceState)
    }


    private fun gtihththihgthigtugt() {
        lifecycleScope.launchWhenCreated {
            Toast.makeText(requireContext(), "Your leader is ${naaaaaaaaaa.random()}", Toast.LENGTH_SHORT).show()
            delay(2600)
            findNavController().navigate(R.id.action_fastFinishFragment_to_starrtttFragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentFastFinishBinding = FragmentFastFinishBinding.inflate(inflater, container, false)
        return binding.root
    }

    private var fragmentFastFinishBinding: FragmentFastFinishBinding? = null
    private val binding get() = fragmentFastFinishBinding ?: throw RuntimeException("FragmentFastFinishBinding = null")



    private fun gtkgtkgtktg() {
        val num = Random.nextInt(from = 200, until = 1000)
        lifecycleScope.launchWhenCreated {
            gtogtjgtihgthgtuhgthugt(num)
            gtigtuhgthgtughugthgtutgh()
            gfpgtijojjgtigtjigtjgti()
        }

    }

    private suspend fun gtigtuhgthgtughugthgtutgh() {
        delay(2600)
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
        fragmentFastFinishBinding = null
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