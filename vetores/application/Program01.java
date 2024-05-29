package nelioAlves.vetores.application;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Iniciar inteiro para quantidade em vetor
        double[] vect = new double[n]; // criando vetor vect. N tamanho do vetor

        for (int i = 0; i < n; i++) {// // usa dor para ler os valores para o vetor n
            vect[i] = sc.nextDouble(); // usando sc.next... para receber dados
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) { // Segundo for usado para EXIBIR os vetores
            sum += vect[i];
        }
        double avg = sum/n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n" , avg);
        System.out.printf("Total: %.2f%n", sum);


        sc.close();
    }
}
