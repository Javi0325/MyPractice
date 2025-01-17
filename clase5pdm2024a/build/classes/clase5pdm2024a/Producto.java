
package clase5pdm2024a;

public class Producto {
    private String codProducto;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String codProducto, String nombre, double precio, int cantidad) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
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
    
    public double getCalcularCosto(){
        return precio*cantidad;
    }
    public double getCalcularDescuento(){
        return 0.0;
    }
    
    public double getCalcularTotal(){
        return getCalcularCosto()-getCalcularDescuento();
    }
    
    
}
