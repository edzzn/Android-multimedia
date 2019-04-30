package com.edzzn.multimedia;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView mVideoView;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoView =(VideoView)findViewById(R.id.surface_view);
        //de forma alternativa si queremos un streaming usar
        mVideoView.setVideoURI(Uri.parse("https://sample-videos.com/video123/mp4/720/big_buck_bunny_720p_1mb.mp4"));
            //mVideoView.setVideoPath("/mnt/sdcard/video.mp4");
        mVideoView.start();
        mVideoView.requestFocus();
    }
}
