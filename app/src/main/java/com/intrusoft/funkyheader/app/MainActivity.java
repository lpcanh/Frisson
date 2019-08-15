package com.intrusoft.funkyheader.app;

import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        }
        setContentView(R.layout.sample_2);

//        final FrissonView frissonView = (FrissonView) findViewById(R.id.wave_head);
//        frissonView.setImageSource(R.drawable.intruder_shanky);

//        Glide Implementation
//        Glide.with(MainActivity.this)
//                .load("http://1.bp.blogspot.com/-Z_o6O1SkDIo/VK7p7JP90EI/AAAAAAAAAME/DLbBG6xcDbo/s1600/dfghj.jpg")
//                .asBitmap()
//                .into(new SimpleTarget<Bitmap>(SimpleTarget.SIZE_ORIGINAL, SimpleTarget.SIZE_ORIGINAL) {
//                    @Override
//                    public void onResourceReady(Bitmap bitmap, GlideAnimation anim) {
//                        // Do something with bitmap here.
//                        frissonView.setBitmap(bitmap);
//                        imageView.setImageBitmap(bitmap);
//                        Toast.makeText(MainActivity.this, "Downloaded", Toast.LENGTH_SHORT).show();
//                    }
//                });
    }
}
