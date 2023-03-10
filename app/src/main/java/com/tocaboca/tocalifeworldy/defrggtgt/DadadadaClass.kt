package com.tocaboca.tocalifeworldy.defrggtgt

import android.app.Application
import com.my.tracker.MyTracker
import com.onesignal.OneSignal

class DadadadaClass:Application() {

    companion object {
        var ju5uj5ujuj: HashMap<String, String> = HashMap()
        val onennenesss = "864a39d6-99f2-484e-8715-6dfad29b46cf"
        val agthyhyhyhyMyTracker = "34090291861044972134"
    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        rfgjgtjiigtgtjigtijgti()
        val hy59hy59hy5hy5 = MyTracker.getTrackerConfig()
        hy59hy59hy5hy5.isTrackingLaunchEnabled = true
        MyTracker.initTracker(agthyhyhyhyMyTracker, this)
    }

    private fun rfgjgtjiigtgtjigtijgti() {
        OneSignal.setAppId(onennenesss)
    }
}