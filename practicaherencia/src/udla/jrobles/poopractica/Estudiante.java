package udla.jrobles.poopractica;

public class Estudiante extends Persona {
    private int semestre;
    private String carrera;

/**Constructores y Destructores*/
    /**
     * Constructor heredado
     */
    public Estudiante(String nombre, int edad, String apellido, int semestre, String carrera) {
        super(nombre, edad, apellido);
        this.semestre = semestre;
        this.carrera = carrera;
    }

    /**
     * Metodos propios de Java
     */
    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Metodos propios del programador
     */
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", semestre=" + semestre +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
