package src.classes;

import src.enums.TiposDeLibros;
import src.interfaces.PuedeSerFotocopiado;

public class Geografia extends Libro implements PuedeSerFotocopiado {

    public Geografia(Integer codigo, String nombre, String autor ) {
        super(codigo, nombre, autor, TiposDeLibros.GEOGRAFIA);
    }

    @Override
    public String puedeSerFotocopiado() {
        return "Fotocopia de geografia";
    }
}
