import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcclassdelete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 String url="jdbc:mysql://localhost:3306/mydb";
		  String password="root";
		   String uname="root";
		    String query= "delete from student where USERID=6;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con =DriverManager.getConnection(url, uname, password);
		 Statement st = con.createStatement();
		 int rs= st.executeUpdate(query);
		    System.out.println(rs+" rows Effected");
	

	}

}
