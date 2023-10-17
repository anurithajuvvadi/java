package hibernatewithJPA1.manytoonemapping;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Library {
	@Id
	private int bid;
	private String bname;
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	

}
