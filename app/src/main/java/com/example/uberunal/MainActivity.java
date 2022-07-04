package com.example.uberunal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressLogin);

        SharedPreferences usuario_preferences = getSharedPreferences("login", Context.MODE_PRIVATE);

        String correo =  usuario_preferences.getString("email","");
        String password =  usuario_preferences.getString("password","");

        if(correo.isEmpty()){
            Intent login = new Intent(this,LoginActivity.class );
            startActivity(login);
        } else {
            Toast.makeText(this,correo,Toast.LENGTH_SHORT).show();
            Toast.makeText(this,password,Toast.LENGTH_SHORT).show();
        }
    }
    public void x() {

    }
}