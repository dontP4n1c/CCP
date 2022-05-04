
package maximumtest;


public class MaximumTest 
{
    public static <T extends Comparable <T>> T getMaximum(T x , T y , T z) //metodo para a entrada generica de qualquer tipo de variaveis 
    {
        T max  = x;
        
        if(y.compareTo( max ) > 0)
        {
            max = y;
        }
        if(z.compareTo(max) > 0 )
        {
            max = z;
        }   
        return max;
    }
    public static <T extends Comparable <T>> T getMinimo(T x , T y , T z)
    {
        T min  = x;
        
        if(y.compareTo( min ) < 0)
        {
            min = y;
        }
        if(z.compareTo(min) < 0 )
        {
            min = z;
        }   
        return min;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(" O máximo de 3, 4, 5: ");
        System.out.println(getMaximum(3 , 4 , 5));
        System.out.println("--------------------------------------------");
        System.out.println(" O máximo de Gustavo, Felipe, Evelin: ");
        System.out.println(getMaximum("Gustavo" , "Felipe" , "Evelin"));
        System.out.println("--------------------------------------------");
        System.out.println(" O minimo de 3, 4, 5: ");
        System.out.println(getMinimo(3 , 4 , 5));
        System.out.println("--------------------------------------------");
        System.out.println(" O minimo de Gustavo, Felipe, Evelin: ");
        System.out.println(getMinimo("Gustavo" , "Felipe" , "Evelin"));
    }
    
}
