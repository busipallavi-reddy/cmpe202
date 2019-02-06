import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		System.out.println("GUMBALL MACHINE 1");
		Set<Integer> supportedCoins1 = new HashSet<Integer>();
		supportedCoins1.add(25);

		GumballMachine gumballMachine1 = new GumballMachine(5, 25, supportedCoins1);

		System.out.println(gumballMachine1);

		gumballMachine1.insertQuarter();
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);

		gumballMachine1.insertQuarter();
		gumballMachine1.turnCrank();

		gumballMachine1.insertDime();
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);

		System.out.println("GUMBALL MACHINE 2");

		GumballMachine gumballMachine2 = new GumballMachine(5, 50, supportedCoins1);

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter();
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter();
		gumballMachine2.turnCrank();

		gumballMachine2.insertDime();
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);

		System.out.println("GUMBALL MACHINE 3");
		Set<Integer> supportedCoins3 = new HashSet<Integer>();
		supportedCoins3.add(5);
		supportedCoins3.add(10);
		supportedCoins3.add(25);

		GumballMachine gumballMachine3 = new GumballMachine(5, 50, supportedCoins3);

		System.out.println(gumballMachine3);

		gumballMachine3.insertQuarter();
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);

		gumballMachine3.insertQuarter();
		gumballMachine3.turnCrank();

		gumballMachine3.insertDime();
		gumballMachine3.turnCrank();

		gumballMachine3.insertDime();
		gumballMachine3.insertNickel();
		gumballMachine3.insertQuarter();
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);
	}
}
