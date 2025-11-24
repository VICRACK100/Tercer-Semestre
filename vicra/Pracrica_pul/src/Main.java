import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println(" Tienda Inventario");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Ver productos y alertas");
            System.out.println("3. Editar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Vender Producto");
            System.out.println("6. Reabastecer producto");
            System.out.println("7. Salir");
            System.out.println("Selecciona una opcion:  ");
            opcion = sc.nextInt();
        }

        while (opcion != 7);
    }
}