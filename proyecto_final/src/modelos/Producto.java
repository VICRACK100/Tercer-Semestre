package modelos;
import interfases.IGestionable;
import interfases.IVendible;
public abstract class Producto implements IGestionable, IVendible {
/**Definicion de variables*/
protected int codigo;
protected String nombre;
protected double precio;
protected int stock;
/**Constructores y destructores*/
    public Producto(int codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
/**Metodos propios*/
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
/**Metodos propios del programador*/
@Override
    public void mostrar() {
    System.out.println(
            "Código: " + codigo +
                    " | Nombre: " + nombre +
                    " | Precio: $" + precio +
                    " | Stock: " + stock
    );
}
public void reducirStock(int cantidad) {
    stock = stock - cantidad;
}
}
