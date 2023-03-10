package com.tocaboca.tocalifeworldy.giojgtiojgtjiotg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tocaboca.tocalifeworldy.R
import com.tocaboca.tocalifeworldy.defrggtgt.DadadadaClass
import com.tocaboca.tocalifeworldy.deojfrjfrji.IJfiuifrf
import com.tocaboca.tocalifeworldy.fgojigtjiotgji.OKfrkfrkorf
import com.tocaboca.tocalifeworldy.frkgtogtko.MainActivity
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SeccicicicicActivity2 : AppCompatActivity() {


    private fun JIFjirfjirfjijifr(hy59hy5hy95hy: OKfrkfrkorf) {
        DadadadaClass.ju5uj5ujuj.put("GEO", hy59hy5hy95hy.countryCode)
        startActivity(Intent(this, MainActivity::class.java))
    }

    private var gtkogtkkk: CompositeDisposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccicicicic2)

        gtkogtkkk = CompositeDisposable()


        val hy59hy59hy59hy2ju2ju = Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(IJfiuifrf.Nnffrgji::class.java)


        gtkogtkkk?.add(
            hy59hy59hy59hy2ju2ju.gtoigtogtj()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ response -> JIFjirfjirfjijifr(response) }, { t -> gtgtkogtkogtkogtk(t) })
        )
    }

    private fun gtgtkogtkogtkogtk(t: Throwable) {
        gjigtjitgigtjigtjigt(t)
    }

    private fun gjigtjitgigtjigtjigt(t: Throwable) {
        Toast.makeText(this, t.message, Toast.LENGTH_SHORT).show()
    }
}