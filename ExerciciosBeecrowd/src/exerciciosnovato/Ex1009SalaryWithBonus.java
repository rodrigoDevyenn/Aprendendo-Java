package exerciciosnovato;

import java.util.Scanner;

public class Ex1009SalaryWithBonus {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.next();
        double salarioFixo = entrada.nextDouble();
        double vendas = entrada.nextDouble();
        entrada.close();

        double bonus = 0.15 * vendas;
        double salarioTotal = salarioFixo +  bonus;

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);


    }
}
