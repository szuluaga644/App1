package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView txvNombre, txvEdad;
    Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        txvNombre = findViewById(R.id.textoNombre);
        txvEdad = findViewById(R.id.textoEdad);
        atras = findViewById(R.id.btnAtras);

        Intent intent = getIntent();
        String nombreUsuario = intent.getStringExtra("nombreUsuario");
        String edadUsuario = intent.getStringExtra("edadUsuario");

        txvNombre.setText(nombreUsuario);
        txvEdad.setText(edadUsuario);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}