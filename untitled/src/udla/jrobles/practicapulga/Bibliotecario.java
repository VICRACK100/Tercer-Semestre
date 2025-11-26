package udla.jrobles.practicapulga;

public class Bibliotecario{
    private String nombre;
    private String turno;
    private String id;
    private double salario;
    private Biblioteca biblioteca;
    /**Constructores*/
    public Bibliotecario(String nombre, Biblioteca biblioteca, double salario, String id, String turno) {
        this.nombre = nombre;
        this.biblioteca = biblioteca;
        this.salario = salario;
        this.id = id;
        this.turno = turno;
    }
/**Metodos de java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
