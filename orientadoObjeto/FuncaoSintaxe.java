package nelioAlves.orientadoObjeto;

import java.util.Scanner;

public class FuncaoSintaxe {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // COMO ESCREVER FUNÇÕES EM JAVA

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z) { // nome das variaveis aqui dentro não faz diferença
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher " + value);

    }

}
