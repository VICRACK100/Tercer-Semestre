package udla.jrobles.practicasexi;

public class Viaje {
    private String idViaje;
    private String destino;
    private String fechaSalida;
    private String fechaRegreso;
    private double precioBase;
    private int cupoDisponible;

    /**Constructores y destructores*/
    public Viaje(String idViaje, String destino, String fechaSalida, String fechaRegreso, double precioBase, int cupoDisponible) {
        this.idViaje = idViaje;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.precioBase = precioBase;
        this.cupoDisponible = cupoDisponible;
    }

    /**Metodos de Java*/
    public String getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(String idViaje) {
        this.idViaje = idViaje;
    }

    public int getCupoDisponible() {
        return cupoDisponible;
    }

    public void setCupoDisponible(int cupoDisponible) {
        this.cupoDisponible = cupoDisponible;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    /**Metodos del programador*/
    public double precioFinal(){
        double impuesto ;
        impuesto = precioBase * 0.10;
        precioBase +=impuesto;
        return precioBase;
    }
}
