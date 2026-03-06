package j10_contole_fluxo_repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        //break
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            System.out.println(numero);
        }

        //continue
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            System.out.println(numero);
        }
    }
}
