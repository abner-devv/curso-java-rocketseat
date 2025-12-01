package j11_controle_fluxo_execoes;

public class ExemploExecao {
    static void main() {
        try {
            Number valor = Double.valueOf("a1.75");
            System.out.println(valor);
        }catch (NumberFormatException e) {
            System.err.println("Numero Invalido");
        }
    }
}
