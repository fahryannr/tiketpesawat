package com.example.tiketpesawat;

import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class fpku extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgPkuJkt, imgpkubdg, imgpkusby, imgpkubali, imgpkumksr;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpku);

        imgPkuJkt = findViewById(R.id.imgjktpku);
        imgpkubali = findViewById(R.id.imgpkubali);
        imgpkubdg = findViewById(R.id.imgpkubdg);
        imgpkusby = findViewById(R.id.imgpkusby);
        imgpkumksr = findViewById(R.id.imgpkumksr);


        int imageResourceId = getIntent().getIntExtra("IMAGE_RESOURCE_ID", 0);

        ImageView imgPkuJkt = findViewById(R.id.imgPkuJkt);

        imgPkuJkt.setImageResource(imageResourceId);


        imgpkumksr.setOnClickListener(this);
        imgpkubali.setOnClickListener(this);
        imgPkuJkt.setOnClickListener(this);
        imgpkusby.setOnClickListener(this);
        imgpkubdg.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imgpkumksr){

            String pener = "Pekanbaru-Makasar";
            String text = "550.000/seat";
            Intent mks = new Intent(fpku.this, deskripsitiket.class);
            mks.putExtra("IMAGE_RESOURCE_ID", R.drawable.pkumakasar);
            mks.putExtra(deskripsitiket.extra_name, text);
            mks.putExtra(deskripsitiket.tujuan, pener);
            startActivity(mks);

        } else if (v.getId() == R.id.imgpkubali) {

            String pener = "Pekanbaru-Bali";
            String text = "750.000/seat";
            Intent bali = new Intent(fpku.this, deskripsitiket.class);
            bali.putExtra("IMAGE_RESOURCE_ID", R.drawable.pkubali);
            bali.putExtra(deskripsitiket.extra_name, text);
            bali.putExtra(deskripsitiket.tujuan, pener);
            startActivity(bali);

        } else if (v.getId() == R.id.imgpkusby) {

            String pener = "Pekanbaru-Surabaya";
            String text = "360.000/seat";
            Intent sby = new Intent(fpku.this, deskripsitiket.class);
            sby.putExtra("IMAGE_RESOURCE_ID", R.drawable.pkusby);
            sby.putExtra(deskripsitiket.extra_name, text);
            sby.putExtra(deskripsitiket.tujuan, pener);
            startActivity(sby);

        } else if (v.getId() == R.id.imgpkubdg) {

            String pener = "Pekanbaru-Bandung";
            String text = "400.000/seat";
            Intent bdg = new Intent(fpku.this, deskripsitiket.class);
            bdg.putExtra("IMAGE_RESOURCE_ID", R.drawable.pkubdg);
            bdg.putExtra(deskripsitiket.extra_name, text);
            bdg.putExtra(deskripsitiket.tujuan, pener);
            startActivity(bdg);

        } else if (v.getId() == R.id.imgPkuJkt) {

            String pener = "Pekanbaru-Jakarta";
            String text = "350.000/seat";
            Intent jkt = new Intent(fpku.this, deskripsitiket.class);
            jkt.putExtra("IMAGE_RESOURCE_ID",R.drawable.pkujkt);
            jkt.putExtra(deskripsitiket.extra_name, text);
            jkt.putExtra(deskripsitiket.tujuan, pener);
            startActivity(jkt);

        }

    }
}