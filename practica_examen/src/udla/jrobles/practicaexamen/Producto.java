package udla.jrobles.practicaexamen;

public class Producto {
    /**Declaracion de variables*/
    private int id;
    private String nombre;
    private int cantidadDisponibleProducto;
    private int cantidadMinimaPermitida;
    private double tiempoEntrega;
    private double costoUnitario;
    private int capacidadMaxima;
    private double precioCompra;
    private int tipoProducto;
    private int diaReabastecimiento;

    /**Constructores y destructores*/
    public Producto(int id, String nombre, int cantidadDisponibleProducto, int cantidadMinimaPermitida, double tiempoEntrega, double costoUnitario, int capacidadMaxima, double precioCompra, int diaReabastecimiento, int tipoProducto) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadDisponibleProducto = cantidadDisponibleProducto;
        this.cantidadMinimaPermitida = cantidadMinimaPermitida;
        this.tiempoEntrega = tiempoEntrega;
        this.costoUnitario = costoUnitario;
        this.capacidadMaxima = capacidadMaxima;
        this.precioCompra = precioCompra;
        this.diaReabastecimiento = diaReabastecimiento;
        this.tipoProducto = tipoProducto;
    }


    /**Metodos propios de java*/
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

    public int getCantidadDisponibleProducto() {
        return cantidadDisponibleProducto;
    }

    public void setCantidadDisponibleProducto(int cantidadDisponibleProducto) {
        this.cantidadDisponibleProducto = cantidadDisponibleProducto;
    }

    public int getCantidadMinimaPermitida() {
        return cantidadMinimaPermitida;
    }

    public void setCantidadMinimaPermitida(int cantidadMinimaPermitida) {
        this.cantidadMinimaPermitida = cantidadMinimaPermitida;
    }

    public double getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(double tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }


    public int getDiaReabastecimiento() {
        return diaReabastecimiento;
    }

    public void setDiaReabastecimiento(int diaReabastecimiento) {
        this.diaReabastecimiento = diaReabastecimiento;
    }
    public int getTipoProducto() {
        return tipoProducto;
    }
    public void setTipoProducto(int tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
/**Metodos Propios del programador*/
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidadDisponibleProducto=" + cantidadDisponibleProducto +
                ", cantidadMinimaPermitida=" + cantidadMinimaPermitida +
                ", tiempoEntrega=" + tiempoEntrega +
                ", costoUnitario=" + costoUnitario +
                ", capacidadMaxima=" + capacidadMaxima +
                ", precioCompra=" + precioCompra +
                ", diaReabastecimiento=" + diaReabastecimiento +
                '}';
    }
}
