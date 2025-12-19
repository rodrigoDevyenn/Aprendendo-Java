package operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int soma = x + y;
        System.out.printf("%d + %d = %d\n", x, y, soma);

        int sub = x - y;
        System.out.printf("%d - %d = %d\n", x, y, sub);
        
        int mult = x * y;
        System.out.printf("%d * %d = %d\n", x, y, mult);

        float div = (float) x / y;
        System.out.printf("%d / %d = %.2f\n", x, y, div);

        int divInt = x / y;
        System.out.printf("%d // %d = %d\n", x, y, divInt);

        int mod = x % y;
        System.out.printf("%d %% %d = %d\n", x, y, mod);
        
    }
}
