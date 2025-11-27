package udla.jrobles.superchat;

public class Libro extends Recurso{
    /**Constructores y destructores super*/
private String genero;

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

    /**Metodos propios*/
    @Override
    public String toString() {
        return "Libro{" +
                "titulo ="      + getTitulo ()  + '\'' +
                "autor ="       + getAutor  ()  + '\'' +
                "isbn ="        + getIsbn   ()  + '\'' +
                "precio ="      + getPrecio ()  + '\'' +
                "disponible ="  + isDisponible()+ '\'' +
                "genero ="      + genero        + '\'' +
                '}';
    }
}
