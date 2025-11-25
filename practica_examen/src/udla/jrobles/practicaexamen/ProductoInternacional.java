package udla.jrobles.practicaexamen;

public class ProductoInternacional extends Producto{
    private double impuestoInternacional=0.20;

    /**Constructores y destructores*/
    public ProductoInternacional(int id, String nombre, int cantidadDisponibleProducto, int cantidadMinimaPermitida, double tiempoEntrega, double costoUnitario, int capacidadMaxima, double precioCompra, int diaReabastecimiento, int tipoProducto, double impuestoInternacional) {
        super(id, nombre, cantidadDisponibleProducto, cantidadMinimaPermitida, tiempoEntrega, costoUnitario, capacidadMaxima, precioCompra, diaReabastecimiento, tipoProducto);
        this.impuestoInternacional = impuestoInternacional;
    }
}

