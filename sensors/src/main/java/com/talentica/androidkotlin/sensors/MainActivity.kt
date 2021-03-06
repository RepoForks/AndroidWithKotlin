package com.talentica.androidkotlin.sensors

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private var compass: Compass? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        compass = Compass(this)
        compass!!.arrowView = findViewById<ImageView>(R.id.main_image_hands)
    }

    override fun onResume() {
        super.onResume()
        compass!!.start()
    }

    override fun onPause() {
        super.onPause()
        compass!!.stop()
    }

    companion object {
        private val TAG = "CompassActivity"
    }

}

