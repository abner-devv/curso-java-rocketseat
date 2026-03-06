package j12_poo;

public class Sistema {
    static void main() {
        Cliente clienteA = new Cliente("Pedro");
        clienteA.solicitarCredito(100.0d);
        clienteA.compra(20.0d);
        System.out.println("Nome:" + clienteA.nome + "\n" + "Limite:" + clienteA.limiteCredito);
    }
}
