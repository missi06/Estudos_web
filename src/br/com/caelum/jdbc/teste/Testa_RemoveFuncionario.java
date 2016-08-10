package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class Testa_RemoveFuncionario {

public static void main(String[]args){
		
	Funcionario func = new Funcionario();
		
			func.setId(Long.parseLong(JOptionPane.showInputDialog("Digite um id para excluir")));
		 FuncionarioDAO dao = new FuncionarioDAO();
		 dao.remove(func);

		 System.out.println("Removido com sucesso!");
	}
}
