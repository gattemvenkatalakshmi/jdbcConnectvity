import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbcclasswhere {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 String url="jdbc:mysql://localhost:3306/mydb";
		  String password="root";
		   String uname="root";
		    String query= "select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con =DriverManager.getConnection(url, uname, password);
		  Statement st = con.createStatement();
		   ResultSet rs= st.executeQuery(query);
		    String userData =" ";
		   while(rs.next()) {
      userData= rs.getInt(1)+":"+rs.getString("UserName");// we can also write rs.getString(2);
      System.out.println(userData);
	}
       st.close();
       con.close();

	}

}
