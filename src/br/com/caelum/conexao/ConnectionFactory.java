package br.com.caelum.conexao;

import java.sql.*;

public class ConnectionFactory {

	public Connection getConnection() {
		 try {
			 return DriverManager.getConnection(
					 "jdbc:mysql://localhost:3306/java", "root", "");
		 } catch (SQLException e) {
			 throw new RuntimeException(e);
		 }
	}
}
