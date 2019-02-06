/**
 * Pallavi's Gumball machine!!!
 *
 * @author Busi Pallavi Reddy
 * @version 1.0
 */
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello !!! Welcome to Pallavi's Gumball Machine :)");
        Set<Integer> h1 = new HashSet<Integer>();
        h1.add(25);
        System.out.println("\nGumball Machine 1 \n");
        GumballMachine gumball1 = new GumballMachine(1, 25, h1);
        gumball1.insertCoins(25);
        gumball1.turnCrank();
        gumball1.insertCoins(25);
        gumball1.turnCrank();
        System.out.println(gumball1);


        System.out.println("\nGumball Machine 2 \n");
        GumballMachine gumball2 = new GumballMachine(1, 50, h1);
        gumball2.insertCoins(25);
        gumball2.turnCrank();
        gumball2.insertCoins(25);
        gumball2.turnCrank();
        gumball2.insertCoins(5);
        gumball2.turnCrank();
        System.out.println(gumball2);


        Set<Integer> h2 = new HashSet<Integer>();
        h2.add(5);
        h2.add(10);
        h2.add(25);
        System.out.println("\nGumball Machine 3 \n");
        GumballMachine gumball3 = new GumballMachine(1, 50, h2);
        gumball3.insertCoins(25);
        gumball3.turnCrank();
        gumball3.insertCoins(5);
        gumball3.turnCrank();
        gumball3.insertCoins(5);
        gumball3.turnCrank();
        gumball3.insertCoins(10);
        gumball3.turnCrank();
        gumball3.insertCoins(5);
        gumball3.turnCrank();
        System.out.println(gumball3);
    }
}

