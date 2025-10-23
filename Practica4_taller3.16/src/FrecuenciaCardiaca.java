import java.time.LocalDate;
import java.time.Period;

public class FrecuenciaCardiaca {

    /**Atributos de Clase*/
    private String primerNombre;
    private String apellido;
    private int fechaNacimientoAno;
    private int fechaNacimientoMes;
    private int fechaNacimientoDia;

    /**Constructor vacío*/
    public FrecuenciaCardiaca() {}

    /**Constructor con parámetros*/
    public FrecuenciaCardiaca(String primerNombre, String apellido, int ano, int mes, int dia) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.fechaNacimientoAno = ano;
        this.fechaNacimientoMes = mes;
        this.fechaNacimientoDia = dia;
    }

    /** Getters y Setters*/
    public String getPrimerNombre() { return primerNombre; }
    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getFechaNacimientoAno() { return fechaNacimientoAno; }
    public void setFechaNacimientoAno(int fechaNacimientoAno) { this.fechaNacimientoAno = fechaNacimientoAno; }

    public int getFechaNacimientoMes() { return fechaNacimientoMes; }
    public void setFechaNacimientoMes(int fechaNacimientoMes) { this.fechaNacimientoMes = fechaNacimientoMes; }

    public int getFechaNacimientoDia() { return fechaNacimientoDia; }
    public void setFechaNacimientoDia(int fechaNacimientoDia) { this.fechaNacimientoDia = fechaNacimientoDia; }

    /**Método para calcular edad exacta según la fecha actual*/
    public int edad() {
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = LocalDate.of(fechaNacimientoAno, fechaNacimientoMes, fechaNacimientoDia);
        Period diferencia = Period.between(nacimiento, hoy);
        return diferencia.getYears();
    }

    /**Metodo para calcular frecuencia cardiaca*/
    public int frecuenciaCardiacaMaxima(){
        return 220 - edad();
    }

    /**Metodo para calcular la Frecuencia Max y Min*/
    public double[] rangoFrecuenciaEsperada(){
        double min = frecuenciaCardiacaMaxima() * 0.50;
        double max = frecuenciaCardiacaMaxima() * 0.85;
        return new double[]{min,max};
    }

    /**Método para mostrar los datos del usuario*/
    public String detalleUsuario() {
        double [] rango = rangoFrecuenciaEsperada();
        return "Información del usuario:\n" +
                "Nombre Completo: "        +    primerNombre + " " + apellido + "\n" +

                "Fecha de nacimiento: "    +    fechaNacimientoDia + "/" +
                                                fechaNacimientoMes + "/" +
                                                fechaNacimientoAno + "\n" +

                "Su edad actual es: "      +    edad() + " años" + "\n" +
                "Su frecuencia cardiaca maxima es de: " + frecuenciaCardiacaMaxima() + "\n" +
                String.format("Rango esperado (50%%–85%%): %.2f – %.2f ppm", rango[0], rango[1]);
    }


}


