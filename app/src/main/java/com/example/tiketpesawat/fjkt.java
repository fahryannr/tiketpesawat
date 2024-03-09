package com.example.tiketpesawat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fjkt extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgjktpku,imgjktmksr,imgjktbdg,imgjktsinga,imgjktsby;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fjkt);

        int imageResourceId = getIntent().getIntExtra("IMAGE_RESOURCE_ID", 0);

        ImageView imgjkt = findViewById(R.id.imgjktpku);

        imgjkt.setImageResource(imageResourceId);

        imgjktbdg = findViewById(R.id.imgjktbdg);
        imgjktmksr = findViewById(R.id.imgjktmksr);
        imgjktsby = findViewById(R.id.imgjktsby);
        imgjktpku = findViewById(R.id.imgjktpku);
        imgjktsinga = findViewById(R.id.imgjktsinga);

        imgjktsinga.setOnClickListener(this);
        imgjktpku.setOnClickListener(this);
        imgjktsby.setOnClickListener(this);
        imgjktmksr.setOnClickListener(this);
        imgjktbdg.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgjktpku){

            String pener = "Jakarta-Pekanbaru";
            String text = "450.000/seat";
            Intent pku = new Intent(fjkt.this, deskripsitiket.class);
            pku.putExtra(deskripsitiket.extra_name, text);
            pku.putExtra(deskripsitiket.tujuan, pener);
            pku.putExtra("IMAGE_RESOURCE_ID", R.drawable.jktpku);
            startActivity(pku);

        } else if (v.getId() == R.id.imgjktmksr) {

            String pener = "Jakarta-Makasar";
            String text = "550.000/seat";
            Intent mksr = new Intent(fjkt.this, deskripsitiket.class);
            mksr.putExtra(deskripsitiket.extra_name, text);
            mksr.putExtra(deskripsitiket.tujuan, pener);
            mksr.putExtra("IMAGE_RESOURCE_ID", R.drawable.jktmksr);
            startActivity(mksr);

        } else if (v.getId() == R.id.imgjktbdg) {

            String pener = "Jakarta-Bandung";
            String text = "250.000/seat";
            Intent bdg = new Intent(fjkt.this, deskripsitiket.class);
            bdg.putExtra(deskripsitiket.extra_name, text);
            bdg.putExtra(deskripsitiket.tujuan, pener);
            bdg.putExtra("IMAGE_RESOURCE_ID", R.drawable.jktbdg);
            startActivity(bdg);

        } else if (v.getId() == R.id.imgjktsby) {

            String pener = "Jakarta-Surabaya";
            String text = "250.000/seat";
            Intent sby = new Intent(fjkt.this, deskripsitiket.class);
            sby.putExtra(deskripsitiket.extra_name, text);
            sby.putExtra(deskripsitiket.tujuan, pener);
            sby.putExtra("IMAGE_RESOURCE_ID", R.drawable.jktsby);
            startActivity(sby);

        } else if (v.getId() == R.id.imgjktsinga) {

            String pener = "Jakarta-Changi(Singapura)";
            String text = "770.000/seat";
            Intent singa = new Intent(fjkt.this, deskripsitiket.class);
            singa.putExtra(deskripsitiket.extra_name, text);
            singa.putExtra(deskripsitiket.tujuan, pener);
            singa.putExtra("IMAGE_RESOURCE_ID", R.drawable.jktsinga);
            startActivity(singa);

        }

    }
}