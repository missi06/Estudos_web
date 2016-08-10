package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;
import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class Testa_InsereFuncionario {

	public static void main(String[]args){
		
		 Funcionario func = new Funcionario();
		
			 func.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário"));
			 func.setUsuario(JOptionPane.showInputDialog("Digite o usuario do funcionário"));
			 func.setSenha(JOptionPane.showInputDialog("Digite a senha do funcionário"));
		 
		 
			FuncionarioDAO dao = new FuncionarioDAO();
			 dao.adiciona(func);

			 System.out.println("Funcionário gravado com sucesso!");
	}
}
