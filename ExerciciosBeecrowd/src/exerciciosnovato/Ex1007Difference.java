package exerciciosnovato;

import java.util.Scanner;

public class Ex1007Difference {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();
        entrada.close();

        int diff = ((a * b) - (c * d));
        System.out.printf("DIFERENCA = %d\n", diff);
    }
}
