package exer12;

import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de fabrica do veículo: ");
        float precoFabrica = scan.nextFloat();
        float precoConsumidor = (float) (precoFabrica + (precoFabrica * 0.28)+(precoFabrica * 0.45));
        System.out.printf("O preco para o consumidor sera de : R$ %.2f",precoConsumidor);
    }
}
