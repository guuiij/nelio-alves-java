package nelioAlves.composicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import nelioAlves.composicao.entities.Client;
import nelioAlves.composicao.entities.Order;
import nelioAlves.composicao.entities.OrderItem;
import nelioAlves.composicao.entities.Product;
import nelioAlves.composicao.entities.enums.OrderStatus;

public class ProgramOrder03 {
    public ProgramOrder03() {
    }

    public static void main(String[] args) throws ParseException {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDay = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDay);

        System.out.print("Enter order data ");
        System.out.print("Status: ");

        OrderStatus status = OrderStatus.valueOf(sc.next());


        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int countItem = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= countItem; ++i) {

            System.out.println("Enter #" + i + " item");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(quantity, productPrice, product);
            order.addItem(it);


        }

        System.out.println();
        System.out.println(order);


        sc.close();
    }
}
