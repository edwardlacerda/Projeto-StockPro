package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO {
     public static boolean cadastrar(Vendedor vendedor) {

        try {
            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "INSERT INTO vendedor (nome_completo, data_nascimento, cpf) VALUES (?, ?, ?);";

            PreparedStatement query = conexao.conexao.prepareStatement(sql);

            
            query.setString(1, vendedor.getNome());
            query.setString(2, vendedor.getData_nascimento());
            query.setString(3, vendedor.getCpf());
            query.execute();

            conexao.desconectar();
            return true;
        } catch (SQLException se) {
            System.out.println("Erro ao executar a consulta: " + se.getMessage());
            return false;
        }

    }

    public static List<Vendedor> listarTodos() {
        List<Vendedor> lista = new ArrayList<>();

        try {

            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "SELECT * FROM vendedor";
            PreparedStatement query = conexao.conexao.prepareStatement(sql);

            ResultSet result = query.executeQuery();

            while (result.next()) {
                Vendedor v = new Vendedor();

                v.setId(result.getInt("id"));
                v.setNome(result.getString("nome_completo"));
                v.setData_nascimento(result.getString("data_nascimento"));
                v.setCpf(result.getString("cpf"));

                lista.add(v);
            }
            conexao.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao listar vendedores");
        }
        return lista;
    }

    public static Vendedor buscarPorId(int id) {
        Vendedor v = new Vendedor();

        try {
            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "SELECT * FROM vendedor WHERE id=?";
            PreparedStatement query = conexao.conexao.prepareStatement(sql);
            query.setInt(1, id);

            ResultSet resposta = query.executeQuery();

            if (resposta.next()) {
                v.setId(resposta.getInt("id"));
                v.setNome(resposta.getString("nome_completo"));
                v.setData_nascimento(resposta.getString("data_nascimento"));
                v.setCpf("Cpf");

            }

            conexao.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o registro " + id + " do banco de dados");
        }
        return v;
    }

    public static boolean excluir(int id) {
        try {

            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "DELETE FROM vendedor WHERE id=?;";
            PreparedStatement query = conexao.conexao.prepareStatement(sql);
            query.setInt(1, id);

            query.execute();

            conexao.desconectar();
            return true;
        } catch (SQLException s) {
            System.out.println("Erro ao deletar o vendedor do banco de dados!");
            return false;
        }
    }
}
