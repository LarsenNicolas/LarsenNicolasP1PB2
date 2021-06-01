package src.classes;

public class Prestamo {
    private Integer id;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Integer id, Estudiante estudiante, Libro libro) {
        this.id = id;
        this.estudiante = estudiante;
        this.libro = libro;
    }
}
