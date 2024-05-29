package nelioAlves.lista.application;

import nelioAlves.lista.entities.ElectronicProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many products will be registered?");
        int quantidade = sc.nextInt();

        List<ElectronicProduct> productList = new ArrayList<>(quantidade);

        for (int i = 0; i < productList.size(); i++) {
            System.out.println("Product #" + (i + 1) + ":");
            System.out.print("Code: ");
            int code = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            ElectronicProduct product = new ElectronicProduct(code, name, quantity);
            productList.add(product);


        }


        sc.close();
    }
}
