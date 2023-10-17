package hibernatewithJPA1.manytoonemapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(query="select s from Student s where s.sid=:id",name="find by student id")
public class Student {
	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO)  

	private int sid;
	private String sname;
	 @ManyToOne  
	    private Library lib;  
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
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
	public Library getLib() {  
        return lib;  
    }  
    public void setLib(Library lib) {  
        this.lib = lib;  
    }  
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", getSid()=" + getSid() + ", getSname()=" + getSname()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
