package modelos;

import interfases.IVendible;

public class Venta {
    /**Variables*/
    private IVendible producto;
    private int cantidad;

    /**Constructores y destructores*/
    public Venta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    /**Metodos propios de java*/

    /**Metodos del programador*/
    public double calcularPrecio(){
        producto.reducirStock(cantidad);
        return producto.calcularPrecioFinal()*cantidad;
    }
}
