
package eva2_7_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class EVA2_7_Collections {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Primero-lista doble
        LinkedList <Integer> lista=new LinkedList<Integer>();
        lista.add(100);
        //Segundo--ArrayList--funciona con arreglos, usa arreglo para simular una lista
        ArrayList <String> arrayList=new ArrayList<String>();
        arrayList.add("Hola");
        arrayList.add("Mundo");
        arrayList.add("Cruel");
        //QUEUE; es una interfaz, no npodemos crear objetos
        Queue<Integer> queue =new LinkedList<Integer>();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);
        System.out.println(queue.peek());//lee el primer elemento
        System.out.println(queue.poll());//nuestro pop: lee y elimina
        //STACK
        Stack<String> stack=new Stack<String>();
        stack.push("Hola"); 
        stack.push(" ");
        stack.push("Mundo");
        stack.push("!!");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println((stack));
        
    }
    
}
