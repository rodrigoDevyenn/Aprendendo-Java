package exerciciosnovato;

import java.util.Scanner;

public class Ex1001ExtremelyBasic {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int soma = a + b;

        input.close();

        System.out.format("X = %d\n", soma);
    }

}
