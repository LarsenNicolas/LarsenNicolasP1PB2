package src.classes;
import src.enums.TiposDeLibros;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Prestamo> registro;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
        this.registro = new ArrayList<Prestamo>();
    }

    public boolean agregarLibro(Libro libro) {
        this.libros.add(libro);
        return true;
    }

    public boolean prestarLibro(Integer id, Estudiante estudiante, String unLibro) {
        if (estudiante.puedePedirPrestamo()) {
            this.libros.forEach( book -> {
                if (book.getNombre().equals(unLibro)) {
                    book.setDisponible(false);
                    estudiante.agregarLibroEnPosesion(book);
                    this.generarRegistro(id, estudiante, book);
                }
            });
            return true;
        }
        else {
            return false;
        }
    }

    private void generarRegistro(Integer id, Estudiante estudiante, Libro book) {
        Prestamo nuevoPrestamo = new Prestamo(id,estudiante,book);
        this.registro.add(nuevoPrestamo);
    }

    public List<Prestamo> getRegistros() {
        return this.registro;
    }

    public Libro imprimirLibro(Integer id, String autor, String nombre, TiposDeLibros tipo) {
        Libro nuevoLibro = new Libro(id, nombre, autor, tipo);
        return nuevoLibro;
    }

    public boolean devolverLibro(Estudiante unEstudiante, String unNombre) {
        this.libros.forEach( book -> {
            if (book.getNombre().equals(unNombre)) {
                book.setDisponible(true);
                unEstudiante.quitarLibroDePosesion();
            }
        });
        return true;
    }
}
