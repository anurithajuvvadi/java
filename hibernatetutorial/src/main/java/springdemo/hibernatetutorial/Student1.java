package springdemo.hibernatetutorial;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student1 {
	@Id
	private int sid;
	private String sname;
	private String scity;
	
	
	public Student1(int sid, String sname, String scity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
	}
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}

}
