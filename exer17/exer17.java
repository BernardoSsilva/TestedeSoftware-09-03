package exer17;

import java.util.Scanner;

public class exer17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int[] numeros = new int[80];
    int i;
    for(i = 1; i <= 80; i++){
        System.out.println("digite um numero");
        numeros[i] = scan.nextInt();
    };
    for(int j = 1; j <= i; j++){
        if (numeros[j] >= 10 && numeros[j] <= 150){
            System.out.println("O numero "+ numeros[j]+" Se encontra no intervalo entre 10 e 150");
        }
    };
    }   
}

