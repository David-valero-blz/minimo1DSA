package edu.upc.dsa.models;

import edu.upc.dsa.utils.RandomUtils;

import java.util.List;

public class Objeto {
    String id;
    String nombre;
    String descripcion;
    String dsacoins;


    public List<Objeto>tienda;

    public Objeto(String id, String nombre, String descripcion, String dsacoins){
        id = RandomUtils.getId();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDsacoins() {
        return dsacoins;
    }

    public void setDsacoins(String dsacoins) {
        this.dsacoins = dsacoins;
    }

    public List<Objeto> getTienda() {
        return tienda;
    }

    public void setTienda(List<Objeto> tienda) {
        this.tienda = tienda;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", dsacoins='" + dsacoins + '\'' +
                ", tienda=" + tienda +
                '}';
    }
}
