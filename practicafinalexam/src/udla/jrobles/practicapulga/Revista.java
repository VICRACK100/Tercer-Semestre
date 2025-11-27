package udla.jrobles.practicapulga;

public class Revista extends Recurso {
    private int numeropagina;

    /**Constructor*/
    public Revista(String titulo, String autor, String isbn, double precio, boolean disponible, int numeropagina) {
        super(titulo, autor, isbn, precio, disponible);
        this.numeropagina = numeropagina;
    }
    /**Metodos de Java*/
    public int getNumeropagina() {
        return numeropagina;
    }

    public void setNumeropagina(int numeropagina) {
        this.numeropagina = numeropagina;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numeropagina=" + numeropagina +
                "titulo=" + getTitulo() + '\'' +
                "autor=" + getAutor() + '\'' +
                "isbn=" + getIsbn() + '\'' +
                "precio=" + getPrecio() + '\'' +
                "Disponibilidad=" + isDisponible() + '\'' +
                '}';

    }
}
