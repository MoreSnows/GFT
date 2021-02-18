package exe1;
import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner numex = new Scanner(System.in);
        Scanner numey = new Scanner(System.in);
        Scanner numez = new Scanner(System.in);
        int x = numex.nextInt();
        int y = numey.nextInt();
        int z = numez.nextInt();

        if((x==y) &&(x==z)){
            System.out.println("Todos os 3 numeros são iguais");
        }
        if((x>y) && (x>z)){
            System.out.println("O maior numero é: "+x);
            if(y<z){
                System.out.println("O menor numero é: "+y);
            }else{
                System.out.println("O menor numero é: "+z);
            }
        }else if((y>x)&&(y>z)){
            System.out.println("O maior numero é: "+y);
            if(x<z){
                System.out.println("O menor numero é: "+x);
            }else{
                System.out.println("O menor numero é: "+z);
            }
        }else if((z>x)&&(z>y)){
            System.out.println("O maior numero é: "+z);
            if(y<z){
                System.out.println("O menor numero é: "+x);
            }else{
                System.out.println("O menor numero é: "+y);
            }
        }
    }
}
