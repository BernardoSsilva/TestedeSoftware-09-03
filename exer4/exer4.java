package exer4;

import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do funcionario: ");
        String nome = scan.nextLine();
        System.out.print("Digite o salario fixo do funcionario: ");
        float salarioF = scan.nextFloat();
        System.out.print("Digite a quantia vendida pelo funcionario(R$): ");
        float vendas = scan.nextFloat();
        System.out.println("O funcionario "+nome+" Tem o salario fixo de R$"+salarioF+" , com o total de vendas sendo de R$ "+vendas);
        System.out.println("O novo salario do funcionario sera de R$ "+(salarioF + (vendas * 0.15)));
    }
}
