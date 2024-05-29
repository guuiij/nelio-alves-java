package nelioAlves.estruturaRepetitivas;

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble(); // Linha escolhida para BREAKPOINT - DEBUG - 

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
}
