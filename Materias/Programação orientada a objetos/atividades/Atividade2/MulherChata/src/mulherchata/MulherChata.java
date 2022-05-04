
package mulherchata;

public class MulherChata {

   
    public static void main(String[] args) 
    {
       Integer[] integerArray = { 1, 2, 3, 4};
       Double[] doubleArray = {1.1 , 2.2 , 3.3 , 4.4};
       Character[] characterArray = {'O' , 'I' };
        System.out.println("Array integerArray contém: ");
        printArray( integerArray );
        System.out.println("\nArray doubleArray contém: ");
        printArray( doubleArray);
        System.out.println("\nArray characterArray contem: ");
        printArray( characterArray );
        
        
    }
    public static void printArray(Integer[] inputArray) // metodos criado para receber cada um receber tipo diferente de variavel
    {
        for (Integer element : inputArray)        
            System.out.printf(" %s " , element);        
    }public static void printArray(Double[] inputArray)
    {
        for (Double element : inputArray)        
            System.out.printf(" %s " , element);        
    }
    public static void printArray(Character[] inputArray)
    {
        for (Character element : inputArray)        
            System.out.printf(" %s " , element);        
    }
    
    public static <T> void printArray(T[] inputArray) // metodo do tipo T , para reeber qualquer tipo de 
    {                                             //variavel aqui nesse unico metodo em vez de fazer aqueles tres 
                                              //diferentes, poderia ser feito apenas esse
        for (T element : inputArray)        
            System.out.printf(" %s " , element);        
    }
}
