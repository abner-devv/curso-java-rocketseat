package j16_java_nio;
import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    static void main() {
        File diretorio = new File("c:\\rocket\\curso-java");
        //System.out.println("Diretorio existe: " + diretorio.exists());

        if(!diretorio.exists()) {
//            diretorio.mkdir();
        }

        try {
            File arquivo = new File(diretorio, "aula-java.txt");
            if(!arquivo.exists()) {
                arquivo.createNewFile();
            }
            //System.out.println(arquivo.exists());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
