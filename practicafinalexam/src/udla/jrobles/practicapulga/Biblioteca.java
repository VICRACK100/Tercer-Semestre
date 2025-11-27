package udla.jrobles.practicapulga;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private String telefono;
    private int capacidad;
    /**cuando agrege un libro o revista lo meto aqui*/
    private ArrayList<Recurso> recursos;
    Scanner sc = new Scanner(System.in);

    /**Constructores y destructores*/
    public Biblioteca(String nombre, String direccion, String telefono, int capacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.capacidad = capacidad;
        this.recursos= new ArrayList<>();
    }

    /**Metodos de Java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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


    public void ingresarRecurso () {


        System.out.println("Ingrese el titulo del recurso");
        String titulo = sc.nextLine();

        System.out.println("Ingrese el autor del recurso");
        String autor = sc.nextLine();

        System.out.println("Ingrese el isbn del recurso");
        String isbn = sc.nextLine();

        System.out.println("Ingrese el precio del recurso");
        double precio = sc.nextDouble();

        System.out.println("Ingrese true si está disponible, caso contrario false");
        boolean disponible = sc.nextBoolean();
        sc.nextLine(); // limpiar el buffer

        /**Se crea el objeto y se agrega a la lista*/
        Recurso recurso = new Recurso(titulo, autor, isbn, precio, disponible);
        recursos.add(recurso);

        System.out.println("Recurso agregado correctamente.\n");
    }

    /** Agregar un recurso ya creado (Libro, Revista, etc.) */
    public void agregar(Recurso recurso){
        recursos.add(recurso);
    }

    /** Mostrar todos los recursos registrados en la biblioteca */
    public void mostrar (){
        System.out.println("=== LISTA DE RECURSOS DE LA BIBLIOTECA ===");
        for (Recurso recurso: recursos) {
            System.out.println(recurso);
        }
    }
    /**Como se imprime una biblioteca*/
    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", capacidad=" + capacidad +
                ", recursos=" + recursos +
                '}';
    }
    public void mostrarSoloLibros() {
        System.out.println("=== SOLO LIBROS ===");
        for (Recurso recurso : recursos) {
            if (recurso instanceof Libro) {
                System.out.println(recurso);
            }
        }
    }

    public void mostrarSoloRevistas() {
        System.out.println("=== SOLO REVISTAS ===");
        for (Recurso recurso : recursos) {
            if (recurso instanceof Revista) {
                System.out.println(recurso);
            }
        }
    }

    /**metodo para imprimir la lista*/

    /**recursos a la lista de recursos*/

}
