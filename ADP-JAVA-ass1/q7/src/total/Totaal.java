package total;

import sports.Sports;
import student.Test;


public class Totaal implements Sports{
	private Test test;
	private int score1;
	private int score2;
	
	public Totaal(Test test, int score1, int score2) {
		this.test=test;
		this.score1=score1;
		this.score2=score2;
	}
	
	@Override
	public int getScore1() {
		return this.score1;
	}
	@Override
	public int getScore2() {
		return this.score2;
	}
	
	public int grandTotal() {
		return test.totalMarks() + getScore1() + getScore2();
	}
	
	public int totalScore() {
		return score1 + score2;
	}
	
	public void display() {
		test.showDetails();
		System.out.println("Total Marks: "+test.totalMarks());
		System.out.println("Score1: "+getScore1()+", Score2: "+getScore2());
		System.out.println("Total Score: "+totalScore());
		System.out.println("Grand Total: "+grandTotal());
	}
}
