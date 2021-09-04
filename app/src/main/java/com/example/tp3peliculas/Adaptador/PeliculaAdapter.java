package com.example.tp3peliculas.Adaptador;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tp3peliculas.DetallesActivity;
import com.example.tp3peliculas.Modelo.Pelicula;
import com.example.tp3peliculas.R;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.RecyclerHolder>{
    private List<Pelicula> items;

    public PeliculaAdapter(List<Pelicula> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pelicula, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        final Pelicula item = items.get(position);
        holder.ivFoto.setImageResource(item.getFoto());
        holder.tvTitulo.setText(item.getTitulo());
        holder.tvResenia.setText(item.getResenia());

        holder.btDetalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetallesActivity.class);
                intent.putExtra("itemDetalle", item);
                holder.itemView.getContext().startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder{
        private ImageView ivFoto;
        private TextView tvTitulo;
        private TextView tvResenia;
        private Button btDetalles;
        //private TextView tvDescripcion;
        //private TextView tvActores;
        //private TextView tvDirector;

        public RecyclerHolder(@NonNull View itemView){
            super(itemView);
            ivFoto = itemView.findViewById(R.id.imgItem);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvResenia = itemView.findViewById(R.id.tvResenia);
            btDetalles = itemView.findViewById(R.id.btDetalle);
        }
    }






    /*private List<Pelicula> lista;
    private RecyclerItemClick itemClick;

    public PeliculaAdapter(List<Pelicula> lista, RecyclerItemClick itemClick){
        this.lista = lista;
        this.itemClick = itemClick;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pelicula, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        final Pelicula pelicula = lista.get(position);


    }

    @Override
    public int getItemCount() {
        return 0;
    }*/
}
