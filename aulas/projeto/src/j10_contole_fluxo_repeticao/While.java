package j10_contole_fluxo_repeticao;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    static void main() {
        double mesada = 50.0;

        while(mesada > 0) {
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carinho:");
                    mesada = mesada - valorDoce;
        }

        System.out.println("Mesada:" + mesada);
        System.out.println("Anya gastou toda a sua mesada em doces");

         /*
         * Não se preocupe quanto a formatação de valores
         * Iremos explorar os recursos de formatação em breve !!
          */
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(30, 60);
    }
}
