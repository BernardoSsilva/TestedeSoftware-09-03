package exer9;

import java.util.Scanner;


public class exer9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do deposito efetuado: ");
        float valDeposito = scan.nextFloat();
        System.out.printf("O valor do deposito com rendimento é de R$ %.2f", (valDeposito+(valDeposito * 0.7)/100) );
    }
}
