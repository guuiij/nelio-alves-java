package nelioAlves.estruturaRepetitivas.whileExercicios;

import java.util.Scanner;

public class Exer02Coordenadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite coordenada ");
        int x = sc.nextInt();
        int y = sc.nextInt();


        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro - ( 1º ) ");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo - ( 2º ) ");

            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro - ( 3º ) ");

            } else {
                System.out.println("Quarto - ( 4º )");
            }
            x = sc.nextInt();
            y = sc.nextInt();

        }
        System.out.println("Finalizado");

        sc.close();

    }
}
