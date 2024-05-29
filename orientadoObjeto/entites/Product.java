package nelioAlves.orientadoObjeto.entites;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {  // Construtor padrão

    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) { // Não retorna nada, apenas Altera valor do atributo QUANTITY
        this.quantity += quantity;   // usa-se this para REFERENCIAR O OBJETO ( o atribudo da classe )
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;

    }

    public String toString() { // USA O TOSTRING sobrepondo a classe OBJECT existente em todas os objetos
        return name
                + ", $ "
                + String.format("%.2f", price) // usado para formatar casas decimais igual printf " %.2F%n " ...
                + ", "
                + quantity
                + "  ,"
                + " units, total: $ "
                + String.format("%.2f", totalValueInStock());
    }


}
