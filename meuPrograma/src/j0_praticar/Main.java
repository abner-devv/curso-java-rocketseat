package j0_praticar;

enum Estados{
    AM("Amazonas"),
    SC("Santa Catarina");

    private String nome;
    Estados(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Main{
    static void main() {
        Estados estados = Estados.AM;
        System.out.println(estados.getNome());
    }
}
