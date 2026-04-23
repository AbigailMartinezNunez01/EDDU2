
package eva2_5_queue;


public class Nodo {
    private int valor;
    private Nodo previo;
    private Nodo siguiente;
    public Nodo(){
        this.valor=valor;
        this.previo=null;
        this.siguiente=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo Previo) {
        this.previo = Previo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.siguiente = Siguiente;
    }
    
    
}
