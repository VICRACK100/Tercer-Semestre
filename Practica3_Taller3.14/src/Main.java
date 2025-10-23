import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**3.14 (La clase Fecha) Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un día (tipo int) y un año (tipo int).
 Su clase debe tener un constructor que inicialice las tres variables de instancia, y debe asumir que los valores que se proporcionan son correctos.
 Proporcione un método establecer y un método obtener para cada variable de instancia. Proporcione un método mostrarFecha, que muestre el mes, día y año,
 separados por barras diagonales (/). Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha*/

Fecha fecha = new Fecha();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el día: ");
        fecha.setDia(sc.nextInt());
        System.out.println("Ingrese el mes: ");
        fecha.setMes(sc.nextInt());
        System.out.println("Ingrese el anio: ");
        fecha.setAnio (sc.nextInt());

        System.out.println(fecha.mostrarFecha(fecha.getDia(),fecha.getMes(),fecha.getAnio()));
    }

}