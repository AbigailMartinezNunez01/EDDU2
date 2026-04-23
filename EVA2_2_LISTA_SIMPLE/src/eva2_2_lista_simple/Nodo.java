
package eva2_2_lista_simple;


public class Nodo {
    private int valor; //data, valor que vamos a guardar(nuestra lista guarda enteros
    private Nodo siguiente; //guarda la referencia al nodo sig
    //constructor default
    public Nodo(){
        this.siguiente=null;//va marcar el fin de la lista
    }
      //constructor que acepte el valor       
    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    //metodo get y set

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

  
    
   
    
}

