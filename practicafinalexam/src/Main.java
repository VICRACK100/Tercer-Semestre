import udla.jrobles.practicapulga.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   /** Biblioteca biblioteca= new Biblioteca("","","",0);
    Libro libro = new Libro("","","",0,true,"");
    /**Ingresar*/
    /**biblioteca.recursos(libro);
    Bibliotecario bibliotecario = new Bibliotecario("",biblioteca,0,"","");
    bibliotecario.asignar(biblioteca);
    System.out.println(biblioteca);


    /**Asignar esta revista a la revista*/
    /**Revista revista = new Revista("","","",0,true,0);
    biblioteca.agregar(revista);

    /**imprimo*/
    /**biblioteca.mostrar();
    }*/
        // 1. Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Av. Siempreviva", "0999999999", 100);

        // 2. Ingresar un recurso genérico por teclado
        biblioteca.ingresarRecurso();

        // 3. Crear un libro y una revista "a mano" y agregarlos a la biblioteca
        Libro libro = new Libro("El Quijote", "Cervantes", "1111", 15.0, true, "Novela");
        biblioteca.agregar(libro);

        Revista revista = new Revista("Ciencia Hoy", "Varios", "2222", 5.5, true, 80);
        biblioteca.agregar(revista);

        // 4. Crear bibliotecario y asignar biblioteca
        Bibliotecario bibliotecario = new Bibliotecario("Juan", biblioteca, 800.0, "BIB001", "Mañana");
        bibliotecario.asignar(biblioteca);

        // 5. Imprimir todos los recursos de la biblioteca
        biblioteca.mostrar();

        System.out.println("\n=== DATOS DE LA BIBLIOTECA ===");
        System.out.println(biblioteca);

// Imprimir bibliotecario
        System.out.println("\n=== DATOS DEL BIBLIOTECARIO ===");
        System.out.println(bibliotecario);

        // 5. Imprimir todos los recursos
        biblioteca.mostrar();

// 6. Imprimir solo libros
        biblioteca.mostrarSoloLibros();

// 7. Imprimir solo revistas
        biblioteca.mostrarSoloRevistas();
    }



}