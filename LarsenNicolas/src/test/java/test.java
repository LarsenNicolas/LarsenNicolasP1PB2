import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.classes.*;
import src.enums.TiposDeLibros;

public class test {
    @Test
    public void queSePuedaPrestarLibroAEstudiante() {
        Biblioteca biblioteca = new Biblioteca();
        Libro matematica1 = new Matematica(1, "unNombre", "unAutor");
        Estudiante unEstudiante = new Estudiante(39879575,"Larsen","Nicolas");

        biblioteca.agregarLibro(matematica1);
        biblioteca.prestarLibro(1,unEstudiante, "unNombre");

        Assertions.assertEquals((Integer)1, unEstudiante.getLibrosEnPosesion());
    }

    @Test
    public void queNoSePuedaPrestarMasDeDosLibrosALaVezAUnEstudiante() {
        Biblioteca biblioteca = new Biblioteca();
        Libro matematica1 = new Matematica(1, "unNombre", "unAutor");
        Libro historia = new Historia(1, "guerra", "unAutor");
        Libro planos = new Geografia(1, "planos", "unAutor");
        Estudiante unEstudiante = new Estudiante(39879575,"Larsen","Nicolas");

        biblioteca.agregarLibro(matematica1);
        biblioteca.agregarLibro(historia);
        biblioteca.agregarLibro(planos);

        biblioteca.prestarLibro(1,unEstudiante, "unNombre");
        biblioteca.prestarLibro(2,unEstudiante, "guerra");

        Assertions.assertEquals(false, biblioteca.prestarLibro(3,unEstudiante, "planos"));
    }

    @Test
    public void queLosLibrosQueSePuedanCopiarDevuelvanStringRepresentativo() {
        Historia historia = new Historia(1, "guerra", "unAutor");
        Geografia planos = new Geografia(1, "planos", "unAutor");

        Assertions.assertEquals("Fotocopia de historia", historia.puedeSerFotocopiado());
        Assertions.assertEquals("Fotocopia de geografia", planos.puedeSerFotocopiado());
    }

    @Test
    public void queSeGenereUnRegistroCuandoPrestoElLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro matematica1 = new Matematica(1, "unNombre", "unAutor");
        Estudiante unEstudiante = new Estudiante(39879575,"Larsen","Nicolas");

        biblioteca.agregarLibro(matematica1);
        biblioteca.prestarLibro(1,unEstudiante, "unNombre");

        Assertions.assertEquals((Integer)1, biblioteca.getRegistros().size());
    }

    @Test
    public void queSePuedaImprimirUnLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro nuevoLibro = biblioteca.imprimirLibro(24, "Jose", "Hola", TiposDeLibros.HISTORIA);
        Assertions.assertEquals("Hola", nuevoLibro.getNombre());
    }

    @Test
    public void queSePuedaDevolverLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro matematica1 = new Matematica(1, "unNombre", "unAutor");
        Estudiante unEstudiante = new Estudiante(39879575,"Larsen","Nicolas");

        biblioteca.agregarLibro(matematica1);
        biblioteca.prestarLibro(1,unEstudiante, "unNombre");

        Assertions.assertEquals((Integer)1, unEstudiante.getLibrosEnPosesion());

        biblioteca.devolverLibro(unEstudiante, "unNombre");

        Assertions.assertEquals((Integer)0, unEstudiante.getLibrosEnPosesion());
    }

}
