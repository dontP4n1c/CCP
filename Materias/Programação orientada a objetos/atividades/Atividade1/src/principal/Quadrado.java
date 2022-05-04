
package principal;

public class Quadrado extends FormaGeometrica{
    
 public boolean calcularArea() {
        if ( altura > 0) {
            System.out.println("Info Quadrado");
            area =(largura*altura) ;
            return true;
        } else {
            lado=0;
            forma="forma nao identificada";
            System.out.println("Não é uma forma geometrica");
            return false;
        }
    }
}
