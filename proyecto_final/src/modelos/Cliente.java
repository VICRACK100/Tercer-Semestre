package modelos;
import interfases.IGestionable;
public class Cliente implements IGestionable {

    /**Variables*/
    private String nombre;
    private String cedula;

    /**Constructores y destructores*/
    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    /**Metodos propios de java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    /**Metodos propios*/
    @Override
    public void guardar() {
        System.out.println("Guardando Cliente");
    }
    @Override
    public void eliminar() {
        System.out.println("Cliente Eliminando ");
    }
    @Override
    public void mostrar() {
        System.out.println(nombre +"| CI: " + cedula);
    }
}
