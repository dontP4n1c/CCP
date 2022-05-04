
package mulherchata;

public class MulherMuitoChata 
{
    public static void main(String[] args)
    {
            System.out.println("Maior " + max(1,5,3));
            System.out.println("Menor " + max("Sé" , "Denis" , "Ana"));
    }
    public static <T extends Comparable <T>> T max( T x , T y , T z)//aqui esta criando um metedo de tipo generalizado
                                                            //que serve para comprar as variaveis entre uma e a outra
    {       
            T m = x;
            if(y.compareTo(m) > 0)
                    m=y;
            if(z.compareTo(m) > 0)
                m=z;
    
     return m;
    }
}
