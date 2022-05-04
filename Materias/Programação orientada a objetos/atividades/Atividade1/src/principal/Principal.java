
package principal;

import javax.swing.JOptionPane;
public class Principal {

    
    public static void main(String[] args) {
                 
        Triangulo formaT = new Triangulo();
        JOptionPane.showMessageDialog(null," ( ͡° ͜ʖ ͡°)\n Informe a altura das seguintes \n formas geometricas ");
        formaT.altura=Double.parseDouble(JOptionPane.showInputDialog(" Altura do Triangulo:"));
        formaT.largura=formaT.altura;
        formaT.lado=3;
        formaT.forma="Triangulo";
        formaT.calcularArea();
        formaT.printAll();
        
        Quadrado formaQ = new Quadrado();
        formaQ.lado=4;
        formaQ.altura=Double.parseDouble(JOptionPane.showInputDialog(" Altura do Quadrado: "));
        formaQ.largura=formaQ.altura;
        formaQ.forma="Quadrado";
        formaQ.calcularArea();
        formaQ.printAll();
        
        Retangulo formaR = new Retangulo();
        formaR.lado=4;
        formaR.altura=Double.parseDouble(JOptionPane.showInputDialog("Altura do Retangulo: "));;
        formaR.largura=formaR.altura*2;
        formaR.forma="Retangulo";
        formaR.calcularArea();
        formaR.printAll();
                
        if( formaT.altura >=1){
        JOptionPane.showMessageDialog(null," ( ͡° ͜ʖ ͡°)\n Area do Triangulo : "+formaT.area+"(cm)^2");
       }else{
        JOptionPane.showMessageDialog(null,"¯\\_( ͡° ͜ʖ ͡°)_/¯\n Area do Triangulo não encontrada  ");
        }if( formaQ.altura >=1){
        JOptionPane.showMessageDialog(null," ( ͡° ͜ʖ ͡°)\n Area do Quadrado : "+formaQ.area+"(cm)^2");
        
        }else{
        JOptionPane.showMessageDialog(null,"¯\\_( ͡° ͜ʖ ͡°)_/¯\n Area do Quadrado não encontrada  ");
        }if( formaR.altura >=1){
        JOptionPane.showMessageDialog(null," ( ͡° ͜ʖ ͡°)\n Area do Retangulo : "+formaR.area+"(cm)^2");
        
        }else{
        JOptionPane.showMessageDialog(null,"¯\\_( ͡° ͜ʖ ͡°)_/¯\n Area do Retangulo não encontrada  ");
        }
      JOptionPane.showMessageDialog(null,"( ͡° ͜ʖ ͡°)\n Fim da execução do programa  ");  
    }
    
}
