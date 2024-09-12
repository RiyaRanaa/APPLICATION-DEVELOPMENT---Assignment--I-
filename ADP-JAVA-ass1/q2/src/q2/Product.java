package q2;

public class Product {
	 int prodId;
	 double price;
	 int quantity;
	 static double totalPrice;
	 
	 public Product(int prodId, double price, int quantity) {
		 this.prodId= prodId;
		 this.price=price;
		 this.quantity=quantity;
		 totalPrice=totalPrice+(this.price * this.quantity);
	 }
	 public void display() {
		 System.out.println("Prod Id: "+prodId+", Price: "+price+", Quantity: "+quantity+", Total Price for this: "+(price*quantity));
	 }

}
