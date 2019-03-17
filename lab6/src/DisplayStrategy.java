import java.util.List;

public abstract class DisplayStrategy {

    public void topBunToppings(){
        System.out.println("LETTUCE");
        System.out.println("TOMATO");
    }
    public void onMeat(){
        System.out.println("--> | G ONION");
        System.out.println("--> | JALA GRILLED");
    }
    public void Meat(){
        System.out.println("{{{  Bacon  }}}");
    }
    public void Bill(){
        System.out.println("Sub. Total      $8.38");
    }
    public void fries(){
        System.out.println("LTL CAJ");
    }
    public void execute(){
        print();
    }
    public abstract void print();
}
