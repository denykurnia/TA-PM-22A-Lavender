package com.uti.lavender_sobat_organik;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BerandaActivity extends AppCompatActivity {

    Button btnSearch;
    Button btnFav;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_beranda);

    btnSearch=findViewById(R.id.B_search);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent pindahsearch = new Intent(BerandaActivity.this, SearchActivity.class);
                    startActivity(pindahsearch);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btnFav=findViewById(R.id.B_fav);
        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent pindahfav = new Intent(BerandaActivity.this, FavoriteActivity.class);
                    startActivity(pindahfav);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}