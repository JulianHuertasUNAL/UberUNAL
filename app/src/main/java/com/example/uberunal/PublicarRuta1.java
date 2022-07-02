package com.example.uberunal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PublicarRuta1 extends AppCompatActivity {
    EditText DireccionOrigen;
    EditText Dias;
    EditText Salida;
    EditText CantidadCupos;
    EditText Celular;

    public void publicarruta(View view){
        Intent i = new Intent(this, TipoRuta.class);
        startActivity(i);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicar_ruta1);
        DireccionOrigen = findViewById(R.id.destino);
        Dias = findViewById(R.id.dias);
        Salida = findViewById((R.id.hora));
        CantidadCupos = findViewById(R.id.cantidadcupos);
        Celular = findViewById(R.id.contacto);
    }
    public void BotonGuardar(View view){
        String Origen = DireccionOrigen.getText().toString();
        String Dia = Dias.getText().toString();
        String HoraSalida = Salida.getText().toString();
        String NumCupos = CantidadCupos.getText().toString();
        int Cupos = Integer.parseInt(NumCupos);

        String Contacto = Celular.getText().toString();

        if(Origen.isEmpty() || Dia.isEmpty() || HoraSalida.isEmpty() || NumCupos.isEmpty() || Contacto.isEmpty()){
            Toast.makeText(this,"Ingrese todos los datos",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
        }
    }
}