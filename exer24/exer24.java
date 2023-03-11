package exer24;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class exer24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String continua = "S";
        while(continua.equals("S")){
            System.out.print("Digite um numero: ");
            int numero = scan.nextInt();
            if(numero == 0){
                System.out.println("Zero");
            }else if(numero > 0){
                System.out.println("Número positivo");
            }else{
                System.out.println("Número negativo");
            }
            System.out.print("Deseja continuar?(S/N): ");
            continua = scan.next().toUpperCase();
        }
    }
}
