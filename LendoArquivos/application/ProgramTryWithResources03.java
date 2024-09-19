package nelioAlves.LendoArquivos.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramTryWithResources03 {
    public static void main(String[] args) {

        String path = "C:\\temp\\in.txt";
        // O caminho do arquivo que será lido é armazenado na variável 'path'.

        // Utilizando o bloco 'try-with-resources' para instanciar as streams automaticamente.
        // O 'try-with-resources' garante que os recursos (streams) serão fechados automaticamente
        // ao final da execução, sem a necessidade de um bloco 'finally'.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // O BufferedReader é usado para ler o arquivo de forma eficiente, linha por linha.
            String line = br.readLine();
            // Lê a primeira linha do arquivo.

            // O loop 'while' continua lendo o arquivo até encontrar 'null', o que indica o final do arquivo.
            while (line != null) {
                System.out.println(line);
                // Imprime a linha atual no console.

                line = br.readLine();
                // Lê a próxima linha do arquivo.
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}