package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.conexao.ConnectionFactory;

public class TestarConexao {

	public static void main(String[]args) throws SQLException{
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conex�o aberta!");
		connection.close();

	}
}
