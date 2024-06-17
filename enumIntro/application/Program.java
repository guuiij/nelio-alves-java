package nelioAlves.enumIntro.application;

import nelioAlves.enumIntro.entities.Order;
import nelioAlves.enumIntro.entitiesEnum.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.SHIPPED;

        OrderStatus os2 = OrderStatus.valueOf("SHIPPED");  // Converter String para Enum

        System.out.println(os1);
        System.out.println(os2);


    }
}
