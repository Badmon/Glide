package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class main extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image= findViewById(R.id.img);

        String url="http://hitexroidgroup.ir/uploads/monthly_2017_12/building-image-gallery-all-with-glide.jpg.dcbab30c0c25224e1ae0b50104b458d7.jpg";
        String url1="https://cdn.vox-cdn.com/thumbor/dRlxNheMNdTmTFZg7bHh-ZnoNis=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/14622892/Switch_PokemonLetsGo_090618_PressKit_SCRN_10.jpg";

        Glide.with(this).
                load(url1).
                into(image);
    }
}
