package j10_contole_fluxo_repeticao;

public class For {
    static void main() {
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        //Também usamos o controle de fluxo for, para interagir sobre arrays e coleções
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}
