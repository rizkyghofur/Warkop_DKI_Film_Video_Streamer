package com.rizkyghofur.warkopdkifilmvideostreamer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<Data> mListFilm;
    Data mData;
    private AdView mAdView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mListFilm = new ArrayList<>();
        mData = new Data("Mana Tahaaan... (1979)", getString(R.string.mana_tahan),
                R.drawable.mana_tahan, "pzvBQKSwDZ4&t=12s");
        mListFilm.add(mData);
        mData = new Data("Gengsi Dong (1980)", getString(R.string.gengsi_dong),
                R.drawable.gengsi_dong, "w5CtU3CHf48");
        mListFilm.add(mData);
        mData = new Data("GeEr - Gede Rasa (1980)", getString(R.string.geer),
                R.drawable.geeeer, "lontong");
        mListFilm.add(mData);
        mData = new Data("Pintar-Pintar Bodoh (1980)", getString(R.string.ppb),
                R.drawable.pintar_pintar_bodoh, "r6JS7FQ6fsE");
        mListFilm.add(mData);
        mData = new Data("Manusia 6 Juta Dolar (1981)", getString(R.string.manusia6jutadolar),
                R.drawable.manusia_6_juta_dolar, "Z1dJz9_mbtI");
        mListFilm.add(mData);
        mData = new Data("IQ Jongkok (1981)", getString(R.string.iqjongkok),
                R.drawable.iq_jongkok, "lontong");
        mListFilm.add(mData);
        mData = new Data("Setan Kredit (1982)", getString(R.string.setan_kredit),
                R.drawable.setan_kredit, "Rt8zMPMRZ_Q");
        mListFilm.add(mData);
        mData = new Data("Chips (1982)", getString(R.string.chips),
                R.drawable.chips, "WsOlrwGlzdk");
        mListFilm.add(mData);
        mData = new Data("Dongkrak Antik (1982)", getString(R.string.dongkrak_antik),
                R.drawable.dongkrak_antik, "5xMqT0btmns");
        mListFilm.add(mData);
        mData = new Data("Maju Kena Mundur Kena (1983)", getString(R.string.maju_kena_mundur_kena),
                R.drawable.maju_kena_mundur_kena, "vyLyvbujR3k");
        mListFilm.add(mData);
        mData = new Data("Pokoknya Beres (1983)", getString(R.string.pokoknya_beres),
                R.drawable.pokoknya_beres, "lontong");
        mListFilm.add(mData);
        mData = new Data("Tahu Diri Dong (1984)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Itu Bisa Diatur (1984)", getString(R.string.itu_bisa_diatur),
                R.drawable.itu_bisa_diatur, "lontong");
        mListFilm.add(mData);
        mData = new Data("Gantian Dong (1985)", getString(R.string.gantian_dong),
                R.drawable.gantian_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Kesempatan Dalam Kesempitan (1985)", getString(R.string.kesempatan_dalam_kesempitan),
                R.drawable.kesempatan_dalam_kesempitan, "lontong");
        mListFilm.add(mData);
        mData = new Data("Sama Juga Bohong (1986)", getString(R.string.sama_juga_bohong),
                R.drawable.sama_juga_bohong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Atas Boleh Bawah Boleh (1986)", getString(R.string.atas_boleh_bawah_boleh),
                R.drawable.atas_boleh_bawah_boleh, "lontong");
        mListFilm.add(mData);
        mData = new Data("Depan Bisa Belakang Bisa (1986)", getString(R.string.depan_bisa_belakang_bisa),
                R.drawable.depan_bisa_belakang_bisa, "lontong");
        mListFilm.add(mData);
        mData = new Data("Makin Lama Makin Asyik (1987)", getString(R.string.makin_lama_makin_asyik),
                R.drawable.makin_lama_makin_asyik, "lontong");
        mListFilm.add(mData);
        mData = new Data("Saya Suka Kamu Punya (1987)", getString(R.string.saya_suka_kamu_punya),
                R.drawable.saya_suka_kamu_punya, "lontong");
        mListFilm.add(mData);
        mData = new Data("Jodoh Boleh Diatur (1988)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Malu-Malu Mau (1988)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Godain Kita Dong (1989)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Sabar Dulu Doong...! (1989)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Mana Bisa Tahan (1990)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Sabar Dulu Doong...! (1989)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Lupa Aturan Main (1991)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Sudah Pasti Tahan (1991)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Bisa Naik Bisa Turun (1992)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Masuk Kena Keluar Kena (1992)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Salah Masuk (1992)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Bagi-Bagi Dong (1993)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Bebas Aturan Main (1993)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Saya Duluan Dong (1994)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);
        mData = new Data("Pencet Sana Pencet Sini (1994)", getString(R.string.tahu_diri_dong),
                R.drawable.tahu_diri_dong, "lontong");
        mListFilm.add(mData);

        Adapter myAdapter = new Adapter(MainActivity.this, mListFilm);
        mRecyclerView.setAdapter(myAdapter);
        
    }
}