package udla.jrobles.poopractica;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;



    /**Constructores y destructores*/
    public Persona() {
    }

    public Persona(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    /**Metodos propios de Java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**Metodos del programador*/

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
