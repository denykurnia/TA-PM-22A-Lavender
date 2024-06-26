package com.uti.lavender_sobat_organik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

        Button btnLogin;
        Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_1);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pindahlogin = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(pindahlogin);
            }
        });

        btnRegister = findViewById(R.id.btn_2);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pindahlogin = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(pindahlogin);
            }
        });

    }

}