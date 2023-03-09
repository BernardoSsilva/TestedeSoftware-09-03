package exer2;

import java.util.Scanner;
public class exer2{
   
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o primeiro numero: ");
            int num1 = scan.nextInt();
            System.out.print("Digite o segundo numero: ");
            int num2 = scan.nextInt();
            System.out.println("soma: " + (num1+num2));     
            System.out.println("subtração: " + (num1-num2)); 
            System.out.println("multiplicação: " + (num1*num2)); 
            System.out.println("divisão: " + (num1/num2));        
        }
}