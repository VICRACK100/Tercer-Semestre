import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**3.13 (La clase Empleado) Cree una clase llamada Empleado, que incluya tres variables de instancia: un primer nombre (tipo String),
 * un apellido paterno (tipo String) y un salario mensual (double). Su clase debe tener un constructor que inicialice las tres variables de instancia.
 * Proporcione un método establecer y un método obtener para cada variable de instancia. Si el salario mensual no es positivo, no establezca su valor.
 * Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado. Cree dos objetos Empleado y muestre el
 * salario anual de cada objeto. Después, proporcione a cada Empleado un aumento del 10% y muestre el salario anual de cada Empleado otra vez.*/

/**Creacion de objetos*/
        Empleado e1 = new Empleado("",0.0,"");
        Empleado e2= new Empleado("",0.0,"");
        Scanner sc = new Scanner(System.in);

        /**Leer los datos de cada empleado*/
        /**Empleado 1*/
        System.out.println("Ingrese el nombre del empleado: ");
        e1.setPrimerNombre(sc.nextLine());
        System.out.println("Ingrese el apellido del empleado: ");
        e1.setApellidoPaterno(sc.nextLine());
        System.out.println("Ingrese el salario del empleado: ");
        e1.setSalarioMensual(Double.parseDouble(sc.nextLine()));

        /**Empleado 2*/
        System.out.println("Ingrese el nombre del empleado: ");
        e2.setPrimerNombre(sc.nextLine());
        System.out.println("Ingrese el apellido del empleado: ");
        e2.setApellidoPaterno(sc.nextLine());
        System.out.println("Ingrese el salario del empleado: ");
        e2.setSalarioMensual(Double.parseDouble(sc.nextLine()));

        if (e1.getSalarioMensual() < 0){
            e1.setSalarioMensual(0);
        }
        if (e2.getSalarioMensual() < 0){
            e2.setSalarioMensual(0);
        }

        System.out.println(e1.detalle(e1.getPrimerNombre(), e1.getApellidoPaterno(), e1.getSalarioMensual()));
        System.out.println();
        System.out.println(e2.detalle(e2.getPrimerNombre(), e2.getApellidoPaterno(), e2.getSalarioMensual()));
    }
}