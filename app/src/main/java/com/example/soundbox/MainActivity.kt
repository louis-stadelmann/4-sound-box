package com.example.soundbox

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlaynSong = findViewById<Button>(R.id.btnPlaySong)

        btnPlaynSong.setOnClickListener {
            val randomNumber = Random.nextInt(5)
            val songToPlayUri = when(randomNumber) {
                0 -> R.raw.beep
                1 -> R.raw.button_pressed
                2 -> R.raw.click
                3 -> R.raw.click2
                4 -> R.raw.ping
                else -> R.raw.switch_sound
            }

            val mediaPlayer = MediaPlayer.create(this, songToPlayUri)
            mediaPlayer.start()
        }
    }
}