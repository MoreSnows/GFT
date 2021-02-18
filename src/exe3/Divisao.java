package exe3;

public class Divisao extends Operacao {
    public float efetuarOperacao(float x,float y){
        if(y>0){
            return (x/y);
        }else{
            System.out.println("operação não será possível");
            return 0;
        }
        
    }
    
}
