
package exercicio2;
import java.util.Arrays;

public class Exercicio2 {

  
    public static void main(String[] args) {
         int[] arrayNome = new int[] { 1,2,3,4,5,6 };
          int tamanho = arrayNome.length;
          int[] arrayAux = new int[tamanho];
        for (int i = 0; i < arrayAux.length; i++) {
            tamanho--;
            arrayAux[i] = arrayNome[tamanho];
}
          System.out.println(Arrays.toString(arrayAux));
    }
    
}
