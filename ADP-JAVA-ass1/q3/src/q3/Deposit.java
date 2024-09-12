package q3;

public class Deposit {
	private Long Principal;
	private Integer Time;
	private Double Rate;
	private Double TotalAmt;
	
	public Deposit(Long Principal, Integer Time, Double Rate, Double TotalAmt) {
		this.Principal=Principal;
		this.Time=Time;
		this.Rate=Rate;
		this.TotalAmt=TotalAmt;
	}
	public Deposit(Long Principal, Integer Time, Double Rate) {
		this.Principal=Principal;
		this.Time=Time;
		this.Rate=Rate;
		calcAmt();
	}
	public Deposit(Long Principal, Integer Time) {
		this.Principal=Principal;
		this.Time=Time;
		this.Rate=5.0;
		calcAmt();
	}
	public Deposit(Long Principal, Double Rate) {
		this.Principal=Principal;
		this.Time=1;
		this.Rate=Rate;
		calcAmt();
	}
	
	public void display() {
		System.out.println("Principal: "+Principal+", Time: "+Time+", Rate: "+Rate+", TotalAmt: "+TotalAmt);
	}
	public void calcAmt() {
		this.TotalAmt= Principal + (Principal * Rate * Time)/100;
	}
}
