import java.util.List;

public class ShippingService implements Shipping{

    public int CalcShipping(List<Cart>products){
        double totalWeight=0;
        System.out.println("** Shipment notice **");
        for (Cart p : products) {
            String name = p.getProduct().getName();
            double weight = p.getWeight();
            totalWeight+=weight;
            System.out.println(p.getQuantity() + "x " + name + " " + (int) weight + "g");
        }

        double weightInKg = totalWeight / 1000.0;
        System.out.printf("Total package weight %.1fkg%n", weightInKg);
        int Fee = (int) Math.ceil(weightInKg) * 15;
        System.out.println("Shipping fee: " + Fee + " EGP");

        return Fee;
    }

    public String getName() {
        return null;
    }

    public double getWeight() {
        return 0;
    }
}
