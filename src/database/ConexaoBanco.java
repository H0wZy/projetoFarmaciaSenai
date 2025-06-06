package database;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
        try (Connection conn = ConexaoBanco.getConnection()) {

            String caminhoScript = "src/resources/db/scripts.sql";
            String scriptSQL = Files.readString(Paths.get(caminhoScript));

            String[] comandos = scriptSQL.split(";");

            try (Statement stmt = conn.createStatement()) {
                for (String comando : comandos) {
                    comando = comando.trim();
                    if (!comando.isEmpty()) {
                        stmt.execute(comando + ";");
                    }
                }
            }

            System.out.println("Script executado com sucesso!");

        } catch (Exception e) {
            System.err.println("Erro ao executar o script SQL.");
            e.printStackTrace();
        }


    }
}
