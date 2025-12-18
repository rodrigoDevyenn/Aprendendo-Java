package variaveistiposprimmitivos;

public class DeclaracaoVariaveis {
    public static void main(String[] args) {

        int idadeA = 3;
        float salarioA = 1587.45f;
        char letraA = 'G';
        boolean casadoA = false;

        //typeCast
        int idadeB = (int) 3;
        float salarioB = (float) 1587.45;
        char letraB = (char) 'G';
        boolean casadoB = (boolean) false;

        //Wrapper Class
        Integer idadeC = new Integer(3);
        Float salarioC = new Float(1587.45);
        Character letraC = new Character('G');
        Boolean casadoC = new Boolean(false);

        
    }
}
