package com.example.wheato_try_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.wheato_try_10.BBDD.Estructura_BBDD;
import com.example.wheato_try_10.BBDD.RecypeDBHelper;

public class New_Recype_Activity extends AppCompatActivity {

    EditText titulo;
    EditText descripcion;
    EditText proceso;
    EditText tiempo;
    EditText dificultad;
    EditText calificacion;

    ImageView img_new_recype;

    Button boton_nueva_receta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__recype_);

        final RecypeDBHelper dbHelper = new RecypeDBHelper(this);

        titulo = findViewById(R.id.edtx_titulo);
        descripcion = findViewById(R.id.edtx_descripcion);
        proceso = findViewById(R.id.edtx_proceso);
        tiempo = findViewById(R.id.edtx_tiempo);
        dificultad = findViewById(R.id.edtx_dificultad);
        calificacion = findViewById(R.id.edtx_calificacion);

        boton_nueva_receta = findViewById(R.id.button);

        img_new_recype = findViewById(R.id.img_nueva_receta);

        // img_new_recype =  findViewById(R.id.img_nueva_receta); // nota: encontrar una forma de 1) al dar click en la imagen se abra un intent para elegir el archivo a guardar 2) sustituir el imageView por la imagen seleccionada, 3) guardar la imagen dentro de drawables 4) almacenar en la base de datos el id (R.id) de la imagen.

        boton_nueva_receta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = dbHelper.getWritableDatabase();

                ContentValues values = new ContentValues();

                // values.put(Estructura_BBDD.FeedEntry._ID, edtx_id.getText().toString()); // nota: no se encia por que se auto genera con _ID
                values.put(Estructura_BBDD.FeedEntry.COLUMN_TITULO, titulo.getText().toString());
                values.put(Estructura_BBDD.FeedEntry.COLUMN_DESCRIPCION, descripcion.getText().toString());
                values.put(Estructura_BBDD.FeedEntry.COLUMN_PROCESO, proceso.getText().toString());
                values.put(Estructura_BBDD.FeedEntry.COLUMN_TIEMPO, tiempo.getText().toString());
                values.put(Estructura_BBDD.FeedEntry.COLUMN_DIFICULTAD, dificultad.getText().toString());
                values.put(Estructura_BBDD.FeedEntry.COLUMN_CALIFICACION, calificacion.getText().toString());
                // values.put(Estructura_BBDD.FeedEntry.COLUMN_IMG_URI, img_new_recype.getid().toString());

                long idResultante = db.insert(Estructura_BBDD.FeedEntry.TABLE_NAME, null, values);

                Toast.makeText(getApplicationContext(), "id Registro: " + idResultante, Toast.LENGTH_SHORT).show();  // HAGA LO QUE HAGA ME DA -1

            }
        });
    }
}
