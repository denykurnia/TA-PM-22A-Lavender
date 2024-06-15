package com.uti.lavender_sobat_organik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    Button btnLogin;
    ImageView registerBack;
    TextView textLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        registerBack = findViewById(R.id.R_bck);
        registerBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pindahactivity = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(pindahactivity);

            }
        });

        textLogin = findViewById(R.id.txt_login);
        textLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pindahactivity = new Intent(RegisterActivity.this, BerandaActivity.class);
                startActivity(pindahactivity);

            }
        });

        btnLogin = findViewById(R.id.R_btn1);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pindahactivity = new Intent(RegisterActivity.this, BerandaActivity.class);
                startActivity(pindahactivity);

            }
        });

    }
}