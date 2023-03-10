package com.tocaboca.tocalifeworldy.sfrrfgtgt

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class VebfrugthgActivity2 : AppCompatActivity() {
    fun hyhy95hy59hy() {
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies( fgfghgthgthuigthu, true)
        val hyhy62hy62hy26hy2juujujujuj = fgfghgthgthuigthu.settings
        hyhy62hy62hy26hy2juujujujuj.javaScriptEnabled = true
        hyhy62hy62hy26hy2juujujujuj.useWideViewPort = true
        hyhy62hy62hy26hy2juujujujuj.loadWithOverviewMode = true
        hyhy62hy62hy26hy2juujujujuj.allowFileAccess = true
        hyhy62hy62hy26hy2juujujujuj.domStorageEnabled = true
        hyhy62hy62hy26hy2juujujujuj.userAgentString = hyhy62hy62hy26hy2juujujujuj.userAgentString.replace("; wv", "")
        hyhy62hy62hy26hy2juujujujuj.javaScriptCanOpenWindowsAutomatically = true
        hyhy62hy62hy26hy2juujujujuj.setSupportMultipleWindows(false)
        hyhy62hy62hy26hy2juujujujuj.displayZoomControls = false
        hyhy62hy62hy26hy2juujujujuj.builtInZoomControls = true
        hyhy62hy62hy26hy2juujujujuj.allowFileAccess = true
        hyhy62hy62hy26hy2juujujujuj.allowContentAccess = true
        hyhy62hy62hy26hy2juujujujuj.setSupportZoom(true)
        hyhy62hy62hy26hy2juujujujuj.pluginState = WebSettings.PluginState.ON
        hyhy62hy62hy26hy2juujujujuj.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        hyhy62hy62hy26hy2juujujujuj.cacheMode = WebSettings.LOAD_DEFAULT
        hyhy62hy62hy26hy2juujujujuj.allowContentAccess = true
        hyhy62hy62hy26hy2juujujujuj.mediaPlaybackRequiresUserGesture = false
    }


    private fun ju226k2ik2() {

        val hn2ju5uj955ik = Intent(Intent.ACTION_GET_CONTENT).apply {
            addCategory(Intent.CATEGORY_OPENABLE)
            type = "image/*"
        }
        val ju26ju2ju2 = Intent(Intent.ACTION_CHOOSER).apply {
            putExtra(Intent.EXTRA_INTENT, hn2ju5uj955ik)
            putExtra(Intent.EXTRA_TITLE, "Image Chooser")
        }
        startActivityForResult(Intent.createChooser(ju26ju2ju2, "File Chooser"), gtjigtjigtgtjgtjigt);
    }

    private fun h2j5uj5uj(): String {
        val h22ju2ki2ik = getSharedPreferences("NEWPR",
            Context.MODE_PRIVATE)

        val nhhy5uj95ki5ki5ik = h22ju2ki2ik.getString("link", null)
        Log.d("lolo", nhhy5uj95ki5ki5ik.toString())

        return nhhy5uj95ki5ki5ik.toString()
    }

    private val gtjigtjigtgtjgtjigt = 1
    protected var gtjgtjitgjigtigt: Int = gtjigtjigtgtjgtjigt
    var grvnghugthgthug: ValueCallback<Array<Uri>>? = null

    lateinit var fgfghgthgthuigthu: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fgfghgthgthuigthu = WebView(this)
        hyhy95hy59hy()
        setContentView(fgfghgthgthuigthu)

        fgfghgthgthuigthu.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {

                val ju59ik5ik9 = applicationContext.packageManager
                val hy5hy59ju9uj = nh2n2ju2k2kiki6("org.telegram.messenger", ju59ik5ik9)

                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (hy5hy59ju9uj) {
                        val vfcddsdeded = Intent(Intent.ACTION_VIEW)
                        vfcddsdeded.data = Uri.parse(url)
                        this@VebfrugthgActivity2.startActivity(vfcddsdeded)
                    } else {
                        Toast.makeText(
                            this@VebfrugthgActivity2,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
            }

            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                Toast.makeText(this@VebfrugthgActivity2, description, Toast.LENGTH_SHORT).show()
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
            }
        }

        fgfghgthgthuigthu.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView?,
                filePathCallback: ValueCallback<Array<Uri>>?,
                fileChooserParams: FileChooserParams
            ):Boolean {

                grvnghugthgthug?.onReceiveValue(null)
                grvnghugthgthug = filePathCallback

                try {
                    ju226k2ik2()
                } catch (e: java.lang.Exception) {
                    Toast.makeText(this@VebfrugthgActivity2, e.toString(), Toast.LENGTH_LONG).show()
                }
                return true
            }
        }
        fgfghgthgthuigthu.loadUrl(h2j5uj5uj())
    }



    private fun nh2n2ju2k2kiki6(packageName: String, packageManager: PackageManager): Boolean {
        return try {
            packageManager.getPackageInfo(packageName, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
    }

    var h59hy5uj5juuj5uj = false
    var nh2ju2ju59uj59uj = ""


    override fun onBackPressed() {
        if (fgfghgthgthuigthu.canGoBack()) {
            if (h59hy5uj5juuj5uj) {
                fgfghgthgthuigthu.stopLoading()
                fgfghgthgthuigthu.loadUrl(nh2ju2ju59uj59uj)
            }
            this.h59hy5uj5juuj5uj = true
            fgfghgthgthuigthu.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                h59hy5uj5juuj5uj = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == gtjigtjigtgtjgtjigt && (resultCode == RESULT_OK)) {

            if ((null == grvnghugthgthug )) {
                return;
            } else {
                val gh2hy2hy2hy26hy26: String? = data?.dataString

                if (gh2hy2hy2hy26hy26 != null) {
                    val result = arrayOf(Uri.parse(gh2hy2hy2hy26hy26))
                    grvnghugthgthug?.onReceiveValue(result)
                    grvnghugthgthug = null
                }
            }
        }
    }
}