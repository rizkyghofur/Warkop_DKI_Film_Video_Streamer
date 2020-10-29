package com.rizkyghofur.warkopdkifilmvideostreamer;

import android.os.Bundle;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Player extends YouTubeBaseActivity {

    private String key;
    private String KEY_NAME = "Key";
    private MyPlayerStateChangeListener playerStateChangeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_player);

        playerStateChangeListener = new MyPlayerStateChangeListener();

        YouTubePlayerView youTubePlayerView =
                (YouTubePlayerView) findViewById(R.id.player);

        youTubePlayerView.initialize("YOUR API KEY",
                new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                                        YouTubePlayer youTubePlayer, boolean b) {

                        // do any work here to cue video, play video, etc.
                        youTubePlayer.setFullscreen(true);
                        youTubePlayer.setShowFullscreenButton(false);
                        youTubePlayer.setPlayerStateChangeListener(playerStateChangeListener);

                        Bundle extras = getIntent().getExtras();
                        key = extras.getString(KEY_NAME);
                        youTubePlayer.loadVideo(key);
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                        YouTubeInitializationResult youTubeInitializationResult) {

                    }

                });
    }

        private final class MyPlayerStateChangeListener implements YouTubePlayer.PlayerStateChangeListener {

            @Override
            public void onLoading() {
                // Called when the player is loading a video
                // At this point, it's not ready to accept commands affecting playback such as play() or pause()
            }

            @Override
            public void onLoaded(String s) {
                // Called when a video is done loading.
                // Playback methods such as play(), pause() or seekToMillis(int) may be called after this callback.
            }

            @Override
            public void onAdStarted() {
                // Called when playback of an advertisement starts.
            }

            @Override
            public void onVideoStarted() {
                // Called when playback of the video starts.
            }

            @Override
            public void onVideoEnded() {
                // Called when the video reaches its end.
                finish();
            }

            @Override
            public void onError(YouTubePlayer.ErrorReason errorReason) {
                // Called when an error occurs.
            }
        }
}