
package clase5pdm2024a;

public class Licor extends Producto{
    private String tipo;

    public Licor(String tipo, String codProducto, String nombre, double precio, int cantidad) {
        super(codProducto, nombre, precio, cantidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
    public double getCalcularDescuento(){
     return getCalcularCosto()*0.05;
    }
    
    public double getCalcularTotal(){
     return getCalcularCosto()-getCalcularDescuento();
    }
    
}
