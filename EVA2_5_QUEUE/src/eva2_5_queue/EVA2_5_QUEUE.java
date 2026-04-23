
package eva2_5_queue;


public class EVA2_5_QUEUE {


    public static void main(String[] args) {
        // TODO code application logic here
         Queue cola = new Queue();

        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);
        cola.enqueue(50);

        System.out.println("Primer elemento (peek): " + cola.peek());

       
        System.out.println("Se elimina: " + cola.Dequeue());
        System.out.println("Se elimina: " + cola.Dequeue());

        
        System.out.println("Nuevo inicio (peek): " + cola.peek());

        
        System.out.println("Se elimina: " + cola.Dequeue());
        System.out.println("Se elimina: " + cola.Dequeue());
        System.out.println("Se elimina: " + cola.Dequeue());

       

    }
    
}
