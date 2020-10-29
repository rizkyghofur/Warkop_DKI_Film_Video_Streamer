package com.rizkyghofur.warkopdkifilmvideostreamer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView mAlbum;
    TextView mDescription;
    TextView mKey;
    Button tonton;
    private String KEY_NAME = "Key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mToolbar = findViewById(R.id.toolbar);
        mAlbum = findViewById(R.id.ivImage);
        mDescription = findViewById(R.id.tvDescription);
        mKey = findViewById(R.id.key);
        tonton = findViewById(R.id.button);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            mToolbar.setTitle(mBundle.getString("Judul"));
            mAlbum.setImageResource(mBundle.getInt("Gambar"));
            mDescription.setText(mBundle.getString("Deskripsi"));
            mKey.setText(mBundle.getString("Key"));
        }

        tonton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Detail.this, Player.class);
                i.putExtra(KEY_NAME, mBundle.getString("Key"));
                startActivity(i);
            }
        });

    }
}