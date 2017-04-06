package br.com.caelum.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		ContatoDao contatoDao = new ContatoDao();
		
		List<Contato> contatos = contatoDao.getLista();
		
		for(Contato contato : contatos){
			System.out.println("Id: " + contato.getId());
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());
			System.out.println("Dt. Nasc.: " + contato.getDatanascimento());
		}
	}
	
}
