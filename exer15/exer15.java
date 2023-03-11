package exer15;

import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        float numero = scan.nextFloat();
        if ((numero <= 200) && (numero >= 100)){
            System.out.println("O numero esta entre 100 e 200");
        } else {
            System.out.println("O numero não se encontra no intervalo entre 100 e 200");
        }
    }
}
