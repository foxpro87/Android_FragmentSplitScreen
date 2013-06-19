package com.example.android_splitscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity implements SampleListFragment.ListItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onListItemSelected(int index) {
        SampleViewerFragment imageViewer = (SampleViewerFragment) getFragmentManager().findFragmentById(R.id.image_viewer_fragment);
        if (imageViewer == null || !imageViewer.isInLayout()) {
            Intent showImage = new Intent(getApplicationContext(), SampleViewerActivity.class);
            showImage.putExtra("index", index);

            startActivity(showImage);
        } else {
            imageViewer.update(index);

//            Intent showImage = new Intent(getApplicationContext(), SampleViewerActivity.class);
//            showImage.putExtra("index", index);
//
//            startActivity(showImage);

        }
    }

}
