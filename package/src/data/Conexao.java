package data;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {

    public Connection conexao;

    public String url = "jdbc:mysql://localhost:3306/stockPro_plus_sales_db";
    public String user = "root";
    public String password = "root";

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, user, password);

            System.out.println("Conexão realizada com sucesso");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco de dados: " + ex.getMessage());
            return false;
        }
    }

    public void desconectar() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            
        }
    }
}
            
   

