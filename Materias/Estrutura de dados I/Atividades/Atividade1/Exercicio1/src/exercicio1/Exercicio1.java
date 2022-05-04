
package exercicio1;
import java.util.Arrays;

public class Exercicio1 {

   
    public static void main(String[] args) {
          int i,Tvetor=9,crescente=0,decrescente=Tvetor-1,m =Tvetor/2;       
          float vetor[]={1,2,3,4,5,6,7,8,9},aux;        
          for(i=0;i<m;i++)
          {
              aux = vetor[decrescente];
              vetor[decrescente] = vetor[crescente];
              vetor[crescente] = aux; 
              crescente = crescente + 1;
              decrescente = decrescente - 1;
           }
          System.out.println(Arrays.toString(vetor));
    }
    
}
