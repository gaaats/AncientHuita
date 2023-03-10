package com.tocaboca.tocalifeworldy.frjirfijgtjigt

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tocaboca.tocalifeworldy.frjirfjigtjigt.GaamamemeActivity2
import com.tocaboca.tocalifeworldy.R
import com.tocaboca.tocalifeworldy.sfrrfgtgt.VebfrugthgActivity2
import com.tocaboca.tocalifeworldy.defrggtgt.DadadadaClass.Companion.ju5uj5ujuj
import org.json.JSONException
import org.json.JSONObject

class FilltttrriririoActivity2 : AppCompatActivity() {

    private fun hyhyujujkkiikikik() {
        startActivity(Intent(this, VebfrugthgActivity2::class.java))
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filltttrriririo2)
        hy59hy59hy59hy()
    }

    private fun fgriojgtojgtjigtj() {
        finish()
    }


    fun hy59hyhy955(frjifrjirfjigt: String) {
        OneSignal.setExternalUserId(
            frjifrjirfjigt,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val ujujgtrfrfrfrf = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $ujujgtrfrfrfrf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val gtgthyhyhyhy =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $gtgthyhyhyhy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val dderffgrgtgtgt = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $dderffgrgtgtgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun hy59hy59hy59hy() {

        val h59hy59hy59hy = ju5uj5ujuj["AppsData"]
        val hyyh2h2hy = ju5uj5ujuj["FBData"]
        val hy59hy59hy59y = ju5uj5ujuj["GAID"]
        val hy59hy59hy59 = ju5uj5ujuj["View"]
        val cvfgtgtgt = ju5uj5ujuj["GeoHose"]
        val gthyhyhyhy = ju5uj5ujuj["GEO"]
        val ju2ju2uj2j2u = ju5uj5ujuj["AppsCh"]
        val h2ju59uj5ju95 = MyTracker.getTrackerParams()

        h2ju59uj5ju95.setCustomUserId(hy59hy59hy59y)
        hy59hyhy955(hy59hy59hy59y.toString())


        val hy59hy59hy59hy59 = getSharedPreferences("NEWPR", Context.MODE_PRIVATE)

        val hyuj2ik2ikki = MyTracker.getInstanceId(applicationContext)

        val h255k5ik9l5olool = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val hy5h5fgr5fr5dfe = Build.VERSION.RELEASE
        val gt59ju59ju95ju95ju = "sub_id_5="
        val hy5yuj5uju55 = "naming"
        val hy5ju95ju9uj = "orgdeep"
        val vfvgbgbgbgbgbg = "organika"
        val ghh555 = "deep"

        val hhyujuj59 = "sub_id_1="
        val hyhy5hy9 = "ad_id="
        val hy59hy59 = "deviceID="
        val hy59ju5ik5ikik5ik = "sub_id_4="


        var loloolollool = ""

        when (ju2ju2uj2j2u) {
            "1" ->
                if (h59hy59hy59hy != "null") {
                    loloolollool =
                        "$hy59hy59hy59$hhyujuj59$h59hy59hy59hy&$hy59hy59$h255k5ik9l5olool&$hyhy5hy9$hy59hy59hy59y&$hy59ju5ik5ikik5ik$hy5h5fgr5fr5dfe&$gt59ju59ju95ju95ju$hy5yuj5uju55"

                    hy59hy59hy59hy59.edit().putString("link", loloolollool).apply()
                    hy59hy59hy59hy59.edit().putString("ENTRY_CODE", "web").apply()

                    Toast.makeText(this, "${loloolollool}", Toast.LENGTH_SHORT).show()

                    hyhyujujkkiikikik()
                    fgriojgtojgtjigtj()
                } else if (hyyh2h2hy != null || cvfgtgtgt!!.contains(gthyhyhyhy.toString())) {
                    loloolollool =
                        "$hy59hy59hy59$hhyujuj59$hyyh2h2hy&$hy59hy59$h255k5ik9l5olool&$hyhy5hy9$hy59hy59hy59y&$hy59ju5ik5ikik5ik$hy5h5fgr5fr5dfe&$gt59ju59ju95ju95ju$hy5ju95ju9uj"
                    hy59hy59hy59hy59.edit().putString("link", loloolollool).apply()
                    hy59hy59hy59hy59.edit().putString("ENTRY_CODE", "web").apply()

                    Toast.makeText(this, "${loloolollool}", Toast.LENGTH_SHORT).show()

                    hyhyujujkkiikikik()
                    fgriojgtojgtjigtj()
                } else {

                    startActivity(Intent(this, GaamamemeActivity2::class.java))
                    fgriojgtojgtjigtj()
                }
            "0" ->
                if (hyyh2h2hy != null) {
                    loloolollool =
                        "$hy59hy59hy59$hhyujuj59$hyyh2h2hy&$hy59hy59$hyuj2ik2ikki&$hyhy5hy9$hy59hy59hy59y&$hy59ju5ik5ikik5ik$hy5h5fgr5fr5dfe&$gt59ju59ju95ju95ju$ghh555"
                    hy59hy59hy59hy59.edit().putString("link", loloolollool).apply()
                    hy59hy59hy59hy59.edit().putString("ENTRY_CODE", "web").apply()

                    Toast.makeText(this, "${loloolollool}", Toast.LENGTH_SHORT).show()

                    hyhyujujkkiikikik()
                    fgriojgtojgtjigtj()

                } else if (cvfgtgtgt!!.contains(gthyhyhyhy.toString())) {
                    loloolollool = "$hy59hy59hy59$hy59hy59$hyuj2ik2ikki&$hyhy5hy9$hy59hy59hy59y&$hy59ju5ik5ikik5ik$hy5h5fgr5fr5dfe&$gt59ju59ju95ju95ju$vfvgbgbgbgbgbg"
                    hy59hy59hy59hy59.edit().putString("link", loloolollool).apply()
                    hy59hy59hy59hy59.edit().putString("ENTRY_CODE", "web").apply()
                    Toast.makeText(this, "${loloolollool}", Toast.LENGTH_SHORT).show()

                    hyhyujujkkiikikik()
                    fgriojgtojgtjigtj()
                } else {

                    startActivity(Intent(this, GaamamemeActivity2::class.java))
                    fgriojgtojgtjigtj()
                }
        }
    }


}