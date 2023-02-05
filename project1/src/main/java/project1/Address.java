package project1;


import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity   //treat the class as a entity and create table for it
@Table(name="student_address")  //to specify name of table if you want specifically otherwise hibernate will give classname in small letters
public class Address {
	@Id  //to specify it is primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // generate id by itself
	@Column(name="address_id")  //provide column name if you want to change column name
	private int addressid;
	
	@Column(length = 50,name = "city_street") //column name and length also given in same line
	private String street;
	
	@Column(length = 50 )
	private String city;
	
    @Column(name="is_open")
	private boolean isOpen;
    
	@Transient   //to exclude column from database,hibernate will not create column for this
	private double x;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)  //mention date, there are other properties for this, if we want to specify the date and time at once you can do 
	private Date addedDate;
	
	@Lob  //create long object
	private byte[] image;
	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Address(int addressid, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.addressid = addressid;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}
	

}
