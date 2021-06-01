package src.classes;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public boolean agregarLibro(Libro libro) {
        this.libros.add(libro);
        return true;
    }

    public boolean prestarLibro(Estudiante estudiante, String unLibro) {
        if (estudiante.puedePedirPrestamo()) {
            this.libros.forEach( book -> {
                if (book.getNombre().equals(unLibro)) {
                    book.setDisponible(false);
                    estudiante.agregarLibroEnPosesion(book);
                }
            });
            return true;
        }
        else {
            return false;
        }
    }
//
//    private imprimirNuevoLibro() {
//        Libro libro =
//    }
}
