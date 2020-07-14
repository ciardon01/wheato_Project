package com.example.wheato_try_10;

public class Receta {

    int id;
    String titulo;
    String descripcion;
    int img_uri;
    String proceso;
    String tiempo;
    String dificultad;
    String calificacion;

    public Receta(int id, String titulo, String descripcion, int img_uri, String proceso, String tiempo, String dificultad, String calificacion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img_uri = img_uri;
        this.proceso = proceso;
        this.tiempo = tiempo;
        this.dificultad = dificultad;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImg_uri() {
        return img_uri;
    }

    public void setImg_uri(int img_uri) {
        this.img_uri = img_uri;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getTiempo() {
        return tiempo + ".min";
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public float getCalificacionfloat(){
        int i = Integer.parseInt(calificacion);
        return (float) i;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
