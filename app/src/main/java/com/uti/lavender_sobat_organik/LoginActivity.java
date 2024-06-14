package com.uti.lavender_sobat_organik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {


    String email="denykurnia040@gmail.com";
    String password="12345";


        Button btnLogin;
        ImageView btnBack;
        TextView textRegister;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        EditText texteEmail=findViewById(R.id.R_edt_email);
        EditText textPassword=findViewById(R.id.R_edt_password);

        btnBack = findViewById(R.id.L_img1);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pindahactivity = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(pindahactivity);

            }
        });

        textRegister = findViewById(R.id.txt_register);
        textRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pindahactivity = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(pindahactivity);

            }
        });

        btnLogin = findViewById(R.id.L_btn1);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(texteEmail.getText().toString().equalsIgnoreCase(email)&&textPassword.getText().toString().equalsIgnoreCase(password)){

                    startActivity(new Intent(LoginActivity.this, BerandaActivity.class));
                }else{
                    Toast.makeText(LoginActivity.this,"Email atau Password salah!",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}