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
public class ProdutoDAO {

    public static boolean cadastrar(Produto produto) {

        try {
            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "INSERT INTO produto (nome, valor, fabricante, quantidade) VALUES (?, ?, ?, ?);";

            PreparedStatement query = conexao.conexao.prepareStatement(sql);

            query.setString(1, produto.getNome());
            query.setDouble(2, produto.getValor());
            query.setString(3, produto.getFabricante());
            query.setInt(4, produto.getQuantidade());
            query.execute();

            conexao.desconectar();
            return true;
        } catch (SQLException se) {
            System.out.println("Erro ao executar a consulta: " + se.getMessage());
            return false;
        }

    }

    public static List<Produto> listarTodos() {
        List<Produto> lista = new ArrayList<>();

        try {

            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "SELECT * FROM produto";
            PreparedStatement query = conexao.conexao.prepareStatement(sql);

            ResultSet result = query.executeQuery();

            while (result.next()) {
                Produto p = new Produto();

                p.setId(result.getInt("id"));
                p.setNome(result.getString("nome"));
                p.setValor(result.getInt("valor"));
                p.setFabricante(result.getString("fabricante"));
                p.setQuantidade(result.getInt("quantidade"));

                lista.add(p);
            }
            conexao.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao listar protudos");
        }
        return lista;
    }

    public static Produto buscarPorId(int id) {
        Produto p = new Produto();

        try {
            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "SELECT * FROM produto WHERE id=?";
            PreparedStatement query = conexao.conexao.prepareStatement(sql);
            query.setInt(1, id);

            ResultSet result = query.executeQuery();

            if (result.next()) {
                p.setId(result.getInt("id"));
                p.setNome(result.getString("nome"));
                p.setValor(result.getInt("valor"));
                p.setFabricante(result.getString("fabricante"));
                p.setQuantidade(result.getInt("quantidade"));

            }

            conexao.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o registro " + id + " do banco de dados");
        }
        return p;
    }



    public static boolean excluir(int id) {
        try {

            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "DELETE FROM produto WHERE id=?;";
            PreparedStatement query = conexao.conexao.prepareStatement(sql);
            query.setInt(1, id);

            query.execute();

            conexao.desconectar();
            return true;
        } catch (SQLException s) {
            System.out.println("Erro ao deletar o produto do banco de dados!");
            return false;
        }
    }
}
