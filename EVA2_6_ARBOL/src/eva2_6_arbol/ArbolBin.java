
package eva2_6_arbol;


public class ArbolBin {
    private Nodo raiz;
    //constructor
    public ArbolBin(){
        this.raiz=null;//arbol vacio
        
    }
    public void agregar(int valor){
        //verificar si hay nodos en el arbol
        //si el arbol esta vacio:facil
        if(raiz==null){//si la raiz esta vacia, el arbol esta vacio 
           raiz=new Nodo(valor); 
        }else {//RECURSIVIDAD
          agregarRecu(raiz, valor); 
            
        }
        
    }
    //su EFICIENCIA ES O(log2N), es de las mejores eficiencias---->solo si es un arbol balanceado(misma cantidad de nodos a la isquierda que a la derecha)
    //O(N)-->CUANDO EL ARBOL NO ESTA BALANCEADO
    public void agregarRecu(Nodo actual,int valor){
       if(valor<actual.getValor()){//lado izq.
           if(actual.getIzquierda()==null){
//espacio disponible
               //insertamos
               Nodo nuevo=new Nodo(valor);
               actual.setIzquierda(nuevo);//agregamos el nuevo nodo a la izquierda
           
       }else {//espacio esta ocupado
               //movernos
               agregarRecu(actual.getIzquierda(),valor);
               
           }
               if(valor>actual.getValor()){
             //lado derecho
         if(actual.getDerecha()==null){
            //espacio disponible
               //insertamos
               Nodo nuevo=new Nodo(valor);
               actual.setDerecha(nuevo);//agregamos el nuevo nodo a la izquierda
           
       }else {//espacio esta ocupado
               //movernos
               agregarRecu(actual.getDerecha(),valor); 
               }    
               }
    }
    
}
    public void imprimirPreOrder(){
        imprimirPreOrderRec(raiz);//iniciamos en root
    }
    public void imprimirPreOrderRec(Nodo actual){
        if(actual!=null){
            System.out.println("["+actual.getValor()+"]");//visitar el nodo
        //RECORRER AL LADO IZQUIERDO
        imprimirPreOrderRec(actual.getIzquierda());
        //RECORRER EL LADO DERECHO
        imprimirPreOrderRec(actual.getDerecha());
        }
    }
    public void imprimirPosOrder(){
        imprimirPreOrderRec(raiz);
    }
    public void imprimirPosOrderRec(Nodo actual){
        if(actual!=null){
            imprimirPosOrderRec(actual.getIzquierda());//recorre izquierda
            imprimirPosOrderRec(actual.getDerecha());//recorre derecha
            System.out.println("["+actual.getValor()+"]");//viasita el nodo
            
        }
    }
    public void imprimirInOrder(){
        imprimirInOrderRec(raiz);
    }
    public void imprimirInOrderRec(Nodo actual){
        if(actual!=null){
            
        //RECORRER AL LADO IZQUIERDO
        imprimirPreOrderRec(actual.getIzquierda());
         System.out.println("["+actual.getValor()+"]");//visitar el nodo
        //RECORRER EL LADO DERECHO
        imprimirPreOrderRec(actual.getDerecha());
        } 
    }
    
}
