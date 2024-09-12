package q5;

public class NonCSE extends Marks {
	private int engMechanics;
	
	public NonCSE(int markICP, int markDSA, int engMechanics) {
		super(markICP, markDSA);
		this.engMechanics=engMechanics;
	}
	@Override
	public void getPercentage() {
		percentage=(markICP + markDSA + engMechanics)/3.0;
	}
	public double getPercentageValue() {
		return percentage;
	}

}
