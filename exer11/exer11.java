package exer11;

import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o preço de custo do produto:");
        float precoC = scan.nextFloat();
        System.out.print("Digite a porcentagem de acrescimo que o preço de venda recebera: ");
        float acrescimo = scan.nextFloat();
        acrescimo = acrescimo/100;
        System.out.printf("O valor de venda sera de R$"+"%.2f", (precoC + (precoC*acrescimo)));
    }
}
