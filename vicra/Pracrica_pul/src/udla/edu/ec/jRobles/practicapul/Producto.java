package udla.edu.ec.jRobles.practicapul;

public class Producto {
Producto info = new Producto();
public Producto(){}
    //Atributos
    private int id;
    private String nombre;
    private double precioCompra;
    private double precioVenta;
    private int cantidadDisponible;
    private int cantidadMinimaPermitida;
    private int diaReabastecimiento;
    private int cantidadMaximaPermitida;
    private int tiempoEntrega;

    //Constructores y destructores

    public Producto(int id, String nombre, double precioVenta, double precioCompra, int cantidadDisponible, int cantidadMinimaPermitida, int diaReabastecimiento, int cantidadMaximaPermitida, int tiempoEntrega) {
        this.id = id;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadMinimaPermitida = cantidadMinimaPermitida;
        this.diaReabastecimiento = diaReabastecimiento;
        this.cantidadMaximaPermitida = cantidadMaximaPermitida;
        this.tiempoEntrega = tiempoEntrega;
    }

    //Metodos propios de Java

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCantidadMinimaPermitida() {
        return cantidadMinimaPermitida;
    }

    public void setCantidadMinimaPermitida(int cantidadMinimaPermitida) {
        this.cantidadMinimaPermitida = cantidadMinimaPermitida;
    }

    public int getCantidadMaximaPermitida() {
        return cantidadMaximaPermitida;
    }

    public void setCantidadMaximaPermitida(int cantidadMaximaPermitida) {
        this.cantidadMaximaPermitida = cantidadMaximaPermitida;
    }

    public int getDiaReabastecimiento() {
        return diaReabastecimiento;
    }

    public void setDiaReabastecimiento(int diaReabastecimiento) {
        this.diaReabastecimiento = diaReabastecimiento;
    }

    public int getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(int tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    //Metodos del programador


}
