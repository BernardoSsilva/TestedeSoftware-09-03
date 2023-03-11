package exer26;

import java.util.Scanner;

public class exer26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o numero do mês: ");
        int numMes = scan.nextInt();
        if(numMes == 1){
            System.out.println("Janeiro");
        }else if(numMes == 2){
            System.out.println("Fevereiro");
        }else if(numMes == 3){
            System.out.println("Março");
        }else if(numMes == 4){
            System.out.println("Abril");
        }else if(numMes == 5){
            System.out.println("Maio");
        }else if(numMes == 6){
            System.out.println("Junho");
        }else if(numMes == 7){
            System.out.println("Julho");
        }else if(numMes == 8){
            System.out.println("Agosto");
        }else if(numMes == 9){
            System.out.println("setembro");
        }else if(numMes == 10){
            System.out.println("Outubro");
        }else if(numMes == 11){
            System.out.println("Novembro");
        }else if(numMes == 12){
            System.out.println("Dezembro");
        }else{
            System.out.println("Mês invalido");
        }
    }
}
