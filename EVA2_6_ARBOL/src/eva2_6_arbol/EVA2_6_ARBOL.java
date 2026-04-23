
package eva2_6_arbol;


public class EVA2_6_ARBOL {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBin arbol=new ArbolBin();
        arbol.agregar(13);
        arbol.agregar(10);
        arbol.agregar(18);
        arbol.agregar(2);
        arbol.agregar(11);
        arbol.agregar(17);
        arbol.agregar(20);
        arbol.agregar(16);
        
        arbol.imprimirPreOrder();
        
        arbol.imprimirPosOrder();
        arbol.imprimirInOrder();
        
        
    }
    
}
