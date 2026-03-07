import java.time.LocalDate;

public class Autor {
    private int id;
    private String nome;
    private LocalDate dataAtualizacao;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }
}
