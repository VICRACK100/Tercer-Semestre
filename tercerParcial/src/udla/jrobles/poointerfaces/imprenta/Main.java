package udla.jrobles.poointerfaces.imprenta;

import udla.jrobles.poointerfaces.imprenta.modelo.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Curriculo cv = new Curriculo("JJ","Ing de Software","Resumen Laboral");
cv.addConocimiento("Java");
cv.addConocimiento("Angular");
cv.addConocimiento("Spring Boot Framework");
cv.addConocimiento("Desarrollador FullStack");
cv.addConocimiento("Oracle DBA");

Informe inf =new Informe("JJ","Triste","Estudio de Micro Servicios");
    imprime(cv);
    imprime(inf);
    }





    public static void imprime(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }

}