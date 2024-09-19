package nelioAlves.LendoArquivos.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFileReaderBuffer02 {
    public static void main(String[] args) {

        // IMPLEMENTAÇÃO BÁSICA E PADRÃO: MOSTRANDO O PROCESSO MANUALMENTE.
        // CÓDIGO MAIS SIMPLES E VERBOSO PARA ENTENDER O FUNCIONAMENTO INTERNO.

        String path = "C:\\temp\\ina.txt";
        // Caminho errado do arquivo que será lido. Esta "ina.txt" , o correto é "in.txt"

        BufferedReader br = null;
        FileReader fr = null;
        // Declarando os objetos FileReader e BufferedReader, que serão utilizados para ler o arquivo.

        try {
            // Inicializando o FileReader para ler o arquivo especificado pelo caminho 'path'.
            fr = new FileReader(path);

            // O BufferedReader é utilizado aqui para melhorar o desempenho da leitura,
            // já que ele lê grandes blocos de dados de uma vez, ao invés de byte a byte.
            br = new BufferedReader(fr);

            String line = br.readLine();
            // Lê a primeira linha do arquivo.

            while (line != null) {
                // Continua lendo enquanto o conteúdo não for nulo (ou seja, enquanto não atingir o final do arquivo).
                System.out.println(line);
                // Imprime a linha atual no console.

                line = br.readLine();
                // Lê a próxima linha do arquivo.
            }
        } catch (IOException e) {
            // Trata qualquer erro que ocorra durante a abertura ou leitura do arquivo.
            System.out.println("Error: " + e.getMessage());
        } finally {
            // O bloco finally é usado para garantir que os recursos (streams) sejam fechados,
            // independentemente de um erro ter ocorrido ou não.
            try {
                // Fechando o BufferedReader e o FileReader, se eles foram abertos com sucesso.
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                // Se ocorrer um erro ao fechar as streams, ele será capturado e o erro será exibido.
                e.printStackTrace();
            }
        }
    }
}
