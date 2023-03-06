 import java.sql.*;


public class jdbcclassselect {
     public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 String url="jdbc:mysql://localhost:3306/mydb";
		  String password="root";
		   String uname="root";
		    String query= "select UserName from student where USERID=3;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con =DriverManager.getConnection(url, uname, password);
		  Statement st = con.createStatement();
		   ResultSet rs= st.executeQuery(query);
		    rs.next();
       String name = rs.getString("UserName");
       System.out.println(name);
        st.close();
        con.close();
	}
}
