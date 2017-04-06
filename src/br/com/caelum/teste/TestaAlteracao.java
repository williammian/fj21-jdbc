package br.com.caelum.teste;

import java.util.Date;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TestaAlteracao {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setId(1L);
		contato.setNome("Teste nome");
		contato.setEmail("teste@email.com.br");
		contato.setEndereco("Rua Nove, 123");
		contato.setDatanascimento(new Date());
		
		ContatoDao dao = new ContatoDao();
		
		dao.altera(contato);
		
		System.out.println("Alteração ok.");
	}
}
