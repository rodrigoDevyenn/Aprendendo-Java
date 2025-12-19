package exerciciosnovato;

import java.util.Scanner;

public class Ex1006Average2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double notaA = entrada.nextDouble();
        double notaB = entrada.nextDouble();
        double notaC = entrada.nextDouble();
        entrada.close();

        double media = ((notaA * 2) + (notaB * 3) + (notaC * 5)) / (2 + 3 + 5);

        System.out.printf("MEDIA = %.1f\n", media);
    }
}