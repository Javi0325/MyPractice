package clase5pdm2024a;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Lacteo extends Producto{
    
     private String tipoLacteo;

    public Lacteo(String tipoLacteo, String codProducto, String nombre, double precio, int cantidad) {
        super(codProducto, nombre, precio, cantidad);
        this.tipoLacteo = tipoLacteo;
    }

    public String getTipoLacteo() {
        return tipoLacteo;
    }

    public void setTipoLacteo(String tipoLacteo) {
        this.tipoLacteo = tipoLacteo;
    }
    
     public double getCalcularDescuento(){
        return getCalcularCosto()*0.03;
    }
     
    public double getCalcularTotal(){
        return getCalcularCosto()-getCalcularDescuento();
    }
}
