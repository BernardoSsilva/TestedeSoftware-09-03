package exer6;

import java.util.Scanner;


public class exer6 {
    public static void main(String[] args) {
        // O programa deve fazer a troca entre o valor A e o valor B
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        float a = scan.nextFloat();
        System.out.print("Digite o segundo valor: ");
        float b = scan.nextFloat();
        float troca;

        troca = a;
        a = b;
        b = troca;
        System.out.println("Os valores trocados: "+a+" ; "+b);
    }
}
