package nelioAlves.composicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import nelioAlves.composicao.entities.Client;
import nelioAlves.composicao.entities.Order;
import nelioAlves.composicao.entities.OrderItem;
import nelioAlves.composicao.entities.Product;
import nelioAlves.enumIntro.entitiesEnum.OrderStatus;

public class ProgramOrder03 {
    public ProgramOrder03() {
    }

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter cliente data");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDay = sdf.parse(sc.nextLine());
        new Client(name, email, birthDay);
        System.out.print("Enter order data ");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();
        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus));
        System.out.print("How many items to this order? ");
        int countItem = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= countItem; ++i) {
            OrderItem orderItem = new OrderItem();
            System.out.println("Enter #" + i + " item");
            System.out.print("Product name: ");
            String namePro = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            Product product = new Product(namePro, price);
            orderItem.setQuantity(quantity);
            orderItem.addProduct(product);
            order.addOrder(orderItem);
        }

        sc.close();
    }
}
