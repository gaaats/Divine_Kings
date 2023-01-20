package com.ferrero.app.gaamer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ferrero.app.R

class GameGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_game)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        onDestroy()
    }
}