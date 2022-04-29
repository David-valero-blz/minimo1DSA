package edu.upc.dsa.models;

import edu.upc.dsa.utils.RandomUtils;

import java.util.List;
import java.util.ArrayList;


public class Usuario {

    private String id;
    private String nombre;
    private String fecha;
    private String correo;
    private String password;
    private String dsacoins;


    private List<Usuario> usuarios;
    private List<Objeto> items;


    public Usuario(String nombre, String fecha, String correo, String password, String dsacoins) {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDsacoins() {
        return dsacoins;
    }

    public void setDsacoins(String dsacoins) {
        this.dsacoins = dsacoins;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", dsacoins='" + dsacoins + '\'' +
                ", usuarios=" + usuarios +
                '}';
    }
}

