package j10_contole_fluxo_repeticao;

import java.util.Random;

public class DoWhile {
    static void main() {
        do {
            //excutando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        }while(tocando());
            System.out.println("Alô !!!");
    }

    private static boolean tocando () {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);

        return !atendeu;
    }
}
