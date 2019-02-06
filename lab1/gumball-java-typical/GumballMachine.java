/**
 * Pallavi's Gumball machine!!!
 *
 * @author Busi Pallavi Reddy
 * @version 1.0
 */
import java.util.HashSet;
import java.util.Set;

public class GumballMachine {
    private int size;
    private int cost;
    private Set<Integer> supportedCoins;
    private int insertedValue;
    public GumballMachine(int size, int cost, Set<Integer> supportedCoins) {
        this.size = size;
        this.cost = cost;
        this.supportedCoins = supportedCoins;
        this.insertedValue = 0;
    }
    public void insertCoins(int coin){
        if (this.supportedCoins.contains(coin)) {
            insertedValue += coin;
        }
        else {
            System.out.println("This Gumball Machine does not accept this coin!!!");
        }
    }
    public void turnCrank() {
        if (this.size > 0) {
            if (this.insertedValue == this.cost) {
                this.size --;
                this.insertedValue = 0;
                System.out.println("Thanks for your coins.  Gumball Ejected!");
            }
            else if (insertedValue < this.cost) {
                System.out.println("Not enough coins please insert till " + this.cost);
            }
        }
        else {
            System.out.println("Sorry no more Gumballs! Can't return your coins!");
        }
    }
}

