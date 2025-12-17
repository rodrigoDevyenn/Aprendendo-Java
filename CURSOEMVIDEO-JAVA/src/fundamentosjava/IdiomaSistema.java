package fundamentosjava;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale localSitema = Locale.getDefault();
        System.out.print("O idioma do seu sistema é ");
        System.out.println(localSitema.getLanguage());
    }
}
