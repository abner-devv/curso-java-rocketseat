package j12_poo.enums;

public enum EstadoBrasileiro {
    PI("Piaui"),
    MA("Maranhao"),
    Sp("Sao Paulo"),
    RJ("Rio de Janeiro"),;

    private String nome;

    private EstadoBrasileiro(String nome) {
        this.nome = nome;
    }
}
