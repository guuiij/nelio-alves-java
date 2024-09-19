package nelioAlves.LendoArquivos.application;

import java.io.File;
import java.util.Scanner;

public class ProgramManipulandoPastas05 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: "); // Mensagem para o usuário digitar o caminho da pasta
        String strPath = sc.nextLine(); // Captura o caminho digitado pelo usuário e armazena na variável 'strPath'

        // Cria um objeto 'File' usando o caminho fornecido pelo usuário
        File path = new File(strPath);

        // Obtém todas as subpastas do diretório informado
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:"); // Exibe o título "FOLDERS"
        for (File folder : folders) {
            // Loop para imprimir cada subpasta encontrada no diretório
            System.out.println(folder);
        }

        // Obtém todos os arquivos presentes no diretório informado
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:"); // Exibe o título "FILES"
        for (File file : files) {
            // Loop para imprimir cada arquivo encontrado no diretório
            System.out.println(file);
        }

        // Cria um novo subdiretório chamado 'subdir' dentro do diretório informado pelo usuário
        boolean success = new File(strPath + "\\subdir").mkdir();
        // Verifica se o diretório foi criado com sucesso e exibe o resultado
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }

}

