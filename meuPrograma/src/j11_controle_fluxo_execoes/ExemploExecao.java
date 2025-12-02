package j11_controle_fluxo_execoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploExecao {
    static void main() {
        try {
        /*
            try {
                Number valor = Double.valueOf("a1.75");
                System.out.println(valor);
            }catch (NumberFormatException e) {
                System.err.println("Numero Invalido");
            }
         */

            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();
            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
