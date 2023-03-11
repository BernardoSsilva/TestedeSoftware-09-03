package exer23;

import java.util.Scanner;

public class exer23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero");
        float numero = scan.nextFloat();
        if(numero > 80){
            System.out.println("maior que 80");
        }else if(numero<25){
            System.out.println("menor que 25");
        } else if(numero == 40){
            System.out.println("numero igual a 40");
        }else{
            System.out.println("Numero não incluso");
        }
    }
}
