package exer19;

import java.util.Scanner;

public class exer19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int homem = 0, mulher = 0;
        String genero;
        String nome;
        for(int i = 1; i <= 56; i++){
            System.out.print("Digite o nome: ");
            nome = scan.next();
            System.out.print("Digite o genero(M,F): ");
            genero = scan.next().toUpperCase();
            if(genero.equals("M")){
                homem+= 1;
            } else {
                mulher+= 1;
            }
        }
        System.out.println("Quantia de homens: "+homem);
        System.out.println("Quantia de mulheres: "+mulher);
    }
}
