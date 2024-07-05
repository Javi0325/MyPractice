
package clase5pdm2024a;


public class Clase5PDM2024A {

    private static double montoTotal=0.0;
    public static void main(String[] args) {
       
        
        //Producto
        Producto p1=new Producto("PRO-001","Carne",15,5);
        System.out.println("El coste del producto es: "+p1.getCalcularCosto());
        
        montoTotal+=p1.getCalcularTotal();
        
        Lacteo l1=new Lacteo("Leche","LCH-001","Leche Descremada",6,5);
        System.out.println("El precio del lacteo es: "+l1.getCalcularTotal());
        
        montoTotal+=l1.getCalcularTotal();
        
        Verdura v1=new Verdura("Invierno","VER-001","Zanahoria",6,3); 
        System.out.println("El precio de la verdura es: "+v1.getCalcularTotal());
        
        montoTotal+=v1.getCalcularTotal();
        
        Licor li1=new Licor("Vino","LIC-001","ABUELO",6,4); 
        System.out.println("El precio del licor es: "+li1.getCalcularTotal());
        
        montoTotal+=li1.getCalcularTotal();
         
        System.out.println("*****MONTO TOTAL A PAGAR*****");
         System.out.println("Monto Total = "+mostrarTotalFactura(montoTotal));
         
        
}
    //Licor en clase principal
    //Verdura en costo el incremento
    public static double mostrarTotalFactura(double monto){ 
        double valor=0.0;
        if(monto > 1000){
            return monto-20;
        }else if(monto> 200){
            return monto-12;
        }else if(monto> 100){
            return monto-5;
        }else{
            return monto;    
        }
    }
}
