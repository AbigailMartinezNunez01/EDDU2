
package eva2_2_lista_simple;


public class EVA2_2_LISTA_SIMPLE {

   
    public static void main(String[] args) {
        // TODO code application logic here
        long inicio,fin,tiempo = 0;
        Lista lista=new Lista();
        int [] arreglo=new int[1000000];

        //inicio=System.nanoTime();

        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);

        lista.imprimirLista();

        System.out.println("Cantidad de nodo:"+lista.longitud());
        lista.agregarEn(2,-1);
        lista.imprimirLista();
        System.out.println("cantidad de nodos:"+lista.longitud());
        System.out.println("posicion2="+lista.EncontrarEn(2));

        //operacion
        for ( int i =0; i <arreglo.length;i ++){
            arreglo [i]=(int)(Math.random()*1000);
        }

        System.out.println("buscar 300 posicion="+lista.buscar(300));
        lista.eliminar(300);
        lista.imprimirLista();
        Lista copia=lista.copiar();
        System.out.println("COPIA:");
        copia.imprimirLista();
        System.out.println("¿Lista vacia? "+lista.esVacia());

        /*fin=System.nanoTime();
        tiempo=fin-inicio;//tiempo en nanosegundos(mil millonesimas de segundos)
        System.out.println("Arreglo="+tiempo);

        inicio=System.nanoTime();
        for(int i=0; i<1000000; i++){
            lista.agregar((int)(Math.random()*1000000));
        }
        fin=System.nanoTime();
        tiempo=fin-inicio;
        System.out.println("Lista="+tiempo);

        /*System.out.println("Tamaño="+ lista.Longitud());
        lista.vaciarLista();
        lista.imprimirLista();
        System.out.println("Tamaño="lista.Longitud());
        lista.imprimirLista();*/

    }
}
