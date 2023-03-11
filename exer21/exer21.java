package exer21;

import java.util.Scanner;

public class exer21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade, aptos = 0, inaptos = 0;
        String nome, sexo,saude, continuar = "S";
        
        while(continuar.equals("S")){
            System.out.print("Digite o nome: ");
            nome = scan.next();
            System.out.print("Digite o sexo(M/F): ");
            sexo = scan.next().toUpperCase();
            System.out.print("Digite a idade: ");
            idade = scan.nextInt();
            System.out.println("Saúde(boa/ruim): ");
            saude = scan.next().toUpperCase();
            if(sexo.equals("M") && idade >= 18 && saude.equals("BOA")){
                aptos += 1;
                System.out.println("Apto para servir");
            } else {
                inaptos += 1;
                System.out.println("Inapto para servir");
            }

            System.out.println("Voce deseja continuar?(S/N):");
            continuar = scan.next().toUpperCase();
        }
        System.out.println("Aptos para serviço militar: "+aptos);
        System.out.println("Inaptos para serviço militar: "+inaptos);

    }
}
