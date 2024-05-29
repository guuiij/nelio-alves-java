package nelioAlves.orientadoObjeto.application;

import nelioAlves.orientadoObjeto.entites.Product;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product date:");
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Price:");
        double price = sc.nextDouble();
        Product product = new Product (name, price);

        product.setName("Computer");
        System.out.println("Update name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Update price: " + product.getPrice());


        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();
    }
}
