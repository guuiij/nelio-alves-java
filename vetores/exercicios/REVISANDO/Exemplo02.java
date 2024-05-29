package nelioAlves.vetores.exercicios.REVISANDO;

// INSTANCIANDO VETOR TIPO REFERENCIA QUE É INSTANCAINDO O OBJETO DE UMA CLASSE
// CLASSE É PRODUCT02

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        Product02[] vect = new Product02[n];
        double media = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Product02(name, price);
            media += vect[i].getPrice();
        }

        media = media / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n ", media);

        sc.close();
    }
}
