package q3;

public class Main {

	public static void main(String[] args) {
		Deposit d1=new Deposit(10000L, 1, 4.5,10.5);
		Deposit d2=new Deposit(20000L, 2, 3.5);
		Deposit d3=new Deposit(30000L, 1);
		Deposit d4=new Deposit(40000L, 2.5);
		
		
		d1.display();
		d2.display();
		d3.display();
		d4.display();

	}

}
