package exer5;

import java.util.Scanner;

public class exer5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();
        System.out.print("Digite a primeira nota: ");
        float nota1 = scan.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = scan.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = scan.nextFloat();
        float media = (nota1 + nota2 + nota3)/3;
        System.out.print("O aluno "+nome+" teve a media ");
        System.out.printf("%.2f", media);

        }
}