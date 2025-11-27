package udla.jrobles.superchat;

public class Revista extends Recurso {
    private int numeroPaginas;

    /**Constructores*/
    public Revista(String titulo, String autor, String isbn, double precio, boolean disponible, int numeroPaginas) {
        super(titulo, autor, isbn, precio, disponible);
        this.numeroPaginas = numeroPaginas;
    }

    /**Metodos de java*/

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Revista{"           +
                "titulo = "         + getTitulo()   +'\'' +
                "autor = "          + getAutor()    +'\'' +
                "isbn = "           + getIsbn()     +'\'' +
                "precio = "         + getPrecio()   +'\'' +
                "disponible = "     + isDisponible()+'\'' +
                "numeroPaginas="    + numeroPaginas +
                '}';
    }
}
