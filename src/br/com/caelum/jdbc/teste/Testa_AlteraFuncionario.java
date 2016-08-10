package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class Testa_AlteraFuncionario {

	public static void main(String[]args){
		
		Funcionario func = new Funcionario();
		
		func.setId(Long.parseLong(JOptionPane.showInputDialog("Digite o id do funcionário que deseja alterar")));
		func.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário para alterar"));
		func.setUsuario(JOptionPane.showInputDialog("Digite o usuário do funcionário para alterar"));
		func.setSenha(JOptionPane.showInputDialog("Digite a senha do funcionario para alterar"));
		 
		 
		FuncionarioDAO dao = new FuncionarioDAO();
		 dao.altera(func);

		 System.out.println("Alterado com sucesso!");
	}
}
