package com.ecodeup.jdbc;

public class product {
    private String nombre;
    private String description;

    private String  image  ;

    private String correo;
    private int id;
    // Constructor
    public product(String nombre, String correo ,String image,String description) {
        this.correo= correo;
        this.nombre = nombre;
        this.image= image;
        this.description=description;


    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getCorreo() {
        return correo;
    }

    public int getId() {
        return id;
    }
}