package udla.jrobles.practicapulga;

public class Libro extends Recurso {
    private String genero;

    /**Constructores*/
    public Libro(String titulo, String autor, String isbn, double precio, boolean disponible, String genero) {
        super(titulo, autor, isbn, precio, disponible);
        this.genero = genero;
    }

    /**Metodos de java*/
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "genero='" + genero + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", precio=" + getPrecio() +
                ", disponible=" + isDisponible() +
                '}';
    }
}
