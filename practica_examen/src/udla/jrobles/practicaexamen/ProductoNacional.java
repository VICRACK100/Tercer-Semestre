package udla.jrobles.practicaexamen;

public class ProductoNacional extends Producto{
    private double impuestoNacional=0.12;

    /**Contructores y Destructores*/
    public ProductoNacional(int id, String nombre, int cantidadDisponibleProducto, int cantidadMinimaPermitida, double tiempoEntrega, double costoUnitario, int capacidadMaxima, double precioCompra, int diaReabastecimiento, int tipoProducto, double impuestoNacional) {
        super(id, nombre, cantidadDisponibleProducto, cantidadMinimaPermitida, tiempoEntrega, costoUnitario, capacidadMaxima, precioCompra, diaReabastecimiento, tipoProducto);
        this.impuestoNacional = impuestoNacional;
    }
}
