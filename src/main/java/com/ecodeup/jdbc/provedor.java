package com.ecodeup.jdbc;

public class provedor {
    private String nombre;
    private String description;
    private Integer numero;
    private String ciudad;


    private int id;

    // Constructor
    public provedor(String nombre, String description, String ciudad, Integer numero) {

        this.nombre = nombre;
        this.description = description;
        this.numero = numero;
        this.ciudad = ciudad;


    }

    public String getNombre() {
        return nombre;
    }

    public String getDescription() {
        return description;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getCiudad() {
        return ciudad;
    }


    public int getId() {
        return id;
    }


}