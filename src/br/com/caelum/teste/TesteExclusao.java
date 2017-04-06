package br.com.caelum.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TesteExclusao {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setId(1L);
		
		ContatoDao dao = new ContatoDao();
		dao.remove(contato);
		
		System.out.println("Exclusão ok.");
	}
	
}
