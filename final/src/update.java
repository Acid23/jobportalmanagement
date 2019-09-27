import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
	public static void main(String[] args) throws  IllegalAccessException, ClassNotFoundException, InstantiationException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","asif08");
			Statement statement = connection.createStatement();
			double update = statement.executeUpdate("UPDATE register SET 'username' = 'baba' WHERE 'username' = aba'");
			System.out.println(update+"Updated Succesfully");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
