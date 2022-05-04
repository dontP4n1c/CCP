
package principal;

public class FormaGeometrica  {
 
    public int lado;
    public double altura;
    public double largura;
    public String forma;
    public double area;
    public boolean calcularArea;
            
   
     public boolean calcularArea(double calcA){
        System.out.println("Area é:");
        return false;
    }
    public void printAll(){
        
        System.out.println("lado: "+lado);
        System.out.println("altura: "+altura);
        System.out.println("largura: "+largura);
        System.out.println("area: "+area+"(cm)^2");
        System.out.println("forma: "+forma);


        System.out.println("=================================");
    }
    
}
