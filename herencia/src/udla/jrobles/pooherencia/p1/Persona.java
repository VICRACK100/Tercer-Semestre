package udla.jrobles.pooherencia.p1;

public class Persona {
    /** Atributos de la super clase Persona*/
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;

    /**Creacion de atributos estaticos*/
    private static  int id = 69;

    /**Creacion de constantes*/
    public static final Integer NUM_HIJOS =3;

    /** Contructores y destructores*/
    public Persona() {
    }

    public Persona(String nombre, String genero, int edad, String apellido) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.apellido = apellido;
    }

    /** Metodos propios de Java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    /** Metodos propios del desarollador*/


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='"      + nombre    + "\n" +
                ", apellido='"  + apellido  + "\n" +
                ", edad="       + edad      + "\n"+
                ", genero='"    + genero    + "\n" +
                '}';
    }
}
