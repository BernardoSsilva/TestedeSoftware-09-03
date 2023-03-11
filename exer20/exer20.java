package exer20;

import java.util.Scanner;

public class exer20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = "S";
        int carrosDoisMil = 0;

        while(text.equals("S")){  
            System.out.print("Digite o preço do veiculo: R$");
            Float preco = scan.nextFloat();
            System.out.println(" ");
            System.out.print("Digite o ano do veiculo: ");
            int ano = scan.nextInt();
            if(ano <= 2000){
                preco = (float) (preco - (preco*0.12));
                carrosDoisMil += 1;
            } else {
                preco = (float) (preco - (preco*0.7));
            }
            System.out.printf("O novo preço sera de: R$ %.2f", preco);
            System.out.println("");
            
           
            System.out.println("Voce deseja continuar");
            text = scan.next().toUpperCase();
        }
        System.out.println("Foram registrados "+carrosDoisMil+" carros com ano até 2000");
        System.out.println("Finalizado");
    }
}
