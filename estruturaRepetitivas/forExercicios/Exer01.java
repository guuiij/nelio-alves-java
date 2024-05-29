package nelioAlves.estruturaRepetitivas.forExercicios;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        for (int i = 0; i < X; i++) {

            if (i % 2 != 0) {
                System.out.println(i); // i é o que se imprime pois ele quem está sendo incrementado
            }
        }
        sc.close();
    }
}
