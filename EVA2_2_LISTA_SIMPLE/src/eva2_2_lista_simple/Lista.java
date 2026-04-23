
package eva2_2_lista_simple;


public class Lista {
    

    private Nodo inicio;//aqui inicia nuestra lista
    private Nodo fin;//aqui termina nuestra lista

    //constructor por default
    public Lista(){
        this.inicio=null;//si inicio es null la lista esta vacia
        this.fin=null;
    }

    //Agregar un NODO
    //o(N)EFICIENCIA POR MOVERNOS NODO POR NODO
    //O(1)EFICIENCIA POR USAR UN NODO FIN
    public void agregar(int valor){ //poner el nodo al final de la lista
        Nodo nuevo=new Nodo(valor);

        //LISTA VACIA
        if(inicio==null){
            inicio=nuevo;//agrego el nuevo nodo
            fin=nuevo;
        }else{
            //conectamos el nuevo nodo al final
            fin.setSiguiente(nuevo);
            //movemos fin al nuevo ultimo nodo
            fin=nuevo;
        }
    }

    //EFICIENCIA O(N)
    public void imprimirLista(){
        Nodo temp=inicio;

        while(temp!=null){
            System.out.print("["+temp.getValor()+"] -> ");
            temp=temp.getSiguiente(); //recorremos nodo por nodo
        }

        System.out.println("null");
    }

    //EFICIENCIA:O(N)
    public int longitud(){
        int cont=0;
        Nodo temp=inicio;

        while(temp!=null){
            cont++;
            temp=temp.getSiguiente();
        }

        return cont;
    }

   
    //EFICIENCIA O(1)
    public void vaciarLista(){
        inicio=null;
        fin=null;
    }

   
    //Eficiencia O(1)
    public boolean esVacia(){
        if(inicio==null)
            return true;
        else
            return false;
    }
    //buscar un valor y regresar su posicion
    //EFICIENCIA O(N)
    public int buscar(int valor){
        Nodo temp=inicio;
        int pos=0;

        while(temp!=null){
            if(temp.getValor()==valor){
                return pos;//encontrado
            }
            temp=temp.getSiguiente();
            pos++;
        }

        return -1;//no encontrado
    }

    //regresa el valor en la posicion
    //EFICIENCIA O(N)
    public int EncontrarEn(int posi){
        int tamaño=longitud();

        //validar
        if((posi<0)||(posi>=tamaño)){
            throw new RuntimeException("La posicion no existe en la lista");
        }

        Nodo temp=inicio;
        int cont=0;

        while(cont<posi){
            temp=temp.getSiguiente();
            cont++;
        }

        return temp.getValor();
    }

    //insertar en (x, posicion)
    //EFICIENCIA O(N)
    public void agregarEn(int posi,int valor){
        int tama=longitud();

        //validar si existe
        if((posi<0)||(posi>tama)){
            throw new RuntimeException("La posicion no existe en la lista");
        }

        Nodo nuevo=new Nodo(valor);

        //caso: insertar al inicio
        if(posi==0){
            nuevo.setSiguiente(inicio);
            inicio=nuevo;

            if(fin==null){//si estaba vacia
                fin=nuevo;
            }
            return;
        }

        //movernos hasta posicion anterior
        Nodo temp=inicio;
        int cont=0;

        while(cont<(posi-1)){
            temp=temp.getSiguiente();
            cont++;
        }

        //conectar nodos
        nuevo.setSiguiente(temp.getSiguiente());
        temp.setSiguiente(nuevo);

        //si se inserta al final
        if(nuevo.getSiguiente()==null){
            fin=nuevo;
        }
    }

    //remove(x)
    //elimina un valor si existe
    //EFICIENCIA O(N)
    public void eliminar(int valor){

        if(inicio==null){
            return;//lista vacia
        }

        //caso: eliminar el primero
        if(inicio.getValor()==valor){
            inicio=inicio.getSiguiente();

            if(inicio==null){//si se quedo vacia
                fin=null;
            }
            return;
        }

        Nodo temp=inicio;

        while(temp.getSiguiente()!=null){
            if(temp.getSiguiente().getValor()==valor){
                temp.setSiguiente(temp.getSiguiente().getSiguiente());

                //si eliminamos el ultimo
                if(temp.getSiguiente()==null){
                    fin=temp;
                }
                return;
            }
            temp=temp.getSiguiente();
        }
    }

    
    //crear una copia de la lista
    public Lista copiar(){
        Lista nueva=new Lista();
        Nodo temp=inicio;

        while(temp!=null){
            nueva.agregar(temp.getValor());
            temp=temp.getSiguiente();
        }

        return nueva;
    }
}
        
         

        
    



