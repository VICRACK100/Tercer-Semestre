import udla.jrobles.pooherencia.p1.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Estudiante alumno = new Estudiante ();
        Profesor profe = new Profesor();
        Scanner sc = new Scanner(System.in);
        alumno.setNombre("Juan");
        alumno.setApellido("Melchor");
        alumno.setGenero("Masculino");
        alumno.setEdad(21);
        alumno.setMateria("Programacion");
        alumno.setNotap1(7.2);
        alumno.setNotap2(7);
        alumno.setNotap3(5);

    //Persona.NUM_HIJOS;
        profe.setNombre("Victor");
        profe.setApellido("Rua");
        profe.setGenero("Masculino");
        profe.setEdad(45);

        System.out.println(profe.toString());
        System.out.println(alumno.toString());
        System.out.println(Persona.NUM_HIJOS);
    }
}
