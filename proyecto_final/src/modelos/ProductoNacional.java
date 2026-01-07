package modelos;

public class ProductoNacional extends Producto{
    /**Variables*/

    /**Constructores y destructores*/
    public ProductoNacional(int codigo, String nombre, double precio, int stock) {
        super(codigo, nombre, precio, stock);
    }
    /**Metodos propios*/

    /**Metodos propios del programador*/
@Override
    public void guardar() {
    System.out.println("Producto Nacional guardando");
}
@Override
    public void eliminar() {
    System.out.println("Producto Nacional eliminado");
}
@Override
    public double calcularPrecioFinal() {
    return precio;
}
}
