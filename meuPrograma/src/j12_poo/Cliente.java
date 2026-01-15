package j12_poo;

public class Cliente {
    String nome;
    Double limiteCredito;

    public void solicitarCredito(Double valor) {
        limiteCredito = valor;
    }

    public void compra(Double valor) {
        limiteCredito -= valor;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
}
