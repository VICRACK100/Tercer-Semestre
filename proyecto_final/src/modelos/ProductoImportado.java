package modelos;

public class ProductoImportado extends Producto{

    /**Variables*/
    private static final double impuesto = 0.20;
    /**Constructores y destructores*/
    public ProductoImportado(int codigo, String nombre, double precio, int stock) {
        super(codigo, nombre, precio, stock);
    }
    /**Metodos propios*/

    /**Metodos del programador*/

    @Override
    public double calcularPrecioFinal() {
        return precio +(precio*impuesto);
    }
    @Override
public void guardar() {
        System.out.println("Producto importado guardado");
    }
    @Override
    public void eliminar() {
        System.out.println("Producto importado eliminado");
    }
}
