//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import modelos.*;
public class Main {
    public static void main(String[] args) {
Producto p1 = new ProductoNacional(1,"Arroz",1.50,20);
Producto p2 = new ProductoImportado(2,"Chocolate",2.00,10);

Cliente c1 = new Cliente("Carlos Sanchez","0402040018");
c1.mostrar();
p1.mostrar();
p2.mostrar();

Venta v1 = new Venta(p1,3);
Venta v2 = new Venta(p2,5);

        System.out.println("Total venta: $ " + v1.calcularPrecio());
        System.out.println("Total venta: $ " + v2.calcularPrecio());
    }
}