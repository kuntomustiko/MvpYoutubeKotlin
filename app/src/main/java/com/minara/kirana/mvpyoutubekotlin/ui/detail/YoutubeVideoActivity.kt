package com.minara.kirana.mvpyoutubekotlin.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minara.kirana.mvpyoutubekotlin.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import kotlinx.android.synthetic.main.activity_youtube_video.*


// TODO 19 membuat YoutubeVideoActivity
class YoutubeVideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube_video)

        // TODO 21 memasang library untuk memutar vide yt dan menangkap intent
        lifecycle.addObserver(yt_player_view)

        yt_player_view.addYouTubePlayerListener(object  : AbstractYouTubePlayerListener(){
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(intent.getStringExtra("id"),0f)
            }
        })
    }
}
