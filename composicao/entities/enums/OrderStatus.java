package nelioAlves.composicao.entities.enums;

public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;

    private OrderStatus() {
    }
}
