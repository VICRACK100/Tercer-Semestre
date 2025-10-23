public class Fecha {
    /**Creacion de variables*/
    private int  dia;
    private int mes;
    private int anio;

    /**Creacion de constructores*/
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public Fecha() {

    }


    /**Creacion de metodos propios de Java*/
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String mostrarFecha(int dI,int mE,int aN){
        String de;
        de= "La fecha es: " + dI + " / " + mE + " / " + aN;
        return de;
    }


}
