package com.example.uberunal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {
    private TextInputLayout textInputNombre;
    private TextInputLayout textInputCelular;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;
    private TextInputLayout textInputPassword2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textInputNombre = (TextInputLayout)findViewById(R.id.text_input_nombre);
        textInputCelular = (TextInputLayout)findViewById(R.id.text_input_celular);
        textInputEmail = (TextInputLayout)findViewById(R.id.text_input_correo);
        textInputPassword = (TextInputLayout)findViewById(R.id.text_input_contraseña);
        textInputPassword2    = (TextInputLayout)findViewById(R.id.text_input_verificarContraseña);
    }

    public void registro (View view){
        String nombre = textInputNombre.getEditText().getText().toString().trim();
        String celular = textInputCelular.getEditText().getText().toString().trim();
        String correo = textInputEmail.getEditText().getText().toString().trim();
        String contraseña = textInputPassword.getEditText().getText().toString().trim();
        String contraseña2 = textInputPassword2.getEditText().getText().toString().trim();

        boolean verificacionDatos = true;

        if(nombre.isEmpty()){
            textInputNombre.setError("Ingrese un nombre.");
            verificacionDatos = false;
        } else {
            textInputNombre.setError(null);
            if(nombre.length()<10){
                textInputNombre.setError("El nombre debe tener mas de 10 digitos.");
                verificacionDatos = false;
            } else {
                textInputNombre.setError(null);
            }


        }
        if(celular.isEmpty()){
            textInputCelular.setError("Ingrese un numero de celular.");
            verificacionDatos = false;
        } else {
            textInputCelular.setError(null);
            if(celular.length()<=9){
                textInputCelular.setError("Ingrese un numero valido.");
                verificacionDatos = false;
            } else {
                textInputCelular.setError(null);
            }
        }
        if(correo.isEmpty()){
            textInputEmail.setError("Ingrese un correo.");
            verificacionDatos = false;
        } else {
            textInputEmail.setError(null);
            int conteoArroba = 0, conteoPuntos = 0;
            for(int i=0; i<correo.length();i++){
                char c = correo.charAt(i);
                if(c=='@'){
                    conteoArroba += 1;
                }
                if(c=='.'){
                    conteoPuntos +=1;
                }
            }

            if(conteoArroba!=1 && conteoPuntos==0){
                textInputEmail.setError("Ingrese un correo valido.");
                verificacionDatos = false;
            } else{
                textInputEmail.setError(null);
            }
        }



        if(correo.isEmpty()){
            textInputEmail.setError("Ingrese un correo.");
            verificacionDatos = false;
        } else {
            textInputEmail.setError(null);
            int conteoArroba = 0, conteoPuntos = 0;
            for(int i=0; i<correo.length();i++){
                char c = correo.charAt(i);
                if(c=='@'){
                    conteoArroba += 1;
                }
                if(c=='.'){
                    conteoPuntos +=1;
                }
            }

            if(conteoArroba!=1 && conteoPuntos==0){
                textInputEmail.setError("Ingrese un correo valido.");
                verificacionDatos = false;
            } else{
                textInputEmail.setError(null);
            }
        }
        if(contraseña.isEmpty()){
            textInputPassword.setError("Ingrese una contraseña.");
            verificacionDatos = false;
        } else {
            textInputPassword.setError(null);
            if (contraseña2.isEmpty()){
                textInputPassword2.setError("Ingrese una contraseña.");
                verificacionDatos = false;
            } else{
                textInputPassword2.setError(null);
                if(!contraseña.equals(contraseña2)){
                    textInputPassword2.setError("Las contraseñas no son iguales.");
                    verificacionDatos = false;
                } else{
                    textInputPassword2.setError(null);
                }
            }
        }
        if(verificacionDatos){
            Usuario x = new Usuario(nombre,Integer.parseInt(celular),correo,contraseña);
        }
    }
    public void volver (View vie){
        Intent login = new Intent( this,LoginActivity.class);
        startActivity(login);

    }
}