package exe3;

import java.util.Scanner;

public class Main {
    public static void resultado(Operacao calculo, float x, float y) {
        System.out.println("O resultado é "+calculo.efetuarOperacao(x, y));
    }
    public static void main(String args[]) {
        Scanner nume = new Scanner(System.in);
        float x = nume.nextInt();
        Scanner nume1 = new Scanner(System.in);
        float y = nume1.nextInt();
        Main.resultado(new Soma(),x,y);
        Main.resultado(new Subtracao(),x,y);
        Main.resultado(new Divisao(),x,y);
        Main.resultado(new Multiplicacao(),x,y);
    }
}
