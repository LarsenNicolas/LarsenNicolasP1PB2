package src.classes;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private Integer dni;
    private String nombre;
    private String apellido;
    private List<Libro> librosEnPosesion;

    public Estudiante(Integer dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.librosEnPosesion = new ArrayList<Libro>();
    }

    private Integer getDni() {
        return dni;
    }

    private void setDni(Integer dni) {
        this.dni = dni;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean puedePedirPrestamo() {
        return librosEnPosesion.size() < 2;
    }

    public void agregarLibroEnPosesion(Libro libro) {
        this.librosEnPosesion.add(libro);
    }

    public Integer getLibrosEnPosesion() {
        return this.librosEnPosesion.size();
    }

    public void quitarLibroDePosesion() {
        this.librosEnPosesion.remove(0);
    }
}
