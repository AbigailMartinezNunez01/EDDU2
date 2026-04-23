
package eva2_6_arbol;


public class Nodo {
    private int valor; 
    private Nodo izquierda; 
    private Nodo derecha;
    //constructor
     public Nodo(){
        this.izquierda=null;
        this.derecha=null;
    }
      //constructor que acepte el valor       
    public Nodo(int valor) {
        this.valor = valor;
        this.izquierda = null;
        this.derecha=null;
        
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
    
}
