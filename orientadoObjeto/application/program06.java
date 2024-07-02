package nelioAlves.orientadoObjeto.application;

import nelioAlves.orientadoObjeto.util.calculator;

import java.util.Scanner;

public class program06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radiuss = sc.nextDouble();

        double c = calculator.circumference(radiuss);
        double v = calculator.volume(radiuss);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calculator.PI);

        sc.close();
    }
}