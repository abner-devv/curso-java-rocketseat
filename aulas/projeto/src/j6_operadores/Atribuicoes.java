package j6_operadores;

import java.util.Date;

public class Atribuicoes {
    static void main() {
        //Concatenacao usando concat
        String n1 = "GLEYSON".concat(" SILVA");
        System.out.println("N1: " + n1); //GLEYSON SILVA

        //O + depois de uma string = concatenacao
        String n2 = "JOAO" + 1;
        System.out.println("N2: " + n2); //JOAO1

        //O + antes de uma string = soma
        String n3 = 1 + 1 + "TALLES";
        System.out.println("N3: " + n3); //2TALLES

        //Atribuicao de uma expressao
        boolean bol = 1 > 2;
        System.out.println("bol: " + bol);

        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();
    }
}
