package com.tocaboca.tocalifeworldy.frjirfjigtjigt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldy.R
import com.tocaboca.tocalifeworldy.databinding.FragmentGaaaaaaaaa222Binding


class Gaaaaaaaaa222Fragment : Fragment() {

    override fun onDestroy() {
        gaammuuu2Binding = null
        super.onDestroy()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            tgjgtitgijgtjigtjigtjigti()

        } catch (e: Exception) {
            Toast.makeText(requireContext(), "Error", Toast.LENGTH_SHORT).show()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun tgjgtitgijgtjigtjigtjigti() {
        binding.btnPlayGameeee.setOnClickListener {
            gtgtifrrfgtgttg()
        }
    }

    private fun gtgtifrrfgtgttg() {
        findNavController().navigate(R.id.action_gaaaaaaaaa222Fragment_to_gaamamamtmtmtm1111Fragment)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gaammuuu2Binding = FragmentGaaaaaaaaa222Binding.inflate(inflater, container, false)
        return binding.root
    }


    private var gaammuuu2Binding: FragmentGaaaaaaaaa222Binding? = null
    private val binding
        get() = gaammuuu2Binding
            ?: throw RuntimeException("FragmentGaaaaaaaaa222Binding = null")
}