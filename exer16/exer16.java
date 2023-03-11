package exer16;

import java.util.Scanner;

public class exer16 {
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
        System.out.println();
        if(media >= 7){
            System.out.println("Aprovado");
        }else if (media <= 5){
            System.out.println("Reprovado");
        }else if(media >= 5.1 && media<=6.9){
            System.out.println("Recuperação");
        }
    }
}
