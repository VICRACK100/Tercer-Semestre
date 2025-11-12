import udla.jrobles.poopractica.Estudiante;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("",0,"",0,"");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante");
        e1.setNombre(sc.next());
        System.out.println("Ingrese el apellido del estudiante");
        e1.setApellido(sc.next());
        System.out.println("Ingrese el edad del estudiante");
        e1.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el carrera del estudiante");
        e1.setCarrera(sc.next());
        System.out.println("Ingrese el semestre del estudiante");
        e1.setSemestre(sc.nextInt());

        /**Mostrar datos*/
        System.out.println("Los datos del estudiante son: ");
        sc.nextLine();
        System.out.println(e1.toString());

    }
}