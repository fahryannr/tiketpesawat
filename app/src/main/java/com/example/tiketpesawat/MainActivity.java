package com.example.tiketpesawat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.ims.ImsRcsManager;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgPku,imgJkt,imgSby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPku = findViewById(R.id.imgPku);
        imgJkt = findViewById(R.id.imgJkt);
        imgSby = findViewById(R.id.imgSby);

        imgPku.setOnClickListener(this);
        imgJkt.setOnClickListener(this);
        imgSby.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imgPku){
            Intent frompku = new Intent(MainActivity.this, fpku.class);
            frompku.putExtra("IMAGE_RESOURCE_ID", R.drawable.pkujkt);
            startActivity(frompku);

        } else if (v.getId() == R.id.imgJkt) {
            Intent fromjkt = new Intent(MainActivity.this, fjkt.class);
            fromjkt.putExtra("IMAGE_RESOURCE_ID", R.drawable.jktpku);
            startActivity(fromjkt);

        } else if (v.getId() == R.id.imgSby) {
            Intent fromsby = new Intent(MainActivity.this, fsby.class);
            fromsby.putExtra("IMAGE_RESOURCE_ID", R.drawable.sbypku);
            startActivity(fromsby);
        }
    }
}