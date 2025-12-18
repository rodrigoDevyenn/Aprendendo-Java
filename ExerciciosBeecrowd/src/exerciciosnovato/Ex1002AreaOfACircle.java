package exerciciosnovato;

import java.util.Scanner;

public class Ex1002AreaOfACircle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double PI = 3.14159;
        double raio = input.nextDouble();
        double area =  PI * (Math.pow(raio, 2));
        
        input.close();

        System.out.printf("A=%.4f\n", area);
        

        
    }
}
