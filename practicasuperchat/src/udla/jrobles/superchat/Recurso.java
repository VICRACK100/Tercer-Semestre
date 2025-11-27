package udla.jrobles.superchat;

public class Recurso {
    /**Atributos de la clase*/
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private boolean disponible;

    /**Constructores y destructores*/
    public Recurso(String titulo, String autor, String isbn, double precio, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.disponible = disponible;
    }

    /**Metodos de Java*/
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    /**Metodos propios*/
}
