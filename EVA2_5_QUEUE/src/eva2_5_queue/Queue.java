
package eva2_5_queue;


public class Queue {
    private Nodo inicio;
     private Nodo fin;
     private int cont;
     public Queue(){
         inicio=null;//La cola empieza vacia
         fin=null;// no hay ultimo nodo
         cont=0;//no hay elementos
     }
    public void enqueue(int valor){// para meter a la cola un nuevo nodo
        Nodo nuevo=new Nodo();
        if(inicio==null){//si la cola esta vacia
            //en este caso inicio y fin aveces apuntan al mismo nodo
            inicio=nuevo;
        }else{//Aqui entra REALMENTE EL NUEVO NODO
            fin.setSiguiente(nuevo); //el ultimo nodo apunta al nuevo
            nuevo.setPrevio(fin);//el nuevo apunta hacia atras
            fin=nuevo;// ahora el nuevo es el ultimo
        }
        
      cont ++;  
    }
    public int Dequeue(){// lo que hace es que (saca):
        //regresa el valor de inicio
        //elimina ese nodo
        //mueve el inicio al siguiente 
        int valor = 0;
        if(inicio!=null){//si inicio es diferente de null, ENTONCES
            valor=inicio.getValor(); //guardo el valor de inicio(p1)
            inicio=inicio.getSiguiente();//(paso2)y muevo el inicio *si despues de mover, inicio queda null, entonces:
            if(inicio==null){ //caso de que este vacia si inicio es igual a null(p4) es un caso especial si se queda la cola vacia
            fin=null;
        }
        } else{// Caso en que no este vacia tenemos que quitar el enlace hacia atras
            inicio.setPrevio(null);//inicio-->null (p3) el nuevo inicio ya no debe tener anterior
        }
      cont --; 
      return valor;
    } 
    //peek, solo mira el valor del inicio
    public int peek(){
        if(inicio!=null){
            return inicio.getValor();
            
        }else {
            throw new RuntimeException("La cola esta vacia");
        }
    }
    
}
