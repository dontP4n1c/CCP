
package timedefutebol;

import javax.swing.JOptionPane;


public class TimeDeFutebol {

    
    public static void main(String[] args) {
        Times t1=new Times();
        System.out.println("=======================");
        t1.numeroDoTime=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de 1 a 3, para mostrar o time de futebol "));
        t1.Time();
        t1.ImprimirDetalhes();
        System.out.println("=======================");
    }
    
}
