package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.util.FormatData;

public class Testa_InsereContato {

	public static void main(String[]args){
		
			Contato contato = new Contato();
			
		 contato.setNome(JOptionPane.showInputDialog("Digite um nome"));
		 contato.setEmail(JOptionPane.showInputDialog("Digite um email"));
		 contato.setEndereco(JOptionPane.showInputDialog("Digite um endereco"));
		 contato.setDataNascimento(FormatData.formataDataDDMMYYYY((JOptionPane.showInputDialog("Digite a data de nascimento"))));
		 
		 ContatoDAO dao = new ContatoDAO();
		 dao.adiciona(contato);

		 System.out.println("Gravado!");


	}
}
