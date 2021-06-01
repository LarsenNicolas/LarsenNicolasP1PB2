package src.classes;
import src.enums.TiposDeLibros;

public class Libro {
    private Integer codigo;
    private String nombre;
    private String autor;
    private TiposDeLibros tipoDeLibro;
    private Boolean disponible;

    public Libro(Integer codigo, String nombre, String autor, TiposDeLibros tipoDeLibro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.tipoDeLibro = tipoDeLibro;
        this.disponible = true;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public TiposDeLibros getTipoDeLibro() {
        return tipoDeLibro;
    }

    public void setTipoDeLibro(TiposDeLibros tipoDeLibro) {
        this.tipoDeLibro = tipoDeLibro;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}
