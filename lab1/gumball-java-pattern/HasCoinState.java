public class HasCoinState implements State {
	GumballMachine gumballMachine;

	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertMoney(int cents) {
		if (gumballMachine.moneyInserted >= gumballMachine.cost) {
			System.out.println("You can't insert more money");
		}
		gumballMachine.moneyInserted += cents;
	}
 
	public void ejectMoney() {
		System.out.println("Money returned");
		gumballMachine.setState(gumballMachine.getNoCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		if (gumballMachine.moneyInserted >= gumballMachine.cost) {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		int balance = gumballMachine.cost - gumballMachine.moneyInserted;
		if (gumballMachine.moneyInserted < gumballMachine.cost) {
			return "waiting for more " + balance ;
		}
		return "waiting for turn of crank";
	}
}
