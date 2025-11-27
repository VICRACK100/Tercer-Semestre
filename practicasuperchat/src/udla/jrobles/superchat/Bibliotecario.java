package udla.jrobles.superchat;

public class Bibliotecario {
    /**Atributos de la clase*/
    private String nombre;
    private String id;
    private String turno;
    private double salario;
    //Este atributo esta bien porque vas a asignarlo
    private Biblioteca biblioteca;



    /**Constructores y Destructores*/

    public Bibliotecario(String nombre, String id, String turno, double salario, Biblioteca biblioteca) {
        this.nombre = nombre;
        this.id = id;
        this.turno = turno;
        this.salario = salario;
        this.biblioteca = biblioteca;

    }

    /**Metodos de Java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    /**Metodos del programador*/
    //Metodo para asignar una biblioteca
    public void asignarBiblioteca(Biblioteca biblioteca){
        this.biblioteca=biblioteca;
        System.out.println("Biblioteca asignada " + biblioteca.getNombre()+
                "fue asignada al bibliotecario " + nombre);

    }

}
