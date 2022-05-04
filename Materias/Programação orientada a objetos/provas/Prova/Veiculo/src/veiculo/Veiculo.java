
package veiculo;

import javax.swing.JOptionPane;


public class Veiculo {

    
    public static void main(String[] args) {
        Bicicleta b1=new Bicicleta();
        b1.setCor(JOptionPane.showInputDialog("Qual o a cor da bike: "));
        b1.setTamanho(Integer.parseInt(JOptionPane.showInputDialog("0=pequeno\n1=medio\n 2=grande\n\n Qual o tamanho da bike: ")));
        b1.tamanho();
        b1.setQtdeMarchas((byte)20);
        b1.setTemRodinhas(true);
        System.out.println("===================================");
        b1.printAll();
       
    
    }
    
}
