import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao = "";
        while (opcao != "NAO" || opcao != "NÃO"){
            System.out.println("Voce deseja ver a lista de livros disponiveis? SIM ou NÃO?");
            opcao = sc.nextLine();
        }
    }

}
