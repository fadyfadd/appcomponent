package fadyfadd.appcomponent.jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

public class OracleCursor {

	public static void main(String[] args) {
		try {
			Connection conn = null; 
		 
			 conn = DriverManager.getConnection(
			        "jdbc:oracle:thin:@localhost:1521:xe", 
			        "hr", "quLRYP22");
			 
			
			CallableStatement callableStatement = 
					conn.prepareCall("{call get_countries(?)}");
		 
			callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
		
			callableStatement.execute();
			ResultSet result = ((OracleCallableStatement)callableStatement).getCursor(1);
			
				while (result.next()) {
					String x = result.getString(1) + "-" + result.getString(2) + result.getString(3);
					System.out.println(x);
				}
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			
		}

	}

}
