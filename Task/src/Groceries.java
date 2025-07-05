public class Groceries implements Product {
    private String name;
    private int price;
    private int quantity;
    boolean expire;
    private double weight;
    private boolean shipping;

    public Groceries(String name, int price, int quantity, boolean expire,double weight, boolean shipping) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expire = expire;
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
        return expire;
    }
    public boolean isShippable() {
        return shipping;
    }
}
