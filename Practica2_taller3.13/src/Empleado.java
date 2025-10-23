public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    //Constructores y destructores

    public Empleado(String primerNombre, double salarioMensual, String apellidoPaterno) {
        this.primerNombre = primerNombre;
        this.salarioMensual = salarioMensual;
        this.apellidoPaterno = apellidoPaterno;
    }



    //Metodos propios de Java

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**Metodo */
    public  double salarioAnual() {
        return salarioMensual * 12;
    }

    /**Imprimir*/
    public String detalle (String Ne,String Ao,double Sl){
        String de;
        de= "El nombre del usuario es: "        +Ne+ "\n" +
                "El apellido del usuario es: "  +Ao+ "\n" +
                "El salario mensual es de :$"    +Sl+"\n" +
                "El salario anual es de: $"      +salarioAnual();
        return de;
    }
}
