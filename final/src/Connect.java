import java.sql.*;//importing sql 
public class Connect {
//database connection variables
	static Connection con = null;
	
	static String databaseName ="mydb";
	
	static String url = "jdbc:mysql://localhost:3306/mydb"; //url with database name
	
	static String username = "root";//username of my db
	static String password ="asif08";//password 
	public static Connection getconnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.jdbc.Driver").newInstance();//this will say to connect mysql
		
		con = DriverManager.getConnection(url,username,password);   //creating connection with database
		
		if(con!=null)
		{
			System.out.println("connected");
		}
		else {
			System.out.println("not connected");
		}
		return con;
	
		

	}
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		Connect d = new Connect();
	    d.getconnection();
	}
	
}