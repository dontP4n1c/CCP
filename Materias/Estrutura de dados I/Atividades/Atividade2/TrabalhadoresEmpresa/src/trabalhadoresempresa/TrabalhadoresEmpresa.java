package trabalhadoresempresa;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

public class TrabalhadoresEmpresa {
    //Armazenaremos os dados dos trabalhadores da empresa em um vetor:
    private Trabalhador trab[];
    private int N;
    
public static void main(String[] args) {
    TrabalhadoresEmpresa principal = new TrabalhadoresEmpresa();
    float[] salarios = new float[principal.getTrab().length];
    
    for (int i = 0; i < principal.getTrab().length;i++) {
        salarios[i] = principal.getTrab()[i].getSalario();
    }
    System.out.println(Arrays.toString(salarios));
    String[] nomes = new String[principal.getTrab().length];
    for (int i = 0; i < principal.getTrab().length;i++) {
        nomes[i] = principal.getTrab()[i].getNome();
    }
    
    quickSort(salarios,0,salarios.length-1);
    quickSortStr(nomes,0,nomes.length-1);
    //mostraTrabalhadoresPorSalario(salarios);
    //mostraTrabalhadoresPorNome(nomes);
}

    public static void mostraTrabalhadoresPorSalario(float[] salarios){
        String saida = "";
        TrabalhadoresEmpresa principal = new TrabalhadoresEmpresa();
        for(int i = 0; i < salarios.length;i++){
            for(int j = 0; j < salarios.length;j++){
                if(salarios[i] == principal.getTrab()[j].getSalario()){
                    saida += principal.getTrab()[j].toString() + "\n";
                }
            }
        }
        JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
        outputArea.setText(saida);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Trabalhadores cadastrados ordenados pelos salários em ordem decrescente",
	                    JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public static void mostraTrabalhadoresPorNome(String[] nomes){
        String saida = "";
        TrabalhadoresEmpresa principal = new TrabalhadoresEmpresa();
        for(int i = 0; i < nomes.length;i++){
            for(int j = 0; j < nomes.length;j++){
                if(nomes[i].equals(principal.getTrab()[j].getNome())){
                    saida += principal.getTrab()[j].toString() + "\n";
                }
            }
        }
        JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
        outputArea.setText(saida);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Trabalhadores cadastrados ordenados pelos nomes",
	                    JOptionPane.INFORMATION_MESSAGE);
        
    }

    public Trabalhador[] getTrab() {
        return trab;
    }

    public void setTrab(Trabalhador[] trab) {
        this.trab = trab;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }



public TrabalhadoresEmpresa () {
    simulacaoLeituraDeDados();
//    mostraTrabalhadoresCadastrados();
    
        
}

public void simulacaoLeituraDeDados() {
    //para efetuar testes rápidos, criamos um vetor de objetos com dados fixos:
    N = 7;
    trab = new Trabalhador[N];
    trab[0] = new Trabalhador("Julio",  2000f, 'M');
    trab[1] = new Trabalhador("Mariana",  1000, 'F');
    trab[2] = new Trabalhador("Renata",  800, 'F');
    trab[3] = new Trabalhador("Pedro",  1500f, 'M');
    trab[4] = new Trabalhador("Amilton",  6000f, 'M');
    trab[5] = new Trabalhador("Jorge",  2200f, 'M');
    trab[6] = new Trabalhador("Carlos",  3500f, 'M');
}

public void leituraDeDados () {
    String umNome; float umSalario;  char umSexo;
    N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de trabalhadores:"));
    trab = new Trabalhador[N];   //aloca memória para o vetor

    for (int i=0; i<N; i++){
	      umNome = JOptionPane.showInputDialog( "Digite o nome do trabalhador " + (i+1) + ": ");
	      umSalario = Float.parseFloat(JOptionPane.showInputDialog( "Digite o salário de " + umNome + ": "));
	      umSexo= JOptionPane.showInputDialog( "Digite o sexo deste trabalhador: ").charAt(0);
	      umSexo = Character.toUpperCase(umSexo);
    	  trab[i] = new Trabalhador(umNome, umSalario, umSexo); //aloca memória para o objeto (e executa o método construtor com parâmetros)
    	  // a inicialização anterior do objeto poderia ser em etapas:
    	  //	trab[i] = new Trabalhador();  //usando o construtor sem parâmetros
    	  //	trab[i].setNome(umNome);
    	  //	trab[i].setSalario(umSalario);
    	  //	trab[i].setSexo(umSexo);
    }
}

public void mostraTrabalhadoresCadastrados () {
    String cad = "";
    for (int i=0; i<N; i++) {
      cad +=  trab[i].toString()+ "\n";
    }    
    JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
    outputArea.setText(cad);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Dados dos trabalhadores cadastrados",
	                    JOptionPane.INFORMATION_MESSAGE);
}

 public static boolean quickSort (float[] vetor, int inicio, int fim) {
        //  Este método ordena um vetor de elementos de tipo double.
        //  Crie dois métodos para ordenar o vetor de objetos Trabalhador trab[]
        //  1) pelo atributo salário, 2) pelo atributo nome. 
        if (vetor == null) {
            return false;
        }   
        if (inicio < fim) {
           int posicaoPivo = separar (vetor, inicio, fim);
           quickSort(vetor, inicio, posicaoPivo - 1);
           quickSort(vetor, posicaoPivo + 1, fim);
        }        
        return true;
    }

 private static int separar (float[] vetor, int inicio, int fim){
      float pivo = vetor[inicio];
      int i = inicio + 1, f = fim;
      while (i <= f) {
         if (vetor[i] >= pivo) {
             i++;
         }
         else if (pivo > vetor[f]){
             f--;
         }
         else {
             float troca = vetor[i];
             vetor[i] = vetor[f];
             vetor[f] = troca;
             i++;
             f--;
         }
      }
      vetor[inicio] = vetor[f];
      vetor[f] = pivo;
      return f;
   }

   public static boolean quickSortStr (String[] vetor, int inicio, int fim) {
        //  Este método ordena um vetor de elementos de tipo double.
        //  Crie dois métodos para ordenar o vetor de objetos Trabalhador trab[]
        //  1) pelo atributo salário, 2) pelo atributo nome. 
        if (vetor == null) {
            return false;
        }   
        if (inicio < fim) {
           int posicaoPivo = separarStr (vetor, inicio, fim);
           quickSortStr(vetor, inicio, posicaoPivo - 1);
           quickSortStr(vetor, posicaoPivo + 1, fim);
        }        
        return true;
    }

 private static int separarStr (String[] vetor, int inicio, int fim){
      String pivo = vetor[inicio];
      int i = inicio + 1, f = fim;
      while (i <= f) {
         if (vetor[i].compareTo(pivo)<0) {
             i++;
         }
         else if (vetor[f].compareTo(pivo)>0){
             f--;
         }
         else {
             String troca = vetor[i];
             vetor[i] = vetor[f];
             vetor[f] = troca;
             i++;
             f--;
         }
      }
      vetor[inicio] = vetor[f];
      vetor[f] = pivo;
      return f;
   }
    
}
