package hibernatewithJPA1.hibernatewithjpa1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)//if u want to write own value for  id then dnt write this @generated value 
	private int id;
	private String dname;
	
	@OneToMany(targetEntity=Employee.class)
	private List Employeelist;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dname=" + dname + ", getId()=" + getId() + ", getDname()=" + getDname()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public List getEmployeelist() {
		return Employeelist;
	}
	public void setEmployeelist(List employeelist) {
		Employeelist = employeelist;
	}


}

