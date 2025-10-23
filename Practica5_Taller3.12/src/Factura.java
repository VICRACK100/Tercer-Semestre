public class Factura {
    private String  numeroPieza;
    private String  descripcionPieza;
    private int     cantidad;
    private double  precio;

    //Constructores y destructores
    public Factura(String numeroPieza, double precio, int cantidad, String descripcionPieza) {
        this.numeroPieza = numeroPieza;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcionPieza = descripcionPieza;
    }

    //Metodos propios de Java

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //metodo
    public double obtenerMontoFactura(){
        return cantidad*precio;
    }

    //Imprimir
    public String detalle(String nP, String dP, int cD, double pO){
        String de;
        de= "El numero de piezas es: "          + nP + "\n" +
                "La descripcion de la pieza es : "  + dP + "\n" +
                "La cantidad de piezas es: "        + Integer.toString(cD) + "\n"+
                "El precio total es: "              + obtenerMontoFactura();
        return de;
    }
}