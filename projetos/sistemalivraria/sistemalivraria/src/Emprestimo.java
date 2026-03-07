import java.time.LocalDate;

public class Emprestimo {
     private int id;
     private Livro livro;
     private String nomeCliente;
     private LocalDate dataEmprestimo;
     private LocalDate dataDevolucao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
}

