package br.com.caelum.teste;

import java.util.Date;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TesteInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Humberto Alves");
		contato.setEmail("humberto@email.com.br");
		contato.setEndereco("Rua Javari, 134");
		contato.setDatanascimento(new Date());
		
		ContatoDao dao = new ContatoDao();
		dao.adicionaContato(contato);
		
		System.out.println("Contato adicionado.");
	}
	
}
