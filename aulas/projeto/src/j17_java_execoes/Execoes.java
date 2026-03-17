package j17_java_execoes;

public class Execoes {
    public static void main(String[] args) {
        try {
            Double valor  = (double)(100 / 0);
            System.out.println(valor);
        }catch (Exception e){
            System.out.println("erro");
            e.printStackTrace();
        }finally {
            System.out.println("Finally bloco");
        }
    }
}
