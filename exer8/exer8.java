package exer8;

import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor em U$: ");
        float valorDol = scan.nextFloat();
        System.out.println("Digite o valor de cotação do dolar em relação ao real: ");
        float valCot = scan.nextFloat();
        float valReal = valorDol* valCot;
        System.out.printf("O valor em reais é de "+"%.2f",valReal);
    }
}
