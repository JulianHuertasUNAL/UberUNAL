package com.example.uberunal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputEmail = (TextInputLayout)findViewById(R.id.text_input_email);
        textInputPassword= (TextInputLayout)findViewById(R.id.text_input_password);
    }
    public void login(View view){
        String emailUser = textInputEmail.getEditText().getText().toString().trim();
        String passwordUser = textInputPassword.getEditText().getText().toString().trim();

        boolean inputsCorrectos=true;
        if(emailUser.isEmpty()){
            textInputEmail.setError("Ingrese un correo");
            inputsCorrectos=false;
        } else {
            textInputEmail.setError(null);
            int conteoArroba = 0, conteoPuntos = 0;
            for(int i=0; i<emailUser.length();i++){
                char c = emailUser.charAt(i);
                if(c=='@'){
                    conteoArroba += 1;
                }
                if(c=='.'){
                    conteoPuntos +=1;
                }
            }

            if(conteoArroba!=1 && conteoPuntos==0){
                textInputEmail.setError("Ingrese un correo valido");
                inputsCorrectos=false;
            } else{
                textInputEmail.setError(null);
            }
        }
        if(passwordUser.isEmpty()){
            textInputPassword.setError("Ingrese una contraseña");
            inputsCorrectos=false;
        } else {
            textInputPassword.setError(null);
        }

        if(inputsCorrectos){


            SharedPreferences login_preferencias = getSharedPreferences( "login", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = login_preferencias.edit();
            editor.putString("email", emailUser);
            editor.commit();
            editor.putString("password", passwordUser);
            editor.commit();




        }

    }
    public void Registro(View view){
        Intent registro = new Intent(this,RegisterActivity.class );
        startActivity(registro);
    }
}