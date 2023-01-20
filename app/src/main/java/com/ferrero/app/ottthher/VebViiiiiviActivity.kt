package com.ferrero.app.ottthher

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ferrero.app.databinding.ActivityVebViiiiiviBinding
import com.ferrero.app.mainclasa.MaaaainClaas
import com.ferrero.app.mainclasa.MaaaainClaas.Companion.aps_id
import com.ferrero.app.vieeevmod.BeamModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class VebViiiiiviActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gtghyhyyhhyhy = ActivityVebViiiiiviBinding.inflate(layoutInflater)
        setContentView(gtghyhyyhhyhy.root)
        hyujujkiikikik = gtghyhyyhhyhy.veeeWebViewvvvvvvv
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(hyujujkiikikik, true)
        hyjuuikiloollo.gtgtiogtiojgtjijigt(hyujujkiikikik)


        hyujujkiikikik.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (hyjuuikiloollo.gtkgtjogtojjj(url)) {

                        val hyju5uj595uj = Intent(Intent.ACTION_VIEW)
                        hyju5uj595uj.data = Uri.parse(url)
                        startActivity(hyju5uj595uj)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                saveUrl(url)
            }


            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                Toast.makeText(this@VebViiiiiviActivity, description, Toast.LENGTH_SHORT).show()
            }
        }

        hyujujkiikikik.webChromeClient = ChromeClient()
        hyujujkiikikik.loadUrl(gtgtjiogtjigti())
    }

    private lateinit var gtghyhyyhhyhy: ActivityVebViiiiiviBinding
    lateinit var hyujujkiikikik: WebView


    private var hyjuujikkiloolol: ValueCallback<Array<Uri>>? = null
    private var juujkiikilololo: String? = null
    private  val bgbgnhhyyjuuj = 1

    private val hyjuuikiloollo by viewModel<BeamModel>(
        named("BeamModel")
    )

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != bgbgnhhyyjuuj || hyjuujikkiloolol == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var gtgt5tg5gtgt556gt: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (juujkiikilololo != null) {
                    gtgt5tg5gtgt556gt = arrayOf(Uri.parse(juujkiikilololo))
                }
            } else {
                val gt595tg5gt5gt = data.dataString
                if (gt595tg5gt5gt != null) {
                    gtgt5tg5gtgt556gt = arrayOf(Uri.parse(gt595tg5gt5gt))
                }
            }
        }
        hyjuujikkiloolol!!.onReceiveValue(gtgt5tg5gtgt556gt)
        hyjuujikkiloolol = null
        return
    }


    inner class ChromeClient : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            hyjuujikkiloolol?.onReceiveValue(null)
            hyjuujikkiloolol = filePath
            var vgmbmnhmjk: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (vgmbmnhmjk!!.resolveActivity(packageManager) != null) {
                var hylypohykhyjkhy: File? = null
                try {
                    hylypohykhyjkhy = ggktgtjojjji()
                    vgmbmnhmjk.putExtra("PhotoPath", juujkiikilololo)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (hylypohykhyjkhy != null) {
                    juujkiikilololo = "file:" + hylypohykhyjkhy.absolutePath
                    vgmbmnhmjk.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(hylypohykhyjkhy)
                    )
                } else {
                    vgmbmnhmjk = null
                }
            }
            val gtiojjgtojgtogt = Intent(Intent.ACTION_GET_CONTENT)
            gtiojjgtojgtogt.addCategory(Intent.CATEGORY_OPENABLE)
            gtiojjgtojgtogt.type = "image/*"
            val gtjbngnjtg: Array<Intent?> = vgmbmnhmjk?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val gtkgtojjgiogt = Intent(Intent.ACTION_CHOOSER)
            gtkgtojjgiogt.putExtra(Intent.EXTRA_INTENT, gtiojjgtojgtogt)
            gtkgtojjgiogt.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            gtkgtojjgiogt.putExtra(Intent.EXTRA_INITIAL_INTENTS, gtjbngnjtg)
            startActivityForResult(gtkgtojjgiogt, bgbgnhhyyjuuj)
            return true
        }

        fun ggktgtjojjji(): File? {
            val timeStampgttgtggt = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val imageFileNameggtgtgtgt = "JPEG_" + timeStampgttgtggt + "_"
            val storageDirgtgtgtgt = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                imageFileNameggtgtgtgt,
                ".jpg",
                storageDirgtgtgtgt
            )
        }
    }

    private fun gtgtjiogtjigti(): String {

        val spooooooon = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)


        val gtjiotgiojgtijgt = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)

        val jigtjtgjgtgt = gtjiotgiojgtijgt.getString("link", null)
        val gtjogtgtugthigth = gtjiotgiojgtijgt.getString(aps_id, null)
        val vbhjvfbhjfvbhjrffr = gtjiotgiojgtijgt.getString(MaaaainClaas.instId, null)


        val frhrhfhfrhurf = gtjiotgiojgtijgt.getString("WebInt", null)


        when (frhrhfhfrhurf) {
            "campaign" -> {
                gtjtghgthugtuhg(gtjogtgtugthigth)
            }
            "deepLink" -> {
                hyjuuikiloollo.giogtgtjiogt(gtjogtgtugthigth.toString())
            }
            "deepLinkNOApps" -> {
                hyjuuikiloollo.giogtgtjiogt(vbhjvfbhjfvbhjrffr.toString())
            }
            "geo" -> {
                gtgtigtgthgthit(vbhjvfbhjfvbhjrffr)
            }

        }

        Log.d("lolo", "link is ${jigtjtgjgtgt}")

        return spooooooon.getString("SAVED_URL", jigtjtgjgtgt).toString()
    }

    private fun gtjtghgthugtuhg(gtjogtgtugthigth: String?) {
        hyjuuikiloollo.giogtgtjiogt(gtjogtgtugthigth.toString())
    }

    private fun gtgtigtgthgthit(vbhjvfbhjfvbhjrffr: String?) {
        hyjuuikiloollo.giogtgtjiogt(vbhjvfbhjfvbhjrffr.toString())
    }

    private var juujujikikikgfrrf = false
    override fun onBackPressed() {
        if (hyujujkiikikik.canGoBack()) {
            if (juujujikikikgfrrf) {
                hyujujkiikikik.stopLoading()
                hyujujkiikikik.loadUrl(urlfififif)
            }
            this.juujujikikikgfrrf = true
            hyujujkiikikik.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                juujujikikikgfrrf = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    var urlfififif = ""
    fun saveUrl(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }

}

