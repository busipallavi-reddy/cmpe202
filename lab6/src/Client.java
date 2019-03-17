import java.util.ArrayList;

public class Client {
    public static void main(String args[]) {
        ArrayList<String> toppings = new ArrayList<>();
        Context c = new Context();
        System.out.println("\nRequest Slip\n************\n");
        c.setStrategy(new RequestStrategy());
        c.executeStrategy();
        System.out.println("\nPacking Slip\n************\n");
        c.setStrategy(new PackingStrategy());
        c.executeStrategy();
    }
}
