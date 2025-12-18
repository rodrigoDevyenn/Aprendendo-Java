package exerciciosnovato;

import java.util.Scanner;

public class Ex1004SimpleProduct {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int prod = (a * b);

        input.close();

        System.out.printf("PROD = %d\n", prod);
    }
}
