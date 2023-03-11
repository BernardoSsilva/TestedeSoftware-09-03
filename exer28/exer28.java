package exer28;

import java.util.Scanner;

public class exer28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1, num2, num3;
        System.out.print("Digite o primeiro valor: ");
        num1 = scan.nextFloat();
        System.out.print("Digite o segundo valor: ");
        num2 = scan.nextFloat();
        System.out.print("Digite o terceiro valor: ");
        num3 = scan.nextFloat();
        if(num1 > num2 && num2 > num3){
            System.out.print(num3 +" ;"+num2+" ;"+num1);
        } else if(num1 > num2 && num3 > num2){
            System.out.print(num2 +" ;"+num3+" ;"+num1);
        }else if(num2 > num1 && num1 > num3){
            System.out.print(num3 +" ;"+num1+" ;"+num2);
        }else if(num2 > num3 && num3 > num1){
            System.out.print(num1 +" ;"+num3+" ;"+num2);
        }else if(num3 > num1 && num1 > num2){
            System.out.print(num2 +" ;"+num1+" ;"+num3);
        }else if(num3 > num2 && num2 > num1){
            System.out.print(num1 +" ;"+num2+" ;"+num3);
        }
    }
}
