package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class Testa_RemoveContato {

	public static void main(String[]args){
		
		Contato contato = new Contato();
		
		 contato.setId(Long.parseLong(JOptionPane.showInputDialog("Digite um id")));
		 ContatoDAO dao = new ContatoDAO();
		 dao.remove(contato);

		 System.out.println("Removido com sucesso!");
	}
}
