package q5;

public abstract class Marks {
	protected int markICP;
	protected int markDSA;
	protected double percentage;
	
	public Marks(int markICP, int markDSA) {
		this.markICP=markICP;
		this.markDSA=markDSA;
	}
	abstract void getPercentage();
}
