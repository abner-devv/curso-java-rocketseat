package j5_tipos_wrappers;

public class TiposWrappers {
    static void main() {

        //Conversao
        double numeroDouble = 123.4;
        int numeroInt = (int) numeroDouble;
        System.out.println(numeroInt);

        Double d = 100.098;
        Integer i = d.intValue();
        System.out.println(i);

        String num = "500";
        int e = Integer.parseInt(num);
        System.out.println(e); // 100
    }
}
