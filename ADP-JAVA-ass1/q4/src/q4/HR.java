package q4;

public class HR extends Employee{
	int Eid;
	double salary;
	public HR(String name, int age, int Eid, double salary) {
		super(name,age);
		this.Eid=Eid;
		this.salary=salary;
	}
	void displayDetails() {
		System.out.println("Name: "+name+", Age: "+age+", Eid: "+Eid+", Salary: "+salary);
	}

}
