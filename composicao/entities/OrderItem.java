package nelioAlves.composicao.entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private List<Product> productList = new ArrayList();

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double subTotal() {
        return (double)this.quantity * this.price;
    }

    public List<Product> getProductList() {
        return this.productList;
    }

    public void addProduct(Product products) {
        this.productList.add(products);
    }
}
