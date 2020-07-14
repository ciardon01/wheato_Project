package com.example.wheato_try_10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Receta> listaRecetas;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaRecetas = new ArrayList<Receta>();
        recycler = findViewById(R.id.main_recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        llenarReceta();

        Adaptador_recetas adapter = new Adaptador_recetas(listaRecetas);
        recycler.setAdapter(adapter);
    }

    private void llenarReceta(){
        listaRecetas.add(new Receta(0,"Pollo Frito", "Pollo fritito en aceite", R.drawable.ic_launcher_background, "echar el pollo al aceite y dejar freir por 5 minutos", "10","4/10","1"));
        listaRecetas.add(new Receta(1,"Papas Fritas", "Patatas fritas a la fransesa con sal", R.drawable.ic_launcher_background, "cortar las papas en julianas y freir en aceite vegetal", "8","3/10","2"));
        listaRecetas.add(new Receta(2,"Hamburguesa", "Hamburguesa de 1/4 de libra de res", R.drawable.ic_launcher_background, "hacer la tortita de carne, freir y poner en pan", "40","5/10","3"));
        listaRecetas.add(new Receta(3,"Pizza", "Pizza de peperoni sencilla hecha en horno convencional", R.drawable.ic_launcher_background, "Hacer la pizza y meterla al horno", "45","6/10","4"));
        listaRecetas.add(new Receta(4,"Boneless", "PopCorn de pollo empanizado y servido con aderezo", R.drawable.ic_launcher_background, "1 libra de recortes de pechuga, empanizar, freir y servir", "70","8/10","5"));
    }

    @Override public boolean onCreateOptionsMenu(Menu miMenu){
        getMenuInflater().inflate(R.menu.menu_in_main, miMenu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem opcionMenu){
        int id = opcionMenu.getItemId();
        if(id==R.id.nueva_receta){
            Intent i = new Intent(this, New_Recype_Activity.class);
            startActivity(i);
        }
        return true;
    }

}
