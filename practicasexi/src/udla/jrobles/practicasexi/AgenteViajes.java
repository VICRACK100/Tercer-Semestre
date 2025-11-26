package udla.jrobles.practicasexi;

import java.util.Scanner;

public class AgenteViajes {
    private String nombre;
    private String idEmpleado;
    private String turno;
    private double salario;
    private SucursalAgencia sucursalAsignada;
    Scanner sc = new Scanner(System.in);

    /**Constructores*/
    public AgenteViajes(String nombre, SucursalAgencia sucursalAsignada, double salario, String turno, String idEmpleado) {
        this.nombre = nombre;
        this.sucursalAsignada = sucursalAsignada;
        this.salario = salario;
        this.turno = turno;
        this.idEmpleado = idEmpleado;
    }

    /**Metodos de Java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SucursalAgencia getSucursalAsignada() {
        return sucursalAsignada;
    }

    public void setSucursalAsignada(SucursalAgencia sucursalAsignada) {
        this.sucursalAsignada = sucursalAsignada;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    /**Metodos propios del programador*/
    public void asignarSucursal(){
        System.out.println("Ingrese Nombre de la sucursal: ");
        String sucursal = sc.nextLine();
        System.out.println("Ingrese la direccion de la sucursal: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese el telefono de la sucursal: ");
        String telefono = sc.nextLine();
        System.out.println("Ingrese presupuesto mensual: ");
        double presupuesto = sc.nextDouble();

    }
}
