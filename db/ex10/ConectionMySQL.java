package aula10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;

public class ConectionMySQL {

	public static String status = "não conectado";
	
	public ConectionMySQL() {
		
	}
	
	public static java.sql.Connection getConectionMySQL(){
		Connection connection = null;
		String driveName = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driveName);
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		String serverName = "localhost";
		String mydatabase = "escoladb";
		String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
		String username = "root";
		String password = "";
		
		try {
			connection = DriverManager.getConnection(url, username, serverName);
			status = "Conectado ao DB: "+mydatabase;
			Systema.out.println(status);
		} catch (SQLException e) {
			System.out.println(status);
			e.printStackTrace();
		}
				
		return connection;
	}
}
