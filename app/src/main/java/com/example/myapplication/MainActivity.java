package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText ingresarUsuario, ingresarEdad;
    Button guardar, siguiente,salir;
    String nombreUsuario, edadUsuario;
    String TAG = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Estoy en el onCreate");

        ingresarUsuario = (EditText) findViewById(R.id.editarNombre);
        ingresarEdad = (EditText) findViewById(R.id.editarEdad);
        guardar = findViewById(R.id.btnGuardar);
        siguiente = findViewById(R.id.btnSiguiente);
        salir = findViewById(R.id.btnSalir);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nombreUsuario = ingresarUsuario.getText().toString();
                edadUsuario = ingresarEdad.getText().toString();

                Log.d(TAG, "Nombre guardado: " + nombreUsuario + ", Edad guardada: " + edadUsuario);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Estoy en el onStart");
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pasarDatos = new Intent(MainActivity.this, MainActivity2.class);
                pasarDatos.putExtra("nombreUsuario", nombreUsuario);
                pasarDatos.putExtra("edadUsuario", edadUsuario);
                startActivity(pasarDatos);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG,"Estoy en el onResume");
        //poner mensaje en pantalla
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Estoy en el onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Estoy en el onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Estoy en el onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Estoy en el onDestroy");
    }
}