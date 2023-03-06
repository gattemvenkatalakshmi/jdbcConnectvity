import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcclassinsert {
    public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 String url="jdbc:mysql://localhost:3306/mydb";
		  String password="root";
		   String uname="root";
		    int userid=6;
		     String  username ="Ali";
		     String query= "insert into student values(?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con =DriverManager.getConnection(url, uname, password);
		  //Statement st = con.createStatement();
		 PreparedStatement st = con.prepareStatement(query);
		  st.setInt(1, userid);
		   st.setString(2, username);
		   int rs= st.executeUpdate();
		    System.out.println(rs+" rows Effected");
		   
	}

	}


