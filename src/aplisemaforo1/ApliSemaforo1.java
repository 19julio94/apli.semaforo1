
package aplisemaforo1;

public class ApliSemaforo1 {
   
    public static void main(String[] args) {
     Semaforo semaforo1 = new Semaforo();
     System.out.println("cor inicial:"+semaforo1.darCor());
    semaforo1.porCor("verde");
    String res = semaforo1.darCor();
    System.out.println("cor = "+res);
             //tamen
    System.out.println("cores:"+semaforo1.darCor());
    //instanciamos un semaforo cor azul
    Semaforo semaforoAzul = new Semaforo("azul");
    System.out.println("cores:"+semaforoAzul.darCor());
    semaforoAzul.porCor("branco");
    System.out.println("nova cor semaforoAzul:"+semaforoAzul.darCor());
    
    
    
    
    
    
    
    }
    
}
