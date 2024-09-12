package student;

import java.util.Scanner;

public class Student {
	protected String name;
	protected int rollno;
	
	public void inputDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Name: ");
		this.name=sc.nextLine();
		System.out.print("Roll No: ");
		this.rollno=sc.nextInt();
	}
	
	public void showDetails() {
		System.out.println("Name: "+this.name+", Roll No: "+this.rollno);
		
	}


}
