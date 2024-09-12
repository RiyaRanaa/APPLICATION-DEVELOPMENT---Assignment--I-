package q1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setData("Joseph", 65784.50, 25 );
		e1.displayData();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Salary: ");
		Double salary=sc.nextDouble();
		System.out.print("Enter Age: ");
		int age=sc.nextInt();
		
		Employee e2=new Employee();
		e2.setData(name, age, age);
		e2.displayData();
		
		if(e1.age>e2.age) {
			System.out.println(e1.name+" is older.");
		}
		else if(e1.age<e2.age) {
			System.out.println(e2.name+" is older.");
		}
		else{
			System.out.println("Same age.");
		}
		
		

	}

}
