package com.example.tiketpesawat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class deskripsitiket extends AppCompatActivity implements View.OnClickListener {
    public ImageView imgresult;
    public TextView tvresult,tvdeskripsi;
    public Button btncs,btnshare;
    public static final String extra_name = "eror";
    public static final String tujuan = "ero";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsitiket);

        tvresult = findViewById(R.id.tvresult);
        tvdeskripsi = findViewById(R.id.tvdeskripsi);
        btncs = findViewById(R.id.btncs);
        btnshare = findViewById(R.id.btnshare);


//       dari pku
//       makassar
        String pku_mks = getIntent().getStringExtra(tujuan);
        String pkumks = getIntent().getStringExtra(extra_name);
        int imagemakasar = getIntent().getIntExtra("IMAGE_RESOURCE_ID", 0);
        ImageView imgPkumksr = findViewById(R.id.imgresult);
        tvresult.setText(pkumks);
        tvdeskripsi.setText(pku_mks);
        imgPkumksr.setImageResource(imagemakasar);

//       bali
        String pku_bali = getIntent().getStringExtra(tujuan);
        String pkubali = getIntent().getStringExtra(extra_name);
        int imagebali = getIntent().getIntExtra("IMAGE_RESOURCE_ID", 0);
        ImageView imgPkubali = findViewById(R.id.imgresult);
        tvresult.setText(pkubali);
        tvdeskripsi.setText(pku_bali);
        imgPkubali.setImageResource(imagebali);

//        surabaya
        String pku_sura = getIntent().getStringExtra(tujuan);
        String pkusura = getIntent().getStringExtra(extra_name);
        int imgsby = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgpkusby = findViewById(R.id.imgresult);
        tvresult.setText(pkusura);
        tvdeskripsi.setText(pku_sura);
        imgpkusby.setImageResource(imgsby);

//        bandung
        String pku_bdg = getIntent().getStringExtra(tujuan);
        String pkubdg = getIntent().getStringExtra(extra_name);
        int imgbdg = getIntent().getIntExtra("IMAGE_RESOURCE_ID", 0);
        ImageView imgpkubdg = findViewById(R.id.imgresult);
        tvresult.setText(pkubdg);
        tvdeskripsi.setText(pku_bdg);
        imgpkubdg.setImageResource(imgbdg);

//        jakarta
        String pku_jkt = getIntent().getStringExtra(tujuan);
        String pkujkt = getIntent().getStringExtra(extra_name);
        int imgjkt = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgpkujkt = findViewById(R.id.imgresult);
        tvresult.setText(pkujkt);
        tvdeskripsi.setText(pku_jkt);
        imgpkujkt.setImageResource(imgjkt);


//      dari surabaya
//        pekanbaru
        String sura_pku = getIntent().getStringExtra(tujuan);
        String sbypku = getIntent().getStringExtra(extra_name);
        int imgpku = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgsbypku = findViewById(R.id.imgresult);
        tvresult.setText(sbypku);
        tvdeskripsi.setText(sura_pku);
        imgsbypku.setImageResource(imgpku);

//        jakarta
        String sura_jkt = getIntent().getStringExtra(tujuan);
        String sbyjkt = getIntent().getStringExtra(extra_name);
        int jkt = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgsbyjkt = findViewById(R.id.imgresult);
        tvresult.setText(sbyjkt);
        tvdeskripsi.setText(sura_jkt);
        imgsbyjkt.setImageResource(jkt);

//        makasar
        String sura_makasar = getIntent().getStringExtra(tujuan);
        String sbymks = getIntent().getStringExtra(extra_name);
        int mksr = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgsbymksr = findViewById(R.id.imgresult);
        tvresult.setText(sbymks);
        tvdeskripsi.setText(sura_makasar);
        imgsbymksr.setImageResource(mksr);

//        bandung
        String sura_bdg = getIntent().getStringExtra(tujuan);
        String sbybndg = getIntent().getStringExtra(extra_name);
        int bdg = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgsbybdg = findViewById(R.id.imgresult);
        tvresult.setText(sbybndg);
        tvdeskripsi.setText(sura_bdg);
        imgsbybdg.setImageResource(bdg);

//        malaysia
        String sura_malay = getIntent().getStringExtra(tujuan);
        String sbymalay = getIntent().getStringExtra(extra_name);
        int malay = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgsbymalay = findViewById(R.id.imgresult);
        tvresult.setText(sbymalay);
        tvdeskripsi.setText(sura_malay);
        imgsbymalay.setImageResource(malay);

//        dari jakarta
//        pekanbaru
        String jkt_pku = getIntent().getStringExtra(tujuan);
        String jktpku = getIntent().getStringExtra(extra_name);
        int pku = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgjktpku = findViewById(R.id.imgresult);
        tvresult.setText(jktpku);
        tvdeskripsi.setText(jkt_pku);
        imgjktpku.setImageResource(pku);

//        makasar
        String jkt_mksr = getIntent().getStringExtra(tujuan);
        String jktmksr = getIntent().getStringExtra(extra_name);
        int makasar = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgjktmksr = findViewById(R.id.imgresult);
        tvresult.setText(jktmksr);
        tvdeskripsi.setText(jkt_mksr);
        imgjktmksr.setImageResource(makasar);

//        bandung
        String jkt_bdg = getIntent().getStringExtra(tujuan);
        String jktbdg = getIntent().getStringExtra(extra_name);
        int bandung = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgjktbdg = findViewById(R.id.imgresult);
        tvresult.setText(jktbdg);
        tvdeskripsi.setText(jkt_bdg);
        imgjktbdg.setImageResource(bandung);

//        surabaya
        String jkt_sura = getIntent().getStringExtra(tujuan);
        String jktsby = getIntent().getStringExtra(extra_name);
        int sura = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgjktsby = findViewById(R.id.imgresult);
        tvresult.setText(jktsby);
        tvdeskripsi.setText(jkt_sura);
        imgjktsby.setImageResource(sura);

//        singapura
        String jkt_singa = getIntent().getStringExtra(tujuan);
        String jktsinga = getIntent().getStringExtra(extra_name);
        int singa = getIntent().getIntExtra("IMAGE_RESOURCE_ID",0);
        ImageView imgjktpura = findViewById(R.id.imgresult);
        tvresult.setText(jktsinga);
        tvdeskripsi.setText(jkt_singa);
        imgjktpura.setImageResource(singa);



        btnshare.setOnClickListener(this);
        btncs.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnshare){

        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_TEXT, "IMAGE_RESOURCE_ID");
        startActivity(Intent.createChooser(share, "pilih aplikasi untuk berbagi"));
        
    } else if (v.getId() == R.id.btncs) {

            String number = "(021) 29103300";
            Intent phone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + number));
            startActivity(phone);
        }

        }
    }