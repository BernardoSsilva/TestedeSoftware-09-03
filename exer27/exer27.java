package exer27;

import java.util.Scanner;

public class exer27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        String nome = scan.nextLine();
        System.out.print("Digite a idade do funcionário: ");
        int idade = scan.nextInt();
        System.out.print("Digite o sexo do funcionário(M/F): ");
        String sexo = scan.next().toUpperCase();
        System.out.print("Digite o salário fixo do funcionário: ");
        float salario = scan.nextFloat();
        if(sexo.equals("M")){
            if(idade >= 30){
                salario += 100.00;
            } else {
                salario += 50.00;
            }
        }else{
            if(idade >= 30){
                salario += 200.00;
            } else {
                salario += 80.00;
            }
        }
        System.out.println("O(A) Funcionário(a) "+nome+" terá como salário liquido R$"+salario);
    }
}
