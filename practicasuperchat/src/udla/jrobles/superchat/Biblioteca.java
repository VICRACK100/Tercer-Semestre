package udla.jrobles.superchat;

import java.util.ArrayList;

public class Biblioteca {
    /**Atributos de la clase*/
    private String nombre;
    private String direccion;
    private String telefono;
    //Porque biblioteca necesita algunos recursos es una lista, ademas en el uml sale con la linea
    private ArrayList<Recurso> recursos;
    private int capacidad;

    /**Constructores y destructores*/

    public Biblioteca(String nombre, String direccion, String telefono, int capacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.recursos = new ArrayList<>();
        this.capacidad = capacidad;
    }

    /**Metodos de Java*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(ArrayList<Recurso> recursos) {
        this.recursos = recursos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**Metodos del programador*/
//Metodo para agregar recursos
    public void agregarRecursos(Recurso recurso){
        recursos.add(recurso);
        System.out.println("Recurso agregado");
    }

    //Empezamos a imprimir
    //Muestra todos los recursos
    public void mostrarTodosLosRecursos(){
        System.out.println("====Todos los recursos que se mostrar====");
        for (Recurso recurso : recursos) {
            System.out.println(recurso);
        }
    }

    //Muestra solo los tipo libro
    public void mostrarSoloLibros(){
        System.out.println("====Solo libros que se mostrar====");
        for (Recurso recurso : recursos) {
            if (recurso instanceof Libro) {
                System.out.println(recurso);
            }
        }
    }

    //Solo tipo revisa
    public void mostrarSoloRevistas() {
        System.out.println("=== SOLO REVISTAS ===");
        for (Recurso recurso : recursos) {
            if (recurso instanceof Revista) {
                System.out.println(recurso);
            }
        }
    }
}
