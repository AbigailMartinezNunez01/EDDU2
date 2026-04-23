
package eva_2_tpos_genericos;


public class EVA_2_TPOS_GENERICOS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //int double char
        //integer
        int x=100;
        Integer val=x;
        Prueba<Integer> prueba=new Prueba<Integer>(100); //<> nos ayuda para cambiar lo que queramos guardar, string, int, double con cambio automatico
         System.out.println("Valor guardado: " + prueba.getDato());

        //cambiar valor
        prueba.setDato(200);
        System.out.println("Nuevo valor: " + prueba.getDato());

        //otro ejemplo con String
        Prueba<String> texto = new Prueba<>("Hola");
        System.out.println("Texto: " + texto.getDato());
        
    }
    
}
class Prueba <T>{ //es un alias para decir que en algun momento se va sustituir por float, int, boolean, etc
    private T dato;
    public Prueba (T dato){
        this.dato=dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
}
