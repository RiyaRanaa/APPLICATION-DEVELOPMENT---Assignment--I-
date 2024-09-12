package q5;

public class Main {

	public static void main(String[] args) {
		CSE cs=new CSE(80, 85, 95);
		cs.getPercentage();
		System.out.println("CSE % = "+cs.getPercentageValue());
		
		NonCSE ncs=new NonCSE(82, 87, 92);
		ncs.getPercentage();
		System.out.println("CSE % = "+ncs.getPercentageValue());
		

	}

}
