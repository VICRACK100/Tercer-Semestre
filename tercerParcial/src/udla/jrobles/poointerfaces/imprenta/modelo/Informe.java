package udla.jrobles.poointerfaces.imprenta.modelo;

public class Informe extends Hoja{

    private String autor;
    private String revisor;


    public Informe(String autor, String revisor,String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor=revisor;
    }

    @Override
    public String imprimir() {
        return "Hoja de Vida escrita por : " + this.autor +"\n" +
                "Hoja de vida revisada por : " + this.revisor +"\n" +
                "Contenido del CV : " + this.contenido;
    }
}
