package com.projectpening.acer.utsmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgV;

        Intent intent = getIntent();

        TextView titleAtas = (TextView) findViewById(R.id.tulisan);
        titleAtas.setText(""+intent.getStringExtra("title"));

        imgV = (ImageView) findViewById(R.id.gambar) ;
        int image_link = intent.getIntExtra("gambar",0);
        imgV.setImageResource(image_link);

    }
}

