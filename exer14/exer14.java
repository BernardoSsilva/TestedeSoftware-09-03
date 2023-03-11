package exer14;

import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor (inteiro): ");
        int primNumero = scan.nextInt();
        System.out.print("Digite o segundo valor (inteiro): ");
        int segNumero = scan.nextInt();
        if(primNumero > segNumero){
            System.out.println("O primeiro numero é maior");
        } else {
            System.out.println("O segundo numero é maior");
        }
    }
}
