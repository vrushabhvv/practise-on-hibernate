package hibernateinheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


public class Batsman extends IndianTeam {
	

	
	private String battingHand;
	

	private int highestScore;
	
	
	public Batsman( String battingHand, int highestScore) {

		this.battingHand = battingHand;
		this.highestScore = highestScore;
	}
	public Batsman() {
		super();
	}
	
	


	public String getBattingHand() {
		return battingHand;
	}
	public void setBattingHand(String battingHand) {
		this.battingHand = battingHand;
	}
	public int getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	
	

}
