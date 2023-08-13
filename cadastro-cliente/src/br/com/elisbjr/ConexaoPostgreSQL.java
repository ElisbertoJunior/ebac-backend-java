package br.com.elisbjr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgreSQL {

    public static void main(String[] args) {
        // Parâmetros de conexão
        String jdbcUrl = "jdbc:postgresql://localhost:5432/vendas_online_2";
        String usuario =  "postgres";
        String senha = "451945";

        try {
            // Carregar o driver JDBC
            Class.forName("org.postgresql.Driver");

            // Estabelecer a conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(jdbcUrl, usuario, senha);
            System.out.println(conexao.toString());

            // Realizar operações com o banco de dados...

            // Fechar a conexão
            conexao.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
