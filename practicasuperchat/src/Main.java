import udla.jrobles.superchat.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca(
                "Bibliotrca Central",
                "Av.Las Casas",
                "0983731262",
                25
        );
        // 2) Crear recursos (Libros y Revistas)
        Libro libro1 = new Libro(
                "El Quijote",
                "Miguel de Cervantes",
                "ISBN-001",
                20.0,
                true,
                "Novela"
        );

        Libro libro2 = new Libro(
                "Clean Code",
                "Robert C. Martin",
                "ISBN-002",
                35.5,
                true,
                "Programación"
        );
        Revista revista1 = new Revista(
                "National Geographic",
                "Varios",
                "ISSN-100",
                7.5,
                true,
                80
        );
        // 3) Agregar los recursos a la biblioteca
        biblioteca.agregarRecursos(libro1);
        biblioteca.agregarRecursos(libro2);
        biblioteca.agregarRecursos(revista1);
        // 4) Crear un bibliotecario
        Bibliotecario bibliotecario1 = new Bibliotecario(
                "Ana Pérez",
                "BIB-001",
                "Mañana",
                900.0,
                null   // por ahora sin biblioteca
        );
        //Asignar una biblioteca a un bibliotecario
        bibliotecario1.asignarBiblioteca(biblioteca);

        // 6) (Opcional pero recomendado) lista de bibliotecarios
        ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
        bibliotecarios.add(bibliotecario1);

        // 7) Imprimir detalles
        System.out.println("\n=== DETALLES DE LA BIBLIOTECA ===");
        System.out.println("Nombre: " + biblioteca.getNombre());
        System.out.println("Dirección: " + biblioteca.getDireccion());
        System.out.println("Teléfono: " + biblioteca.getTelefono());
        System.out.println("Capacidad: " + biblioteca.getCapacidad());

        System.out.println("\n=== DETALLES DE LOS BIBLIOTECARIOS ===");
        for (Bibliotecario b : bibliotecarios) {
            System.out.println("Nombre: " + b.getNombre()
                    + ", ID: " + b.getId()
                    + ", Turno: " + b.getTurno()
                    + ", Salario: " + b.getSalario()
                    + ", Biblioteca: " + b.getBiblioteca().getNombre());
        }

        // 8) Imprimir TODOS los recursos
        biblioteca.mostrarTodosLosRecursos();

        // 9) Imprimir SOLO libros
        biblioteca.mostrarSoloLibros();

        // 10) Imprimir SOLO revistas
        biblioteca.mostrarSoloRevistas();
    }

}
