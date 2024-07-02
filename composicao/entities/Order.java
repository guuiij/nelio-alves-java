package nelioAlves.composicao.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import nelioAlves.composicao.entities.enums.OrderStatus;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> orderItemList = new ArrayList();

    public Order(Date moment, nelioAlves.enumIntro.entitiesEnum.OrderStatus orderStatus) {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItemList() {
        return this.orderItemList;
    }

    public void addOrder(OrderItem item) {
        this.orderItemList.add(item);
    }
}
