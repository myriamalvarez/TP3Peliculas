package com.example.tp3peliculas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tp3peliculas.Modelo.Pelicula;

public class DetallesActivity extends AppCompatActivity {
    private ImageView ivFotoDetalle;
    private TextView tvTitulo;
    private TextView tvDescripcion;
    private TextView tvActores;
    private TextView tvDirector;
    private Pelicula itemDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        setTitle(getClass().getSimpleName());

        inicializarVista();
        inicializarValores();
    }
    private void inicializarVista(){
        ivFotoDetalle = findViewById(R.id.ivFotoDetalle);
        tvTitulo = findViewById(R.id.tvTituloDetalle);
        tvDescripcion = findViewById(R.id.tvDescripcionDetalle);
        tvActores = findViewById(R.id.tvActorDetalle);
        tvDirector = findViewById(R.id.tvDirectorDetalle);
    }
    private void inicializarValores(){
        itemDetalle = (Pelicula) getIntent().getExtras().getSerializable("itemDetalle");

        ivFotoDetalle.setImageResource(itemDetalle.getFoto());
        tvTitulo.setText(itemDetalle.getTitulo());
        tvDescripcion.setText(itemDetalle.getDescripcion());
        tvActores.setText(itemDetalle.getActores());
        tvDirector.setText(itemDetalle.getDirector());
    }

}