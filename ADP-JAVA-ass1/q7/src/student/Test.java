package student;

import java.util.Scanner;

public class Test extends Student{
	int mark1;
	int mark2;
	
	@Override
	public void inputDetails() {
		super.inputDetails();
		Scanner sc=new Scanner(System.in);
		System.out.print("Mark1: ");
		this.mark1=sc.nextInt();
		System.out.print("Mark2: ");
		this.mark2=sc.nextInt();
		
	}
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Mark1: "+this.mark1+", Mark2: "+this.mark2);
	}
	
	public int totalMarks() {
		return mark1 + mark2;
	}
	
	

}
