package j8_javabens;

public class Objetos {
    static void main() {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(-1);
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
    }
}
