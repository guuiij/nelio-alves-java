package nelioAlves.heranca.application;

import nelioAlves.heranca.entities.ImportedProduct;
import nelioAlves.heranca.entities.Product;
import nelioAlves.heranca.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramProduct {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int quantidade = sc.nextInt();
        List<Product> productList = new ArrayList<>(quantidade);

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            String type = sc.next();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            Product product;

            if (type.equalsIgnoreCase("i")) {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                product = new ImportedProduct(name, price, customsFee);

            } else if (type.equalsIgnoreCase("u")) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dateString = sc.next();
                Date parsedDate = sdf.parse(dateString);
                product = new UsedProduct(name, price, parsedDate);

            } else {
                product = new Product(name, price);
            }

            productList.add(product);
        }

        System.out.println("PRICE TAGS: ");
        System.out.println();
        for (Product product : productList) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
