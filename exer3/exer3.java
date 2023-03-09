package exer3;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a distancia percorrida(km): ");
        float km = scan.nextFloat();
        System.out.print("Digite a quantia de gasolina gasta(L): ");
        float Litros = scan.nextFloat();
        System.out.println("O consumo total do veiculo é de "+(km / Litros)+"Km/L");
    }
}
