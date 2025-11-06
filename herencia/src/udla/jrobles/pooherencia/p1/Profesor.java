package udla.jrobles.pooherencia.p1;

public class Profesor extends Persona{
    /** Atributos de sub clase Profesor*/
    private String materia;

    /** Constructores y destructores*/
    /**Vacio*/
    public Profesor() {
    }

/** Propio*/
    public Profesor(String materia) {
        this.materia = materia;
    }

    /**Heredado*/
    public Profesor(String nombre, String genero, int edad, String apellido, String materia) {
        super(nombre, genero, edad, apellido);
        this.materia = materia;
    }

    /**Metodos propios de JAVA*/
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    /** Metodos propios del programador*/
    @Override
    public String toString() {
        return "Profesor{" +
                "materia='" + materia + '\'' +
                '}';
    }
}
