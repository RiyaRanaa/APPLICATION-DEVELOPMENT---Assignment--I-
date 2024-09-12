package total;
import student.Test;
import sports.Sports;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		test.inputDetails();
		
		Totaal t=new Totaal(test, 20, 50);
		t.display();

	}

}
