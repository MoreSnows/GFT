package exe2;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner nume = new Scanner(System.in);
        int x = nume.nextInt();
        String soma="";
        for(int i=0; i<x;i++){
            soma = soma + "incomoda ";
        }
        System.out.println(soma+"muito mais");
    }
}
