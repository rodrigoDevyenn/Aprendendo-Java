package exerciciosnovato;

import java.util.Scanner;

public class Ex1003SimpleSum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int soma = (a + b);

        input.close();

        System.out.printf("SOMA = %d\n", soma);
    }

}
