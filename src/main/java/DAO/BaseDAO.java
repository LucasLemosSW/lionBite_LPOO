package DAO;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BaseDAO {
    public static Connection getConnection() {

        try {

            //a string com a url para o banco de dados
            //sintaxe: protocolo:tecnologia://domínioDoServidor:porta/database
//            jdbc:postgresql://${server.address}/${server.port}?user=${database.user}&password=${database.password}
//            final String url = "jdbc:postgresql://localhost:5432/TSI_BD2";
            final String url = "jdbc:mariadb://localhost:3306/lionbite";
//            Class.forName("org.postgresql.Driver");
            //argumentos: url para o banco, usuário, senha.
            //retorna um objeto da classe Connection (do pacote java.sql -> que segue a especificação JDBC).
            return DriverManager.getConnection(url, "root", "senha5");
//            return DriverManager.getConnection(url, "postgres", "");
        } catch (SQLException  e ) {
            e.printStackTrace();
            return null; //se não conectar, retorna null.
        }
    }

    //um main para testar a conexão com o servidor do MariaDB
    public static void main(String[] args) {
        System.out.println("\nBASE-> " + BaseDAO.getConnection());
    }
}
