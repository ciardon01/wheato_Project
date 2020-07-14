package com.example.wheato_try_10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador_recetas extends RecyclerView.Adapter<Adaptador_recetas.ViewHolderRecetas> {

    ArrayList<Receta> listaRecetas;

    public Adaptador_recetas(ArrayList<Receta> listaRecetas) {
        this.listaRecetas = listaRecetas;
    }

    @NonNull
    @Override
    public Adaptador_recetas.ViewHolderRecetas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null);
        return new ViewHolderRecetas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador_recetas.ViewHolderRecetas holder, int position) {
        holder.img_uri.setImageResource(listaRecetas.get(position).getImg_uri());
        holder.titulo.setText(listaRecetas.get(position).getTitulo());
        holder.descripcion.setText(listaRecetas.get(position).getDescripcion());
        holder.tiempo.setText(listaRecetas.get(position).getTiempo());
        holder.dificultad.setText(listaRecetas.get(position).getDificultad());
        holder.calif_receta.setRating(listaRecetas.get(position).getCalificacionfloat());

    }

    @Override
    public int getItemCount() {
        return listaRecetas.size();
    }

    public class ViewHolderRecetas extends RecyclerView.ViewHolder {

        ImageView img_uri;
        RatingBar calif_receta;
        TextView titulo, descripcion, tiempo, dificultad, calificacion;

        public ViewHolderRecetas(@NonNull View itemView) {
            super(itemView);

            img_uri = itemView.findViewById(R.id.item_list_img);
            titulo = itemView.findViewById(R.id.item_list_titulo);
            descripcion = itemView.findViewById(R.id.item_list_descripcion);
            tiempo = itemView.findViewById(R.id.item_list_tiempo);
            dificultad = itemView.findViewById(R.id.item_list_dific);
            calif_receta = itemView.findViewById(R.id.ratingBar);
        }
    }
}
