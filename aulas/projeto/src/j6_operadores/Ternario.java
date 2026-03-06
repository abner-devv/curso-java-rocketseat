package j6_operadores;

public class Ternario {
    static void main() {
        /*
        int a, b;
        a = 5;
        b = 6;
        EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
         resultado = "verdadeiro";
        else
         resultado = "falso";

        MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
                String resultado = (a==b) ? "verdadeiro" : "false";
                System.out.println(resultado);*/

        String nome = "Abner";
        int idade  = 24;
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;

        String mensagem = nome + (maiorIdade ? " maior idade" : " menor idade");
        System.out.println(mensagem);
    }
}
