package udla.jrobles.poointerfaces.imprenta.modelo;

public abstract class Hoja {
    /**Declaracion de atributos*/
    protected  String contenido;

    /**Contructor*/
    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    /**Metodos abstractos*/
    abstract  public String imprimir();
}
