package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private static final String DB_URL = "jdbc:postgresql://localhost:8010/farmacia";
    private static final String DB_USER = "docker";
    private static final String DB_PASSWORD = "docker";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Conexão com o PostgreSQL estabelecida com sucesso!");
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Erro ao conectar ao banco de dados PostgreSQL. Verifique o Docker e as credenciais.");
            e.printStackTrace();
        }
        return connection;
    }



    public static void main(String[] args) {
        Connection conn = ConexaoBanco.getConnection();

    }
}
