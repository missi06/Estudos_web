package br.com.caelum.jdbc.teste;


import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.util.FormatData;

public class Testa_AlteraContato {

	public static void main(String[]args){
		
		Contato contato = new Contato();
		
	 contato.setId(Long.parseLong(JOptionPane.showInputDialog("Digite um id")));
	 contato.setNome(JOptionPane.showInputDialog("Digite um nome"));
	 contato.setEmail(JOptionPane.showInputDialog("Digite um email"));
	 contato.setEndereco(JOptionPane.showInputDialog("Digite um endereco"));
	 contato.setDataNascimento(FormatData.formataDataDDMMYYYY(JOptionPane.showInputDialog("Digite a data de nascimento")));
	 
	 
	 ContatoDAO dao = new ContatoDAO();		
	 dao.altera(contato);

	 System.out.println("Alterado com sucesso!");


}
}
