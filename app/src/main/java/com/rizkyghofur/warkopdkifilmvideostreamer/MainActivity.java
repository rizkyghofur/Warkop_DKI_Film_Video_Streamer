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
                R.drawable.mana_tahan, "STNo5NsfA40");
        mListFilm.add(mData);
        mData = new Data("Gengsi Dong (1980)", getString(R.string.gengsi_dong),
                R.drawable.gengsi_dong, "STNo5NsfA40");
        mListFilm.add(mData);
        mData = new Data("GeEr - Gede Rasa (1980)", getString(R.string.geer),
                R.drawable.geeeer, "lontong");
        mListFilm.add(mData);
        mData = new Data("Pintar-Pintar Bodoh (1980)", getString(R.string.ppb),
                R.drawable.pintar_pintar_bodoh, "r6JS7FQ6fsE");
        mListFilm.add(mData);
        mData = new Data("Manusia 6 Juta Dolar (1981)", getString(R.string.manusia6jutadolar),
                R.drawable.manusia_6_juta_dolar, "lontong");
        mListFilm.add(mData);
        mData = new Data("IQ Jongkok (1981)", getString(R.string.iqjongkok),
                R.drawable.iq_jongkok, "lontong");
        mListFilm.add(mData);
        mData = new Data("Setan Kredit (1982)", getString(R.string.setan_kredit),
                R.drawable.setan_kredit, "lontong");
        mListFilm.add(mData);
        mData = new Data("Chips (1982)", getString(R.string.chips),
                R.drawable.chips, "lontong");
        mListFilm.add(mData);
        mData = new Data("Dongkrak Antik (1982)", getString(R.string.dongkrak_antik),
                R.drawable.dongkrak_antik, "lontong");
        mListFilm.add(mData);
        mData = new Data("Maju Kena Mundur Kena (1983)", getString(R.string.maju_kena_mundur_kena),
                R.drawable.maju_kena_mundur_kena, "lontong");
        mListFilm.add(mData);

        Adapter myAdapter = new Adapter(MainActivity.this, mListFilm);
        mRecyclerView.setAdapter(myAdapter);
        
    }
}