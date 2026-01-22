package je15_java_time;

import java.time.LocalDate;

public class LocalDateSample {
    static void main() {
        //usando of podemos determinar dia, mes e ano
        LocalDate meuAniversario = LocalDate.of(2024, 4, 20);

        System.out.println(meuAniversario);
    }
}
