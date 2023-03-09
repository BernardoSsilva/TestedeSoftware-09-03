package exer7;

import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celcius: ");
        float temperaturaCelcius = scan.nextFloat();
        float fahrenheit = ((temperaturaCelcius * 9)/5)+32;
        System.out.println("A temperatura convertida para Fahrenheit é de: "+fahrenheit);
    }
}
