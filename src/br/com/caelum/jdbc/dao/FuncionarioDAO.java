package br.com.caelum.jdbc.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.modelo.Funcionario;
import br.com.caelum.conexao.ConnectionFactory;

public class FuncionarioDAO {

private Connection connection;
	
	public FuncionarioDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	/////////
	public void adiciona(Funcionario func){
		String sql = "insert into funcionarios (nome,usuario,senha)" +
				 		" values (?,?,?)";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			 stmt.setString(1,func.getNome());
			 stmt.setString(2,func.getUsuario());
			 stmt.setString(3,func.getSenha());

			
				stmt.execute();
				stmt.close();
					
		 } catch (SQLException e) {
			 throw new RuntimeException(e);
			 }

	}
	
	////////
	public List<Funcionario> getLista(){
		try {
			 List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			 PreparedStatement stmt = this.connection.prepareStatement("select * from funcionarios'");
			 ResultSet rs = stmt.executeQuery();
			 
			 while (rs.next()) {
				  // criando o objeto Contato
				 Funcionario func = new Funcionario();
				  
				 func.setId(rs.getLong("id"));
				 func.setNome(rs.getString("nome"));
				 func.setUsuario(rs.getString("usuario"));
				 func.setSenha(rs.getString("senha"));

					  
				 funcionarios.add(func);
			}
					  
			 rs.close();
			 stmt.close();
			 return funcionarios;
		 }catch (SQLException e) {
					   throw new RuntimeException(e);
		 }	
	
	}
	
	///////
	public void altera(Funcionario func) {
		String sql = "update funcionarios set nome=?, usuario=?, senha=? where id_user=?";
		
		try {
			 PreparedStatement stmt = connection.prepareStatement(sql);
				 stmt.setString(1, func.getNome());
				 stmt.setString(2, func.getUsuario());
				 stmt.setString(3, func.getSenha());
				 stmt.setLong(4, func.getId());
				 
				 stmt.execute();
				 stmt.close();
		} catch (SQLException e) {
			 throw new RuntimeException(e);
		}
		
	}
	
	////////
	public void remove(Funcionario func) {
		 try {
		 PreparedStatement stmt = connection.prepareStatement("delete from funcionarios where id_user=?");
			 stmt.setLong(1, func.getId());
			 
			 stmt.execute();
			 stmt.close();
		 } catch (SQLException e) {
			 throw new RuntimeException(e);
		 }
		 
	}
}
