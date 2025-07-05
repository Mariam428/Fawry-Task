import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Electronics e1=new Electronics("Mobile",10000,10,500,true);
        Electronics e2=new Electronics("TV",20000,10,1000,true);
        Electronics e3=new Electronics("Fridge",30000,10,10000,true);
        Electronics e4=new Electronics("Scratch Card",10,10,0,false);
        Electronics e5=new Electronics("Laptop",70000,10,2000,true);
        Groceries g1= new Groceries("Cheese",100,10,false,50,true);
        Groceries g2= new Groceries("Biscuits",50,10,false,50,true);
        Groceries g3= new Groceries("Milk",30,10,true,50,true);

        Customer c1 =new Customer(5000);
        Customer c2 =new Customer(1000);

        List<Product> P = new ArrayList<>();
        P.add(e1);
        P.add(e2);
        P.add(e3);
        P.add(e4);
        P.add(e5);
        P.add(g1);
        P.add(g2);
        P.add(g3);


        System.out.println("Welcome to our system");
        System.out.println("available items : ");
        System.out.println("*************************************");
        int no=1;
        for (Product product : P) {
            System.out.println(no + ": " + product.getName() + " ,Price: " + product.getPrice());
            no++;
        }
        System.out.println("*************************************");

        System.out.println("\n***** Case 1 *****"); // payment goes smoothly because he has enough money to check out
        System.out.println(c1.addItem(g1, 2));
        System.out.println(c1.addItem(g2, 1));
        c1.checkout();

        System.out.println("\n");

        System.out.println("***** Case 2 *****"); // adds expired item so the item is not added to cart
        System.out.println(c2.addItem(g3, 1));
        c2.checkout();

        System.out.println("\n");

        System.out.println("***** Case 3 *****"); // transaction failed because of insufficient funds "his balance is smaller than the total"
        System.out.println(c2.addItem(e1, 1));
        c2.checkout();

    }
}