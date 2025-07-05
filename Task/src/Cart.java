import java.util.List;

public class Cart {
        private Product product;
        private int quantity;

        public Cart(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public Product getProduct() {
            return product;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getWeight() {
            return product.getWeight();
        }
}
