package variaveistiposprimmitivos;

public class TesteTipos {
    public static void main(String[] args) {
        
        //Conversão de inteiro para string
        int valor = 30;
        String idade = Integer.toString(valor);

        //Conversão de float para string
        float valorB = 30f;
        String idadeB = Float.toString(valorB);

        //Conversão de string para inteiro
        String idadeC = "30";
        int valorC = Integer.parseInt(idadeC);
        
        //Conversão de string para float
        String idadeD = "30";
        float valorD = Float.parseFloat(idadeD);

    }
}
