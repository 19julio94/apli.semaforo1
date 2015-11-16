package aplisemaforo1;


public class Semaforo {

//atributos:
    private String cor;
    //metodos:
    //constructores
    public Semaforo(){
        
    }
    
    public Semaforo(String c){
        cor=c; 
    }
    public void porCor(String c){
        cor = c;
    }
    public String darCor(){
    return cor;
    }
    
}

