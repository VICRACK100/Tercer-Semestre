package udla.jrobles.practicasexi;

import java.util.ArrayList;

public class Excursion extends Viaje{
    private String puntoEncuentro;
    private static ArrayList<String> actividadesIncluidas = new ArrayList<>();
/**Constructores y destructores*/
    public Excursion(String idViaje, String destino, String fechaSalida, String fechaRegreso, double precioBase, int cupoDisponible, String puntoEncuentro) {
        super(idViaje, destino, fechaSalida, fechaRegreso, precioBase, cupoDisponible);
        this.puntoEncuentro = puntoEncuentro;
    }
    /**Metodos de Java*/
    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public void setPuntoEncuentro(String puntoEncuentro) {
        this.puntoEncuentro = puntoEncuentro;
    }

    public static ArrayList<String> getActividadesIncluidas() {
        return actividadesIncluidas;
    }

    public static void setActividadesIncluidas(ArrayList<String> actividadesIncluidas) {
        Excursion.actividadesIncluidas = actividadesIncluidas;
    }
}
