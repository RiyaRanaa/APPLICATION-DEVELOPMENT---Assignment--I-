package q5;

public class CSE extends Marks {
	private int algoDesign;
	
	public CSE(int markICP, int markDSA, int algoDesign) {
		super(markICP, markDSA);
		this.algoDesign=algoDesign;
	}
	@Override
	public void getPercentage() {
		percentage=(markICP + markDSA + algoDesign)/3.0;
	}
	public double getPercentageValue() {
		return percentage;
	}

}
