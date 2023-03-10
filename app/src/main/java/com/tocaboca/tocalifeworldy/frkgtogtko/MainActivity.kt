package com.tocaboca.tocalifeworldy.frkgtogtko

import android.app.Application
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.tocaboca.tocalifeworldy.R
import com.tocaboca.tocalifeworldy.defrggtgt.DadadadaClass.Companion.ju5uj5ujuj
import com.tocaboca.tocalifeworldy.frjirfijgtjigt.FilltttrriririoActivity2
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(ju5uj5ujuj["AppsCh"] == "1") {
            hyjujuujujkiikikfd(application, this)
        } else {
            startActivity(Intent(this, FilltttrriririoActivity2::class.java))
        }

        GlobalScope.launch {
            val hy9uj5ju599k5ki5k = AdvertisingIdClient.getAdvertisingIdInfo(applicationContext).id
            ju5uj5ujuj["GAID"] = hy9uj5ju599k5ki5k.toString()
        }

    }

    fun hyjujuujujkiikikfd(hy95yh59hy: Application, nhnhjujgtfrfr: Context){
        AppsFlyerLib.getInstance()
            .init("8rkHKDCi9dpK7MhDkcWKER", vghy5h95y, hy95yh59hy)
        AppsFlyerLib.getInstance().start(nhnhjujgtfrfr)
    }

    private val vghy5h95y  = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val gt59hy5hy59hy = Observable.just(data?.get("campaign").toString())
            val hy5ju5ju5uj5k9i: Observer<String> = object : Observer<String> {
                override fun onSubscribe(d: Disposable) {
                    Log.d("ObseObse","onSubscribe")
                }
                override fun onError(e: Throwable) {
                    Log.d("ObseObse","onError");
                }
                override fun onComplete() {
                    Log.d("ObseObse","onComplete");


                    startActivity(Intent(this@MainActivity, FilltttrriririoActivity2::class.java))
                    finish()
                }
                override fun onNext(t: String) {
                    ju5uj5ujuj["AppsData"] = t
                    Log.d("ObseObse", ju5uj5ujuj["AppsData"].toString())
                }
            }
            gt59hy5hy59hy.subscribe(hy5ju5ju5uj5k9i)
        }
        override fun onConversionDataFail(error: String?) {
        }
        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }
        override fun onAttributionFailure(error: String?) {
        }
    }

}