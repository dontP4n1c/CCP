
package principal;

public class Triangulo extends FormaGeometrica{
    

    public boolean calcularArea() {
        if ( altura > 0) {
            System.out.println("Info Triangulo");
            area =(largura*altura)/2 ;
            return true;
        } else {
            lado=0;
            forma="forma nao identificada";
            System.out.println("Não é uma forma geometrica");
            return false;
        }
    }
    
}
