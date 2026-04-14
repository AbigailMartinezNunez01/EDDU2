
package eva2_1_referencias;


public class Eva2_1_REFERENCIAS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo miObj=new Ejemplo();
        miObj.valor=100;
        miObj.otro=new Ejemplo();
        miObj.otro.valor=200;
        miObj.otro.otro=new Ejemplo();
        miObj.otro.otro.valor=300;
        //System.out.println("MiObj:" + (miObj.valor));
       // System.out.println("MiObj.otro:"+(miObj.otro.valor));
       // System.out.println("MiObj.otro.otro:"+(miObj.otro.otro.valor));
       Ejemplo temp=miObj;
       while(temp!=null){
           System.out.println("Valor="+temp.valor);
           temp=temp.otro; //Me va dar el valor nodo por nodo mientras no sea null 
       }
    }

    private static class Ejemplo {
        int valor;
        Ejemplo otro;
        public Ejemplo() {
            
        }
    }
   
    
}
