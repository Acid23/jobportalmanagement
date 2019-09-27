import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class register {

	public static void main(String[] args) throws  IllegalAccessException, ClassNotFoundException, InstantiationException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","asif08");
			Statement statement = connection.createStatement();
			int update = statement.executeUpdate("insert into register values('aba','mdasifbaba23@gmail.com','9618659830','asifbaba','asifbaba')");
			System.out.println(update+"Row Inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}