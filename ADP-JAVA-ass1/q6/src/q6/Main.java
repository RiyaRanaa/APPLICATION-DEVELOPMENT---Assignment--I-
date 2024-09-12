package q6;

public class Main {

	public static void main(String[] args) {
		Student s=new Student("Riya");
		s.display();
		
		s.setter("Raj");
		System.out.println("Updated name: "+s.getter());
		s.display();

	}

}
