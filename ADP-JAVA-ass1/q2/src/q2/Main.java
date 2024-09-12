package q2;

public class Main {

	public static void main(String[] args) {
		Product p1=new Product(1, 100.00, 10);
		Product p2=new Product(2, 200.00, 20);
		Product p3=new Product(3, 300.00, 30);
		Product p4=new Product(4, 400.00, 40);
		Product p5=new Product(5, 500.00, 50);
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
		
		System.out.println("Total Price: "+Product.totalPrice);

	}

}
