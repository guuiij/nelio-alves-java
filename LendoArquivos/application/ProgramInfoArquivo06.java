package nelioAlves.LendoArquivos.application;

import java.io.File;
import java.util.Scanner;

public class ProgramInfoArquivo06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitando ao usuário que digite o caminho de um arquivo ou pasta
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine(); // Capturando o caminho digitado

        // Criando um objeto File com base no caminho fornecido pelo usuário
        File path = new File(strPath);

        // Exibindo o caminho completo do arquivo ou pasta
        System.out.println("getPath: " + path.getPath());

        // Exibindo o diretório pai do arquivo ou pasta (se houver)
        System.out.println("getParent: " + path.getParent());

        // Exibindo o nome do arquivo ou pasta
        System.out.println("getName: " + path.getName());

        sc.close();
    }

}
