
package eva2_3_lista_doble;


public class EVA2_3_lista_doble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista=new Lista();
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.imprimirLista();
        System.out.println(lista.longitud());
        lista.imprimirLista();
        
        lista.imprimirListaInv();
        System.out.println("Cantidad de nodos: " + lista.longitud());

 
        lista.agregarEn(2, 99); //insertar en medio

        System.out.println("DESPUES DE INSERTAR:");
        lista.imprimirLista();

        System.out.println("Elemento en posicion 2: " + lista.EncontrarEn(2));

        lista.BorrarEn(2);
        System.out.println("DESPUES DE BORRAR:");
        lista.imprimirLista();
        lista.BorrarEn(0);

        System.out.println("BORRAR INICIO:");
        lista.imprimirLista();
        System.out.println("¿Lista vacia?: " + lista.esVacia());
        lista.vaciarLista();
        lista.imprimirLista();

        System.out.println("¿Lista vacia?: " + lista.esVacia());   
    }
    
}
