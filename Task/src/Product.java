public interface Product {
    String getName();
    int getPrice();
    int getQuantity();
    void reduceQuantity(int quantity);
    double getWeight();

    boolean isExpired();
    boolean isShippable();
}
