package src.classes;

import src.enums.TiposDeLibros;

public class Matematica extends Libro {

    public Matematica(Integer codigo, String nombre, String autor ) {
        super(codigo, nombre, autor, TiposDeLibros.MATEMATICA);
    }

}
