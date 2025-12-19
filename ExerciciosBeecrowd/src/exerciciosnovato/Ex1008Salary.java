package exerciciosnovato;

import java.util.Scanner;

public class Ex1008Salary {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int horas = entrada.nextInt();
        float salario = entrada.nextFloat();
        entrada.close();

        float salarioFinal = (salario * horas);

        System.out.printf("NUMBER = %d\n", num);
        System.out.printf("SALARY = U$ %.2f\n", salarioFinal);

    }
}
