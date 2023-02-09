package arquivos.java8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileJava8 {
    public static void main(String[] args) {
        String fileName = "C:/Users/PC/Documentos/newFile.txt";
        Path path = Paths.get(fileName);
        // default, create, truncate and write to it.
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            writer.write("Hello World !!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}