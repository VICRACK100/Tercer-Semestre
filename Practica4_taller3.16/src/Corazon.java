import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Corazon {
    public static void main(String[] args) {
/**3.16 (Calculadora de la frecuencia cardiaca esperada) Mientras se ejercita, puede usar un monitor de frecuencia cardiaca para ver que su corazón permanezca dentro de un
 // rango seguro sugerido por sus entrenadores y doctores. De acuerdo con la Asociación Estadounidense del Corazón (AHA)
 // (www.americanheart.org/presenter. jhtml?identifier=4736), la fórmula para calcular su frecuencia cardiaca máxima en pulsos por minuto es 220 menos su edad en años.
 // Su frecuencia cardiaca esperada tiene un rango que está entre el 50 y el 85% de su frecuencia cardiaca máxima.
 // [Nota: estas fórmulas son estimaciones proporcionadas por la AHA. Las frecuencias cardiacas máxima y esperada pueden variar con base en la salud, condición física y sexo del individuo.
 // Siempre debe consultar un médico o a un profesional de la salud antes de empezar o modificar un programa de ejercicios].
 // Cree una clase llamada FrecuenciasCardiacas. Los atributos de la clase deben incluir el primer nombre de la persona, su apellido y fecha de nacimiento
 // (la cual debe consistir de atributos independientes para el mes, día y año de nacimiento). Su clase debe tener un constructor que reciba estos datos como parámetros.
 // Para cada atributo debe proveer métodos establecer y obtener. La clase también debe incluir un método que calcule y devuelva la edad de la persona (en años),
 //  un método que calcule y devuelva la frecuencia cardiaca máxima de esa persona, y otro método que calcule y devuelva la frecuencia cardiaca esperada de la persona.
 //   Escriba una aplicación de Java que pida la información de la persona, cree una instancia de un objeto de la clase FrecuenciasCardiacas e imprima la información a
 //   partir de ese objeto (incluyendo el primer nombre de la persona, su apellido y fecha de nacimiento), y que después calcule e imprima la edad de la persona en (años),
 //   frecuencia cardiaca máxima y rango de frecuencia cardiaca esperada.*/

/**Atributos de Clase*/
        FrecuenciaCardiaca p1 = new FrecuenciaCardiaca();
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer Nombre: ");
        p1.setPrimerNombre(sc.next());

        System.out.print("Apellido: ");
        p1.setApellido(sc.next());

        System.out.print("Año de Nacimiento: ");
        p1.setFechaNacimientoAno(sc.nextInt());

        System.out.print("Mes de Nacimiento: ");
        p1.setFechaNacimientoMes(sc.nextInt());

        System.out.print("Día de Nacimiento: ");
        p1.setFechaNacimientoDia(sc.nextInt());


        System.out.println();
        System.out.println(p1.detalleUsuario());
    }
}