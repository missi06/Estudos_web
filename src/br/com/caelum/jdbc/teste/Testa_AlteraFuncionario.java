package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class Testa_AlteraFuncionario {

	public static void main(String[]args){
		
		Funcionario func = new Funcionario();
		
		func.setId(Long.parseLong(JOptionPane.showInputDialog("Digite o id do funcion�rio que deseja alterar")));
		func.setNome(JOptionPane.showInputDialog("Digite o nome do funcion�rio para alterar"));
		func.setUsuario(JOptionPane.showInputDialog("Digite o usu�rio do funcion�rio para alterar"));
		func.setSenha(JOptionPane.showInputDialog("Digite a senha do funcionario para alterar"));
		 
		 
		FuncionarioDAO dao = new FuncionarioDAO();
		 dao.altera(func);

		 System.out.println("Alterado com sucesso!");
	}
}
