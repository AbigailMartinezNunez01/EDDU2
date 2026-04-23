
package eva2_3_lista_doble;


public class Nodo {
    private int valor; //data, valor que vamos a guardar(nuestra lista guarda enteros
    private Nodo siguiente; //guarda la referencia al nodo sig
    private Nodo previo;
    //constructor default
    public Nodo(){
        this.siguiente=null;//va marcar el fin de la lista
        this.previo=null;//va marcar el inicio de la lista
    }
      //constructor que acepte el valor       
    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.previo=null;
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
    public void setPrevio(Nodo previo){
        this.previo=previo;
    }
    public Nodo getPrevio(){
        return previo;
    }
    
}
