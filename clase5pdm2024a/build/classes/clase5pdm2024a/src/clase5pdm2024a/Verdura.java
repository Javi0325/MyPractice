package clase5pdm2024a;


public class Verdura extends Producto{
     private String temporada;

    public Verdura(String temporada, String codProducto, String nombre, double precio, int cantidad) {
        super(codProducto, nombre, precio, cantidad);
        this.temporada = temporada;
    }
    
    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    
    public double getCalcularDescuento(){
     return getCalcularCosto()*0.05;
    }

    public double getCalcularTotal(){
      return getCalcularCosto()+getCalcularDescuento();
    }

    


          
}
