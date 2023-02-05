package hibernateinheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


public class Bowler extends IndianTeam{

	private String bowlingHand;

	private String bestFigure;
	
	
	
	
	
	public String getBowlingHand() {
		return bowlingHand;
	}
	public void setBowlingHand(String bowlingHand) {
		this.bowlingHand = bowlingHand;
	}
	public String getBestFigure() {
		return bestFigure;
	}
	public void setBestFigure(String bestFigure) {
		this.bestFigure = bestFigure;
	}
	public Bowler(String bowlingHand, String bestFigure) {
		this.bowlingHand = bowlingHand;
		this.bestFigure = bestFigure;
	}
	public Bowler() {
		super();
	}


	
	

}
