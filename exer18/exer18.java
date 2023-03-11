package exer18;

import java.util.Scanner;

public class exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i = 1; i <= 75; i++){
            System.out.print("Digite a idade:");
            int idade = scan.nextInt();
            if(idade > 18){
                System.out.println("Maior de idade");

            } else {
                System.out.println("Menor de idade");
            }
        }  
    }
}
