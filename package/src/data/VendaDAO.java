package data;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendaDAO {

    public boolean adicionarVenda(Venda venda) {
        try {
            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "INSERT INTO venda (produto_id, vendedor_id, cliente_id, data, qtde_produto) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement query = conexao.conexao.prepareStatement(sql);
            
            query.setInt(1, venda.getProduto_id());
            query.setInt(2, venda.getVendedor_id());
            query.setInt(3, venda.getCliente_id());
            query.setString(4, venda.getData_venda());
            query.setInt(5, venda.getQuantidade_produto());
            
            int rowsAffected = query.executeUpdate();

            conexao.desconectar();

            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar a venda: " + e.getMessage());
            return false;
        }
    }
}

