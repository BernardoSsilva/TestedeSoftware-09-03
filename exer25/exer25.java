package exer25;

import java.util.Scanner;

public class exer25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float aumento = 0;
        for(int i = 1; i <= 584; i++){
            System.out.print("Digite o nome do funcionário: ");
            String nome = scan.next();
            System.out.println("Digite o salário do funcionário");
            float salario = scan.nextFloat();
            if (salario < (1320.00*3)){
                aumento += salario * 0.5;
                System.out.print("O funcionario "+nome+" recebera aumento de 50%. seu novo salario sera de : ");
                System.out.printf("R$"+"%.2f", salario * 1.5);
            } else if ((salario <= (1320 *10)) && (salario >= (1320.00*3))){
                aumento += salario * 0.2;
                System.out.print("O funcionario "+nome+" recebera aumento de 50%. seu novo salario sera de : ");
                System.out.printf("R$"+"%.2f", salario * 1.2);
            } else if((salario > (1320 *10)) && (salario <= (1320.00*20))){
                aumento += salario * 0.15;
                System.out.print("O funcionario "+nome+" recebera aumento de 50%. seu novo salario sera de : ");
                System.out.printf("R$"+"%.2f", salario * 1.15);
            } else {
                aumento += salario * 0.1;
                System.out.print("O funcionario "+nome+" recebera aumento de 50%. seu novo salario sera de : ");
                System.out.printf("R$"+"%.2f", salario * 1.1);
            }
        }
        System.out.printf("O aumento total da folha de pagamentos sera de: R$"+"%.2f",aumento);
    }
}
