package nelioAlves.estruturaRepetitivas.whileExercicios;

import java.util.Scanner;

public class Exer03Posto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Álcool \n2.Gasolina \n3.Diesel \n4.Fim");
        int codigo = sc.nextInt();

        int alcool = 0, gasolina = 0, diesel = 0;

        while (codigo != 4) {

            if (codigo == 1) {
                System.out.println("1.Álcool ");
                 alcool++;
            } else if (codigo == 2) {
                System.out.println("2.Gasolina");
                gasolina++;
            } else if (codigo == 3) {
                System.out.println("3.Diesel ");
                diesel++;
            } else {
                System.out.println("Código inválido, digite um número válido.");
            }
            codigo = sc.nextInt(); // necessário pára que não entre em um loop infinito
        }

        System.out.println("Muito Obrigado !\n" +
                "1.Álcool: " + alcool + "\n2.Gasolina: " + gasolina + "\n3.Diesel: " + diesel);

        sc.close();
    }
}