package src.classes;

import src.enums.TiposDeLibros;
import src.interfaces.PuedeSerFotocopiado;

public class Historia extends Libro implements PuedeSerFotocopiado {

    public Historia(Integer codigo, String nombre, String autor ) {
        super(codigo, nombre, autor, TiposDeLibros.HISTORIA);
    }

    @Override
    public String puedeSerFotocopiado() {
        return "Fotocopia de historia";
    }
}
