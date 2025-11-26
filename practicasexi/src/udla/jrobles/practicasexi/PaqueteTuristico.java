package udla.jrobles.practicasexi;

public class PaqueteTuristico extends Viaje{
    private boolean incluyeAlojamiento;
    private int duracionNoches;

    /**Constructores y destructores*/
    public PaqueteTuristico(String idViaje, String destino, String fechaSalida, String fechaRegreso, double precioBase, int cupoDisponible, boolean incluyeAlojamiento, int duracionNoches) {
        super(idViaje, destino, fechaSalida, fechaRegreso, precioBase, cupoDisponible);
        this.incluyeAlojamiento = incluyeAlojamiento;
        this.duracionNoches = duracionNoches;
    }
    /**Metodos de Java*/
    public boolean isIncluyeAlojamiento() {
        return incluyeAlojamiento;
    }

    public void setIncluyeAlojamiento(boolean incluyeAlojamiento) {
        this.incluyeAlojamiento = incluyeAlojamiento;
    }

    public int getDuracionNoches() {
        return duracionNoches;
    }

    public void setDuracionNoches(int duracionNoches) {
        this.duracionNoches = duracionNoches;
    }
}
