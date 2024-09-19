package nelioAlves.LendoArquivos.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFilleBufferedWriter04 {
    public static void main(String[] args) {


        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night", "VOU SER RICO"};
        // criando vetor de string lines e instanciando valores juntos

        String path = "C:\\temp\\out.txt";
        // Variável 'path' que contém o caminho onde o arquivo será criado ou sobrescrito.

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            // O FileWriter abre o arquivo localizado no caminho especificado pela variável 'path'.
            // Se o arquivo já existir, ele será sobrescrito. Se não existir, ele será criado.
            // O BufferedWriter é usado para otimizar o processo de escrita no arquivo, acumulando dados em um buffer
            // antes de escrevê-los de uma vez só, o que melhora a eficiência ao lidar com grandes volumes de dados.
            // (path,true)))  usando o parametro true ele nao recria outro arquivo

            for (String line : lines) {

                bw.write(line);
                bw.newLine();// quebra de linha
            }
        } catch (IOException e) { // tratando exceção
            e.printStackTrace();
        }
    }
}
