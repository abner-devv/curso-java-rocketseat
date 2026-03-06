package j10_contole_fluxo_repeticao;

public class ForEach {
    static void main() {
        /*O uso do for / each está fortemente relacionado, com um cenário onde contenha um
        array ou coleção, e assim, a interação é baseada nos elementos da coleção.*/

        String alunos [] = {"FELIPE","JONAS","JULIA","MARCOS"};

        //Forma abreviada
        for(String aluno : alunos) {
            System.out.println(aluno);
        }

    }
}
