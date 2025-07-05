import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Cart> cart;
    private int balance;

    public Customer(int balance) {
        this.cart = new ArrayList<>();
        this.balance = balance;
    }

    public String addItem(Product p, int quantity) {
        if (quantity > p.getQuantity()) {
            return "Quantity is not available";
        }

        if (p.isExpired()) {
            return "Item is expired";
        }

        cart.add(new Cart(p, quantity));
        p.reduceQuantity(quantity);
        return "Item added successfully";
    }

    public void checkout() {
        int subtotal = 0;

        for (Cart item : cart) {
            subtotal += item.getProduct().getPrice() * item.getQuantity();
        }

        ShippingService shippingService = new ShippingService();
        int shippingFee = shippingService.CalcShipping(cart);

        int total = subtotal + shippingFee;

        System.out.println("** Checkout receipt **");
        for (Cart item : cart) {
            System.out.println(item.getQuantity() + "x " + item.getProduct().getName() + " " +
                    (item.getProduct().getPrice() * item.getQuantity()) + " EGP");
        }

        System.out.println("----------------------");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Shipping: " + shippingFee);
        System.out.println("Amount: " + total);
        if (total>this.balance)
            System.out.println("Payment Invalid");
        else {
            System.out.println("Transaction Done");
            this.balance -=total;
        }

//        return total;
    }

    public List<Cart> getCart() {
        return cart;
    }
}
