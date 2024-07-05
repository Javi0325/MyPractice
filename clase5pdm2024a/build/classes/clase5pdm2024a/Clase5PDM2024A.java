
package clase5pdm2024a;


public class Clase5PDM2024A {

    private static double montoTotal=0.0;
    public static void main(String[] args) {
        
        
        //producto
        Producto p1 = new Producto("PRO-001", "Carne", 15, 5);
        System.out.println("El costo del producto1 es: "
                +p1.getCalcularCosto());
        montoTotal+=p1.getCalcularTotal();
        
        Lacteo l1 = new Lacteo("Leche", "LCH-001", "Leche descremada", 6, 5);
        System.out.println("El precio del lacteo1 es: "
                +l1.getCalcularTotal());
        montoTotal+=l1.getCalcularTotal();
        
        /*mostrar factura final*/
        System.out.println("*****MONTO TOTAL A PAGAR*****");
        System.out.println("Monto Total = "
                +mostrarTotalFactura(montoTotal));
        
    }
    
    public static double mostrarTotalFactura(double monto){
        //double valor=0.0;
        if(monto>1000){    
            return monto-20; 
        }else if(monto>200){
            return monto-12;
        }else if(monto>100){
            return monto-5;
        }else{
            return monto;
        }
    }
    
}
