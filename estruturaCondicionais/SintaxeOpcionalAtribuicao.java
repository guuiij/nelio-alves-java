package nelioAlves.estruturaCondicionais;

import java.util.Scanner;

public class SintaxeOpcionalAtribuicao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50;

        if (minutos > 100) {
          //  conta = conta + (minutos - 100) * 2.0; mesma coisa que a de baixo
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor da conta =  R$ %.2f%n ", conta);

        double PI = 3.14159265358979323846;
        System.out.printf("O valor de pi é : %.3f " , PI);

        sc.close();
    }
}
