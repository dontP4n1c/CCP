
package mulherchata;

public class Stack <E>
{   
    public static void main(String[] args)
    {
        Stack <Double> doubleStack = new Stack<Double>(3);
        Stack <String> stringStack = new Stack<String>(10);
        doubleStack.push(1.1);
        doubleStack.push(1.5);
        doubleStack.push(1.3);
        doubleStack.push(1.7);
        Double d1 = doubleStack.pop();
        if ( d1 != null)
        {
            System.out.println("Elemento removido " +d1);
        }else{System.out.println(d1);}
        stringStack.push("Oi");
    }

    private final int size; //número de elementos na pilha
    private int top; //localização do elemento superior
    private E[] elements; //array que armazena elementos na pilha 
    public Stack(int s)
    {
        size = s > 0 ? s:10;
        top = -1; //Stack inicialmente vazia
        elements = ( E[] ) new Object [size];
    }
    public int push ( E element )
    {
        if (top == size -1){
            System.out.println("Pilha cheia");
            return 0;
        }else{
            System.out.println("Inserindo " + element);
            elements[ ++top ] = element;
            return 1;
        }
    }
    public E pop()
    {
        if (top == -1)
        {
            System.out.println("Pilha vazia");
            return null;
        }
        return elements[ top-- ];
    }
}
