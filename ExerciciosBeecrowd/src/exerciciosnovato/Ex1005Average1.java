package exerciciosnovato;

import java.util.Scanner;

public class Ex1005Average1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double notaA = entrada.nextDouble();
        double notaB = entrada.nextDouble();

        double media = ((notaA * 3.5) + (notaB * 7.5)) / (3.5 + 7.5);

        entrada.close();

        System.out.printf("MEDIA = %.5f\n", media);
    }
}
