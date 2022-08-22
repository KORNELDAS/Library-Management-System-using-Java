import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;
public class DBConnection {
Connection connect =null;
public Connection getConnect(){
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/library management system?serverTimezone="+TimeZone.getDefault().getID(),"root","");
	}
	catch (ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return connect;
}
}
