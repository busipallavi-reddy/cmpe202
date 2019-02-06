import java.util.Set;

public class GumballMachine {
 
	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	int cost = 0;
	int moneyInserted = 0;
    Set<Integer> supportedCoins;

	public GumballMachine(int numberGumballs, int cost, Set<Integer> supportedCoins) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
		this.cost = cost;
		this.supportedCoins = supportedCoins;
 		if (numberGumballs > 0) {
			state = noCoinState;
		}
	}

	public void insertQuarter() {
		if (this.supportedCoins.contains(25)) {
			System.out.println("You inserted a quarter");
			state.insertMoney(25);
		}
		else {
			System.out.println("We do not accept quarters");
			this.ejectMoney();
		}
	}
	public void insertNickel() {
		if (this.supportedCoins.contains(5)) {
			System.out.println("You inserted a nickel");
			state.insertMoney(5);
		}
		else {
			System.out.println("We do not accept nickels");
			this.ejectMoney();
		}
	}
	public void insertDime() {
		if (this.supportedCoins.contains(10)) {
			System.out.println("You inserted a dime");
			state.insertMoney(10);
		}
		else {
			System.out.println("We do not accept dimes");
			this.ejectMoney();
		}
	}
 
	public void ejectMoney() {
		state.ejectMoney();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
