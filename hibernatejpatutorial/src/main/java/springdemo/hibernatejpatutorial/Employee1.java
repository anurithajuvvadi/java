package springdemo.hibernatejpatutorial;

	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

	@Entity
	@Table(name="et_table1")
	//@NamedQuery(query="select e from Employee e where e.id=:id",name="find by employee id")
	public class Employee1 {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)// if i am putting this line, we are getting unrelated errors.so comment it.
		private int id;
		private String ename;
		private double salary;
		private String degree;
		
		public Employee1(int id, String ename, double salary, String degree) {
			super();
			this.id = id;
			this.ename = ename;
			this.salary = salary;
			this.degree = degree;
		}
		public Employee1() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getDegree() {
			return degree;
		}
		public void setDegree(String degree) {
			this.degree = degree;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + ", degree=" + degree + ", getId()="
					+ getId() + ", getEname()=" + getEname() + ", getSalary()=" + getSalary() + ", getDegree()="
					+ getDegree() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
	
		

	}




