package nelioAlves.orientadoObjeto.application;

import nelioAlves.orientadoObjeto.entites.Rectangle;


import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Rectangle rec = new Rectangle();

        System.out.println("Enter rectangle width and heidth: ");
        rec.width = sc.nextDouble();
        rec.height = sc.nextDouble();

        System.out.println(rec);


        sc.close();
    }
}
