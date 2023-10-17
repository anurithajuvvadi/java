package springdemo.springtutorial;


public class student2 {

		private int sid;
		private String sname;
		private String saddress;
		
		public student2() {
			super();
			// TODO Auto-generated constructor stub
		}

		public student2(int sid, String sname, String saddress) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.saddress = saddress;
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

		public String getSaddress() {
			return saddress;
		}

		public void setSaddress(String saddress) {
			this.saddress = saddress;
		}

		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		

	}



