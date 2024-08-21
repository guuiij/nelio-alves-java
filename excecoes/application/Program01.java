package nelioAlves.excecoes.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int posisition = sc.nextInt();
            System.out.println(vect[posisition]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position !"); // Array fora do limite
        }
        catch (InputMismatchException e){
            System.out.println("Input error ! "); // Valor de entrada inválido
        }


        System.out.println("End of program");

        sc.close();
    }
}
