package nelioAlves.LendoArquivos.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramIntro01 {
    public static void main(String[] args) {

        // LENDO ARQUIVO E EXIBINDO AS INFORMAÇÕES NA TELA

        File file = new File("c:\\temp\\in.txt");
        // Criando um objeto File que representa o arquivo "in.txt" no caminho especificado.

        Scanner sc = null;
        /* Declarando um Scanner que será usado para ler o conteúdo do arquivo.

         - Como a tentativa de abrir e ler um arquivo pode gerar uma exceção (caso o arquivo não exista, por exemplo),
         - é necessário utilizar um bloco try-catch para capturar e tratar possíveis erros.         */
        try {
            sc = new Scanner(file);
            // Inicializando o Scanner com o arquivo, em vez de usar o System.in (entrada do teclado).

            while (sc.hasNextLine()) {
                // Verifica se ainda há linhas a serem lidas no arquivo.
                System.out.println(sc.nextLine());
                // Se houver uma nova linha, exibe o conteúdo no console.
            }
        }
        catch (IOException e) {
            // Caso ocorra uma exceção durante a leitura do arquivo, ela será tratada aqui.
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            // O bloco finally é executado sempre, independentemente de uma exceção ter sido lançada ou não.
            // Aqui garantimos que o Scanner será fechado para liberar recursos.
            if (sc != null) {
                sc.close();
            }
        }
    }
}
