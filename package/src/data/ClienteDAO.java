
package data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eddie
 */
public class ClienteDAO {
    public static boolean cadastrar(Cliente cliente) {

        try {
            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "INSERT INTO cliente (nome_completo, data_nascimento, cpf) VALUES (?, ?, ?);";

            PreparedStatement query = conexao.conexao.prepareStatement(sql);

            
            query.setString(1, cliente.getNome());
            query.setString(2, cliente.getData_nascimento());
            query.setString(3, cliente.getCpf());
            query.execute();

            conexao.desconectar();
            return true;
        } catch (SQLException se) {
            System.out.println("Erro ao executar a consulta: " + se.getMessage());
            return false;
        }

    }

    public static List<Cliente> listarTodos() {
        List<Cliente> lista = new ArrayList<>();

        try {

            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "SELECT * FROM cliente";
            PreparedStatement query = conexao.conexao.prepareStatement(sql);

            ResultSet result = query.executeQuery();

            while (result.next()) {
                Cliente c = new Cliente();

                c.setId(result.getInt("id"));
                c.setNome(result.getString("nome_completo"));
                c.setData_nascimento(result.getString("data_nascimento"));
                c.setCpf(result.getString("cpf"));

                lista.add(c);
            }
            conexao.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao listar clientes");
        }
        return lista;
    }

    public static Cliente buscarPorId(int id) {
        Cliente c = new Cliente();

        try {
            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "SELECT * FROM cliente WHERE id=?";
            PreparedStatement query = conexao.conexao.prepareStatement(sql);
            query.setInt(1, id);

            ResultSet resposta = query.executeQuery();

            if (resposta.next()) {
                c.setId(resposta.getInt("id"));
                c.setNome(resposta.getString("nome_completo"));
                c.setData_nascimento(resposta.getString("data_nascimento"));
                c.setCpf("Cpf");

            }

            conexao.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o registro " + id + " do banco de dados");
        }
        return c;
    }

    public static boolean excluir(int id) {
        try {

            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "DELETE FROM cliente WHERE id=?;";
            PreparedStatement query = conexao.conexao.prepareStatement(sql);
            query.setInt(1, id);

            query.execute();

            conexao.desconectar();
            return true;
        } catch (SQLException s) {
            System.out.println("Erro ao deletar o cliente do banco de dados!");
            return false;
        }
    }
    
}
