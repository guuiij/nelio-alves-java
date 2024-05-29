package nelioAlves.orientadoObjeto.exercicios;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite valores");
        int valor01 = sc.nextInt();
        int valor02 = sc.nextInt();

        Calculadora calculadora = new Calculadora();
        System.out.println("Soma : " + calculadora.soma(valor01, valor02));
        System.out.println("Subtração : " +calculadora.subtracao(valor01,valor02) );
        System.out.println("Divisão : " +calculadora.divisao(valor01,valor02) );
        System.out.println("Mutiplicação : " +calculadora.multiplicacao(valor01,valor02) );


        sc.close();
    }
}
