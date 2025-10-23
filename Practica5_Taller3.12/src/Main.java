//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                /**3.12 (La clase Factura) Cree una clase llamada Factura que una ferretería podría utilizar para representar
                 una factura para un artículo vendido en la tienda.
                 Una Factura debe incluir cuatro piezas de información como variables de instancia:
                 un número de pieza (tipo String), la descripción de la pieza (tipo String),
                 la cantidad de artículos de ese tipo que se van a comprar (tipo int) y el precio por artículo (double).
                 Su clase debe tener un constructor que inicialice las cuatro variables de instancia.
                 Proporcione un método establecer y un método obtener para cada variable de instancia. Además, proporcione
                 un método llamado obtenerMontoFactura, que calcule el monto de la factura (es decir, que multiplique la cantidad
                 de artículos por el precio de cada uno) y después devuelva ese monto como un valor double. Si la cantidad no es
                 positiva, debe establecerse en 0. Si el precio por artículo no es positivo, debe establecerse en 0.0.
                 Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.*/

                Factura factura = new Factura("", 0.0, 0, "");
                Scanner sc = new Scanner(System.in);

                System.out.println("Ingrese el numero de pieza: ");
                factura.setNumeroPieza(sc.nextLine());
                System.out.println("Ingrese la descripcion de la pieza: ");
                factura.setDescripcionPieza(sc.nextLine());
                System.out.println("Ingrese la cantidad de articulos: ");
                factura.setCantidad(Integer.parseInt(sc.nextLine()));
                System.out.println("Ingrese el precio: ");
                factura.setPrecio(Double.parseDouble(sc.nextLine()));

                if (factura.getCantidad() < 0) {
                    factura.setCantidad(0);
                }

                if (factura.getPrecio() < 0){
                    factura.setPrecio(0.0);
                }

                System.out.println(factura.detalle(factura.getNumeroPieza(),factura.getDescripcionPieza(),factura.getCantidad(),factura.getPrecio()));
            }
        }

