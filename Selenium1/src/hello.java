import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class hello {

	public static void main(String[] args) {
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
			String sql= "Select * from adactin";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String ausername = rs.getString("AUSERNAME");
				String apwd = rs.getString("APWD");
				System.out.println(ausername);
				System.out.println(apwd);
			}
			
			
		con.close();
	
	}catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		

	}
}
}
