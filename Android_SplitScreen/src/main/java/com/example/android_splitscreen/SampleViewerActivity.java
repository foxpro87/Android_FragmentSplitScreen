package com.example.android_splitscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SampleViewerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            finish();
//            return;
//        }

        setContentView(R.layout.image_viewer_activity);
        Intent launchingIntent = getIntent();
        int index = launchingIntent.getIntExtra("index", 0);
        SampleViewerFragment viewer = (SampleViewerFragment) getFragmentManager()
                .findFragmentById(R.id.image_viewer_fragment);
        viewer.update(index);

    }


    
}
