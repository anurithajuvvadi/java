package hibernate_new.hibernate_project;

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

import com.mysql.cj.xdevapi.Type;

@Entity
@Table(name="studnt_address")
public class address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressid;
	
	@Column(name="CITY",length=20)
	private String city;
	
	private String street;
	private boolean isopen;
	
	@Transient
	private double x;
	
	@Temporal(TemporalType.DATE)
	private Date addeddate;
	
	private byte[] image;
	
	public address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public address(int addressid, String city, String street, boolean isopen, double x, Date addeddate, byte[] image) {
		super();
		this.addressid = addressid;
		this.city = city;
		this.street = street;
		this.isopen = isopen;
		this.x = x;
		this.addeddate = addeddate;
		this.image = image;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public boolean isIsopen() {
		return isopen;
	}
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddeddate() {
		return addeddate;
	}
	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "address [addressid=" + addressid + ", city=" + city + ", street=" + street + ", isopen=" + isopen
				+ ", x=" + x + ", addeddate=" + addeddate + ", image=" + Arrays.toString(image) + "]";
	}
	

}
