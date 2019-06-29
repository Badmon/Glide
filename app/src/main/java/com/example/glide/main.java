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

        String url="https://cdn.vox-cdn.com/thumbor/rpmbJ_H5i4g3vFNeZVB6mdZHfW4=/0x0:711x400/1200x800/filters:focal(325x93:437x205)/cdn.vox-cdn.com/uploads/chorus_image/image/60365061/pokemon_piplup.0.png";
        String url1="https://cdn.vox-cdn.com/thumbor/dRlxNheMNdTmTFZg7bHh-ZnoNis=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/14622892/Switch_PokemonLetsGo_090618_PressKit_SCRN_10.jpg";

        Glide.with(this).
                load(url).
                into(image);
    }
}
