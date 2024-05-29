package nelioAlves.estruturaRepetitivas.whileExercicios;

import java.util.Scanner;

public class Exer01SenhaFixa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe senha numérica");
        int senha = sc.nextInt();


        while (senha != 2002) {
            System.out.println("Senha incorreta !");
            senha = sc.nextInt();
        }
        System.out.println(" Bem vindo !");

        sc.close();
    }
}
