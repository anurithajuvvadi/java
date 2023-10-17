package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcupdate_example {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuritha","root","root");
		Statement st=con.createStatement();
        st.executeUpdate
		("create table registration"+
		"(id int not null,"+
				"first varchar(30),"+
				"last varchar(30) ,"+
			    "primary key(id))");
		
		String s1="insert into registration values(1,'anu','juvvadi')";
		String s2="insert into registration values(2,'anuritha','texas')";
		String s3="insert into registration values(3,'ashritha','texas')";

		st.addBatch(s1);
		st.addBatch(s2);
		st.addBatch(s3);
		st.executeBatch();
		
		System.out.println("table created");
	}

	
}
