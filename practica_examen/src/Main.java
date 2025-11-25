import udla.jrobles.practicaexamen.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List<Producto> listaProducto = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /**Una pequeña empresa gestiona diversos productos en su inventario; sin embargo, enfrenta un problema crítico: al no contar con un sistema que
         controle el stock mínimo ni genere alertas automáticas, varios productos se agotan sin que los empleados se den cuenta. Esta situación provoca pérdidas de ventas,
         retrasos en los pedidos y un desorden general en la administración del inventario.

         Para solucionar este inconveniente, la empresa requiere desarrollar un programa en Java, utilizando principios de Programación Orientada a Objetos (POO),
         que permita registrar productos, monitorear sus cantidades, verificar el cumplimiento del stock mínimo y gestionar los pedidos de reabastecimiento
         de manera estructurada y eficiente.
         Cada producto debe almacenar información esencial para su control adecuado, incluyendo: ID del producto, nombre, cantidad disponible, cantidad mínima permitida
         (stock mínimo), tiempo de entrega del proveedor, costo unitario y la capacidad máxima o espacio disponible para dicho producto. Estos datos permiten establecer criterios
         claros para detectar riesgos de desabastecimiento y planificar la reposición de forma oportuna.

         El sistema debe incluir un menú, con opciones para registrar productos, consultar cantidades disponibles, vender productos, realizar pedidos de reabastecimiento y mostrar
         alertas cuando un producto esté por debajo del stock mínimo y generar alertas automáticas en caso se requiera.
         **/

        /** Interfaz del menu*/
        int opcion;
        do {
            mostrarMenu();
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine(); // Consumir la línea pendiente

                switch (opcion) {
                    case 1: registrarProducto();
                    break;
                    case 2: verProducto();
                    break;
                    case 3: editarProducto();
                    break;
                    case 4: eliminarProducto();
                    break;
                    case 5: venderProducto();
                    break;
                    case 6: rehabastecerProducto();
                    break;
                    case 7: System.out.println("\n Saliendo de la aplicación. ¡Hasta pronto!");
                    break;
                    default: System.out.println("\n Opción no válida. Inténtelo de nuevo.");

                }

            }else {
                System.out.println("\n Entrada no válida. Por favor, ingrese un número.");
                sc.nextLine(); // Consumir la entrada no válida
                opcion = 0; // Para que el bucle continúe
            }
            if (opcion != 6) {
                System.out.println("\n-------------------------------------------");
            }
        }while (opcion != 6);
        sc.close();

        }




    /**Metodos de la interfaz*/
    private static void mostrarMenu() {
        System.out.println("========================================");
        System.out.println("            SISTEMA DE PRODUCTOS        ");
        System.out.println("========================================");

        System.out.println("1. Registrar producto");
        System.out.println("2. Ver productos y alertas");
        System.out.println("3. Editar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Vender producto");
        System.out.println("6. Reabastecer producto");
        System.out.println("7. Salir");
        System.out.println("Selecciona una opcion: ");

    }
    /**Metodos de Gestion*/
    private static void registrarProducto() {
        System.out.println("Ingreso de un nuevo producto: ");
        String nombre = sc.nextLine();
        System.out.println("Ingreso del ID del producto: ");
        int id = sc.nextInt();
        System.out.println("Ingrese el precio de compra del producto: ");
        double precioCompra = sc.nextDouble();
        System.out.println("Ingrese el precio de venta del producto: ");
        double costoUnitario = sc.nextDouble();
        System.out.println("Ingrese la cantidad máxima del producto: ");
        int cantidadMaxima = sc.nextInt();
        System.out.println("Ingrese la cantidad disponible del producto: ");
        int cantidadDisponible = sc.nextInt();
        System.out.println("Ingrese la cantidad minima del producto: ");
        int cantidadMinima = sc.nextInt();
        System.out.println("Ingrese el día de rehabastecimiento: ");
        int diaRehabastecimiento = sc.nextInt();
        System.out.println("Ingrese el tiempo de entrega en días: ");
        int tiempoEntrega = sc.nextInt();
        System.out.println("Ingrese 1. si el producto es nacional o 2. si es extranjero");
        int tipoProducto = sc.nextInt();

        Producto nuevoProducto = new Producto(id,nombre,cantidadDisponible,cantidadMinima,tiempoEntrega,costoUnitario,cantidadMaxima,precioCompra,diaRehabastecimiento,tipoProducto);
        listaProducto.add(nuevoProducto);
        System.out.println("Producto registrado exitosamente.");
    }
    private static void verProducto() {

    }
    private static void editarProducto() {

    }
    private static void eliminarProducto() {

    }
    private static void venderProducto() {

    }
    private static void rehabastecerProducto() {

    }

}