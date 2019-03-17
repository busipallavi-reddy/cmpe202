import java.util.List;

public abstract class DisplayStrategy {

    public void topBunToppings(){
        System.out.println("Top Topping 1");
        System.out.println("Top Topping 2");
    }
    public void onMeat(){
        System.out.println("--> Meat Topping 1");
        System.out.println("--> Meat Topping 2");
    }
    public void Meat(){
        System.out.println("{{{  Meat  }}}");
    }
    public void Bill(){
        System.out.println("$10.00");
    }
    public void execute(){
        print();
    }
    public abstract void print();
}
