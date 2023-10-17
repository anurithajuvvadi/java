package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_example {

	public static void main(String[] args) throws Exception {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuritha","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from customer");
while(rs.next()) {
	int id=rs.getInt("c_id");
	String name=rs.getString("c_name");
	String address=rs.getString("address");
	
	System.out.println(id+" "+name+" "+address);
}

	}

}
