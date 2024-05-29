package nelioAlves.vetores.application;

import nelioAlves.vetores.entities.Product;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); // Quebra de linha devido ao nextInt anteriormente
            String name = sc.nextLine(); // ler name
            double price = sc.nextDouble(); // ler price
            vect[i] = new Product(name, price); //  cada elemento do array 'vect'
            // será inicializado com uma nova instância de Product usando os valores específicos de name e price
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice(); // Somando em cada posição os vetores de preço
        }

        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE: %.2f%n", avg);


        sc.close();
    }
}
