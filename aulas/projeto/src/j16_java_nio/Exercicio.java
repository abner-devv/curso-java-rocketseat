package j16_java_nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        try{
            List<String> lista = new ArrayList<String>();
            lista.add("(83) 2148-5886 Joemia Giron Lyrio Monnerat");
            lista.add("(21) 2705-6726 Reginaldo Folly Barboza Brito");
            lista.add("(91) 2416-8455 Mariza Gadelha Bastida Carneiro");
            lista.add("(68) 3259-8389 Mirian Venancio Portela Ignacia");

            Path diretorio = Path.of("./arquivo.txt");
            for (String i : lista){
                String conteudo = i + "\n";
                Files.write(
                        diretorio,
                        conteudo.getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND
                );
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
