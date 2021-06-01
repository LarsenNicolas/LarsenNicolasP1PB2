import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.classes.*;

public class test {
    @Test
    public void queSePuedaPrestarLibroAEstudiante() {
        Biblioteca biblioteca = new Biblioteca();
        Libro matematica1 = new Matematica(1, "unNombre", "unAutor");
        Estudiante unEstudiante = new Estudiante(39879575,"Larsen","Nicolas");

        biblioteca.agregarLibro(matematica1);
        biblioteca.prestarLibro(unEstudiante, "unNombre");

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

        biblioteca.prestarLibro(unEstudiante, "unNombre");
        biblioteca.prestarLibro(unEstudiante, "guerra");

        Assertions.assertEquals(false, biblioteca.prestarLibro(unEstudiante, "planos"));
    }
}
