package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(){
		try{
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "root");
		}catch(SQLException err){
			throw new RuntimeException("Erro ao obter conexão com o banco de dados.", err);
		}
	}
	
}
