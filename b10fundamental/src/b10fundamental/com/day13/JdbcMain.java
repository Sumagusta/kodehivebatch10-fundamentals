package b10fundamental.com.day13;

import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JdbcMain {
	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/kampusb10";
		String username = "root";
		String password = "kodehive2020";
		
	}

}
