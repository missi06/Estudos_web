package br.com.caelum.jdbc.teste;

import java.util.*;
import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class Testa_ListaContato {

	public static void main(String[]args){
		
		ContatoDAO dao = new ContatoDAO();		
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato : contatos) {
			System.out.println(contato.getNome());
			System.out.println(contato.getEmail());
			System.out.println(contato.getEndereco());
			System.out.println(contato.getDataNascimento());
			System.out.println("-------");
			}
		
		
	}
}
