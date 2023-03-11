package exer22;

import java.util.Scanner;

public class exer22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float mediaVendas = 0, venda, lucro, precoCusto, mediaCusto = 0;
        int lucros = 0, empates =0, prejuizos = 0;
        for(int i = 1; i <= 40; i++){
            System.out.print("Digite o preço de custo do produto: ");
            precoCusto = scan.nextFloat();
            System.out.print("Digite o preço da venda: ");
            venda = scan.nextFloat();
            lucro = venda - precoCusto;
            mediaVendas += venda;
            mediaCusto += precoCusto;
            if (lucro > 0){
                lucros += 1;
            }else if(lucro == 0){
                empates += 1;
            } else{
                prejuizos +=1;
            }
        }
        System.out.println("O total de produtos que deram lucro foi de: "+lucros);
        System.out.println("O total de itens que trouxeram prejuizo foi de: "+prejuizos);
        System.out.println("O total de empates foi de :"+empates);
        System.out.println("A media do preço de vendas é de: R$"+mediaVendas/40);
        System.out.println("A media do preço de custo é de: R$"+mediaCusto/40);
    }
}
