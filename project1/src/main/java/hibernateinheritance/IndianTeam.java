package hibernateinheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;




public class IndianTeam {
	
	
	

    
   
	private int slnumber;
    private String firstName;
	private String lastName;
    
    
    
    
    
	public IndianTeam(int slnumber) {
		super();
		this.slnumber = slnumber;
	}
	public int getSlnumber() {
		return slnumber;
	}
	public void setSlnumber(int slnumber) {
		this.slnumber = slnumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public IndianTeam(String firstName, String lastName) {
	
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public IndianTeam() {
		
	}
	

}
