package com.umc.floclone

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.umc.floclone.databinding.ActivitySongBinding

class SongActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySongBinding
    private var isPlaying = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        with(binding) {
            songDownIb.setOnClickListener {
                finish()
            }

            songMiniplayerIv.setOnClickListener {
                setPlayerStatus(isPlaying)
                isPlaying=!isPlaying
            }

            songPauseIv.setOnClickListener {
                setPlayerStatus(isPlaying)
                isPlaying=!isPlaying
            }
        }

        if (intent.hasExtra("title") && intent.hasExtra("singer")) {
            binding.songMusicTitleTv.text=intent.getStringExtra("title")
            binding.songSingerNameTv.text=intent.getStringExtra("singer")
        }
    }


    private fun setPlayerStatus(isPlaying: Boolean) {
        if (isPlaying) {
            binding.songMiniplayerIv.visibility = View.GONE
            binding.songPauseIv.visibility = View.VISIBLE
        } else {
            binding.songMiniplayerIv.visibility = View.VISIBLE
            binding.songPauseIv.visibility = View.GONE
        }
    }
}