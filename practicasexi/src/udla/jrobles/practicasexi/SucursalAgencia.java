package udla.jrobles.practicasexi;

import java.util.ArrayList;
import java.util.Scanner;

public class SucursalAgencia {
    private String nombre;
    private String direccion;
    private String telefono;
    Scanner sc = new Scanner(System.in);
    public SucursalAgencia() {}
    private static ArrayList<Viaje> catalogoViajes = new ArrayList<>();
    /**Constructores y Destructores*/
    public SucursalAgencia(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    /**Metodos de Java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static ArrayList<Viaje> getCatalogoViajes() {
        return catalogoViajes;
    }

    public static void setCatalogoViajes(ArrayList<Viaje> catalogoViajes) {
        SucursalAgencia.catalogoViajes = catalogoViajes;
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
    /**Metodos propios de vicra*/
    public void agregarViaje(){
    int opcion = 0;
        System.out.println("======Agregue un Viaje======");
        System.out.println("1 Paquete Turistico | 2 Paquete Excursion");
        opcion = sc.nextInt();
        sc.nextLine();
        System.out.println("Agregue ID del viaje");
        String idViaje = sc.nextLine();
        System.out.println("Agregue el Destino del viaje");
        String destino = sc.nextLine();
        System.out.println("Agregue fecha de salida del viaje");
        String fechaSalida = sc.nextLine();
        System.out.println("Agregue la fecha de regreso del viaje");
        String fechaRegreso = sc.nextLine();
        System.out.println("Agregue el precio del viaje");
        double precio = sc.nextDouble();
        System.out.println("Agregue el cupo Disponible");
        int cupoDisponible = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Incluye alojamiento:");
            System.out.println("Si = true | NO = false");
            Boolean alojamiento = sc.nextBoolean();
            System.out.println("Ingrese la duracion de las noches");
            int duracion = sc.nextInt();

            catalogoViajes.add(new PaqueteTuristico(idViaje,destino,fechaSalida,fechaRegreso,precio,cupoDisponible,alojamiento,duracion));
        }
    }
}


