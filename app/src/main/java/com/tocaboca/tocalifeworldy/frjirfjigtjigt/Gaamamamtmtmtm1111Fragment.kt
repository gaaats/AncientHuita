package com.tocaboca.tocalifeworldy.frjirfjigtjigt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldy.R
import com.tocaboca.tocalifeworldy.databinding.FragmentGaamamamtmtmtm1111Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class Gaamamamtmtmtm1111Fragment : Fragment() {


    private fun ju95juuj95ju() {
        binding.cennttt.setOnClickListener {
            lifecycleScope.launch {
                notVork()
                val hy5hy59hy = Random.nextInt(from = 1000, until = 5000)
                it.isEnabled = false
                it.visibility = View.INVISIBLE
                val tttt = "Points ${hy5hy59hy}"
                gtigtigthgtgt(tttt)
                delay(2000)
                makeVork()
                if (chechgggg()) {
                    gtigtigthgtgt("Game over")
                    fhurhrhgthgthugtgtugt()
                }
            }
        }
    }


    private val ju22ki2ik2ik by lazy {
        listOf(
            binding.cennttt,
            binding.doovn,
            binding.lefyyyy,
            binding.dovnleft,
            binding.dovnleft,
            binding.riightdovn,
        )
    }

    private fun makeVork(){
        ju22ki2ik2ik.forEach {
            it.isEnabled = true
        }
    }
    private fun notVork(){
        ju22ki2ik2ik.forEach {
            it.isEnabled = false
        }
    }

    private fun chechgggg(): Boolean {
        ju22ki2ik2ik.forEach {
            if (it.visibility == View.VISIBLE) return false
        }
        return true
    }

    private fun j5959ikik() {
        binding.dovnleft.setOnClickListener {

            lifecycleScope.launch {
                notVork()
                val hy5hy59hy = Random.nextInt(from = 1000, until = 5000)
                it.isEnabled = false
                it.visibility = View.INVISIBLE
                val tttt = "Points ${hy5hy59hy}"
                gtigtigthgtgt(tttt)
                delay(2000)
                makeVork()
                if (chechgggg()) {
                    gtigtigthgtgt("Game over")
                    fhurhrhgthgthugtgtugt()
                }
            }
        }
    }

    override fun onDestroy() {
        gaammuuu2Binding = null
        super.onDestroy()
    }

    private fun tguthgutbbghbvhbvbbf() {
        gtigtigthgtgt("I have error, try again")
    }


    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            gtggjtijgtijgtigtjigtngtngtngtnj()
        } catch (e: Exception) {
            tguthgutbbghbvhbvbbf()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtggjtijgtijgtigtjigtngtngtngtnj() {
        ju226ki2()
        ju95juuj95ju()
        uiki()
        ju2lolool()
        j5959ikik()
        ki5i959lo5l9o()
    }


    private fun ki5i959lo5l9o() {
        binding.riightdovn.setOnClickListener {
            lifecycleScope.launch {
                notVork()
                val hy5hy59hy = Random.nextInt(from = 1000, until = 5000)
                it.isEnabled = false
                it.visibility = View.INVISIBLE
                val tttt = "Points ${hy5hy59hy}"
                gtigtigthgtgt(tttt)
                delay(2000)
                makeVork()
                if (chechgggg()) {
                    gtigtigthgtgt("Game over")
                    fhurhrhgthgthugtgtugt()
                }
            }
        }
    }

    private fun ju2lolool() {
        binding.dovncenter.setOnClickListener {
            lifecycleScope.launch {
                notVork()
                val hy5hy59hy = Random.nextInt(from = 1000, until = 5000)
                it.isEnabled = false
                it.visibility = View.INVISIBLE
                val tttt = "Points ${hy5hy59hy}"
                gtigtigthgtgt(tttt)
                delay(2000)
                makeVork()
                if (chechgggg()) {
                    gtigtigthgtgt("Game over")
                    fhurhrhgthgthugtgtugt()
                }
            }
        }
    }

    private fun uiki() {
        binding.doovn.setOnClickListener {
            lifecycleScope.launch {
                notVork()
                val hy5hy59hy = Random.nextInt(from = 1000, until = 5000)
                it.isEnabled = false
                it.visibility = View.INVISIBLE
                val tttt = "Points ${hy5hy59hy}"
                gtigtigthgtgt(tttt)
                delay(2000)
                makeVork()
                if (chechgggg()) {
                    gtigtigthgtgt("Game over")
                    fhurhrhgthgthugtgtugt()
                }
            }
        }
    }

    private fun ju226ki2() {
        binding.lefyyyy.setOnClickListener {
            lifecycleScope.launch {
                notVork()
                val hy5hy59hy = Random.nextInt(from = 1000, until = 5000)
                it.isEnabled = false
                it.visibility = View.INVISIBLE
                val tttt = "Points ${hy5hy59hy}"
                gtigtigthgtgt(tttt)
                delay(2000)
                makeVork()
                if (chechgggg()) {
                    gtigtigthgtgt("Game over")
                    fhurhrhgthgthugtgtugt()
                }
            }
        }
    }

    private fun fhurhrhgthgthugtgtugt() {
        findNavController().navigate(R.id.action_gaamamamtmtmtm1111Fragment_to_gaaaaaaaaa222Fragment)
    }

    private fun gtigtigthgtgt(tttt: String) {
        Toast.makeText(requireContext(), tttt, Toast.LENGTH_SHORT).show()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gaammuuu2Binding = FragmentGaamamamtmtmtm1111Binding.inflate(inflater, container, false)
        return binding.root
    }


    private var gaammuuu2Binding: FragmentGaamamamtmtmtm1111Binding? = null
    private val binding
        get() = gaammuuu2Binding
            ?: throw RuntimeException("FragmentFraauu22Binding = null")
}