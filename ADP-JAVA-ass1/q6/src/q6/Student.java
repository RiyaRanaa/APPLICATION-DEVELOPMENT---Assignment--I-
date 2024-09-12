package q6;

public class Student {
	private int maxCount=100;
	private String name;
	
	public Student(String name) {
		this.name=name;
	}
	public void setter(String name) {
		this.name=name;
	}
	public String getter() {
		return name;
	}
	
	public int count() {
		return (name != null) ? name.length() : 0;
	}
	
	public void display() {
		System.out.println("Name: "+name+", no of char: "+count());
	}

}
