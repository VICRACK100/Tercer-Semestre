package udla.jrobles.pooherencia.p1;

public class Estudiante extends Persona{
    /**Atributos de la subclase Estudiante*/
    private  String materia;
    private double notap1;
    private double notap2;
    private double notap3;

    /**Constructores y destructores*/
    public Estudiante() {
    }

    public Estudiante(String materia, double notap3, double notap2, double notap1) {
        this.materia = materia;
        this.notap3 = notap3;
        this.notap2 = notap2;
        this.notap1 = notap1;
    }

    public Estudiante(String nombre, String genero, int edad, String apellido, String materia, double notap3, double notap2, double notap1) {
        super(nombre, genero, edad, apellido);
        this.materia = materia;
        this.notap3 = notap3;
        this.notap2 = notap2;
        this.notap1 = notap1;
    }

    /**Metodos propios de JAVA*/
    public double getNotap1() {
        return notap1;
    }

    public void setNotap1(double notap1) {
        this.notap1 = notap1;
    }

    public double getNotap2() {
        return notap2;
    }

    public void setNotap2(double notap2) {
        this.notap2 = notap2;
    }

    public double getNotap3() {
        return notap3;
    }

    public void setNotap3(double notap3) {
        this.notap3 = notap3;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    /**Metodos propios del programador*/
    @Override
    public String toString() {
        return "Estudiante{" +
                "materia='" + materia + "\n"    +
                ", notap1=" + notap1 +  "\n"    +
                ", notap2=" + notap2 +  "\n"    +
                ", notap3=" + notap3 +  "\n"    +
                '}';
    }
}
