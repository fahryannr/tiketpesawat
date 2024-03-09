package com.example.tiketpesawat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fsby extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgsbypku, imgsbyjkt, imgsbymksr, imgsbymalay, imgsbybdg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fsby);

        int imageResourceId = getIntent().getIntExtra("IMAGE_RESOURCE_ID", 0);

        ImageView imgsby = findViewById(R.id.imgsbypku);

        imgsby.setImageResource(imageResourceId);


        imgsbymalay = findViewById(R.id.imgsbymalay);
        imgsbymksr = findViewById(R.id.imgsbymksr);
        imgsbybdg = findViewById(R.id.imgsbybdg);
        imgsbyjkt = findViewById(R.id.imgsbyjkt);
        imgsbypku = findViewById(R.id.imgsbypku);

        imgsbypku.setOnClickListener(this);
        imgsbymksr.setOnClickListener(this);
        imgsbybdg.setOnClickListener(this);
        imgsbyjkt.setOnClickListener(this);
        imgsbymalay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imgsbypku){

            String pener = "Surabaya-Pekanbaru";
            String text = "350.000/seat";
            Intent pku = new Intent(fsby.this, deskripsitiket.class);
            pku.putExtra(deskripsitiket.extra_name, text);
            pku.putExtra(deskripsitiket.tujuan, pener);
            pku.putExtra("IMAGE_RESOURCE_ID", R.drawable.sbypku);
            startActivity(pku);

        } else if (v.getId() == R.id.imgsbyjkt) {

            String pener = "Surabaya-Jakarta";
            String text = "250.000/seat";
            Intent jkt = new Intent(fsby.this, deskripsitiket.class);
            jkt.putExtra(deskripsitiket.extra_name, text);
            jkt.putExtra(deskripsitiket.tujuan, pener);
            jkt.putExtra("IMAGE_RESOURCE_ID", R.drawable.sbyjkt);
            startActivity(jkt);

        } else if (v.getId() == R.id.imgsbymksr) {

            String pener = "Surabaya-Makasar";
            String text = "450.000/seat";
            Intent mksr = new Intent(fsby.this, deskripsitiket.class);
            mksr.putExtra(deskripsitiket.extra_name, text);
            mksr.putExtra(deskripsitiket.tujuan, pener);
            mksr.putExtra("IMAGE_RESOURCE_ID", R.drawable.sbymks);
            startActivity(mksr);

        } else if (v.getId() == R.id.imgsbybdg) {

            String pener = "Surabaya-Bandung";
            String text = "150.000/seat";
            Intent bdg = new Intent(fsby.this, deskripsitiket.class);
            bdg.putExtra(deskripsitiket.extra_name, text);
            bdg.putExtra(deskripsitiket.tujuan, pener);
            bdg.putExtra("IMAGE_RESOURCE_ID", R.drawable.sbybdg);
            startActivity(bdg);

        } else if (v.getId() == R.id.imgsbymalay) {

            String pener = "Surabaya-Kuala Lumpur";
            String text = "750.000/seat";
            Intent malay = new Intent(fsby.this, deskripsitiket.class);
            malay.putExtra(deskripsitiket.extra_name, text);
            malay.putExtra(deskripsitiket.tujuan, pener);
            malay.putExtra("IMAGE_RESOURCE_ID", R.drawable.sbymalay);
            startActivity(malay);

        }

    }
}