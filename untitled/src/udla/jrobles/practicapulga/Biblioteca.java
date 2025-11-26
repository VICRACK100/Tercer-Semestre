package udla.jrobles.practicapulga;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private String telefono;
    private int capacidad;
    private Recurso recurso;
    Scanner sc = new Scanner(System.in);

    /**Constructores y destructores*/
    public Biblioteca(String nombre, String direccion, String telefono, int capacidad, Recurso recurso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.capacidad = capacidad;
        this.recurso = recurso;
    }

    /**Metodos de Java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**Metodos propios*/
    private ArrayList<Recurso> agregar = new ArrayList<>();
    public void recursos (){

        System.out.println("Ingrese el titulo del libro");
String titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro");
String autor = sc.nextLine();
        System.out.println("Ingrese el isbn del libro");
String isbn = sc.nextLine();
        System.out.println("Ingrese el precio del libro");
double precio = sc.nextDouble();
        System.out.println("Ingrese el true si esta disponible caso contrario false");
boolean disponible = sc.nextBoolean();

agregar.add(new Recurso(titulo,autor,isbn,precio,disponible));
    }
}


