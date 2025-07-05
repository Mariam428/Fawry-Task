public class Electronics implements Product {
    private String name;
    private int price;
    private int quantity;
    private double weight;
    private boolean shipping;

    public Electronics(String name, int price, int quantity, double weight, boolean shipping) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
        this.shipping = shipping;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getWeight() {
        return weight;
    }
    public void reduceQuantity(int quantity) {
        this.quantity -= quantity;
    }
    public boolean isExpired() {
        return false;
    }
    public boolean isShippable() {
        return shipping;
    }
}
