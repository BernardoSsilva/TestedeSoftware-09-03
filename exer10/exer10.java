package exer10;

import java.util.Scanner;

public class exer10{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        float preco = scan.nextFloat();
        System.out.printf("O valor de cada prestação sera de: R$"+"%.2f",(preco/5));

    }
}