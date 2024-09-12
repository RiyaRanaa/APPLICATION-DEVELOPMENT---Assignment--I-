package q1;

public class Employee {
	String name;
	double salary;
	int age;
	
	public void setData(String name,double salary, int age) {
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	public void displayData() {
		System.out.println("Name: "+name+", Salary: "+salary+", Age: "+age);
	}

}
