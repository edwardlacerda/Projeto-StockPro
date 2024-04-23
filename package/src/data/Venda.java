package data;


public class Venda {

    private int id;
    private int produto_id;
    private int vendedor_id;
    private int cliente_id;
    private String data_venda;
    private int quantidade_produto;

    public Venda(int id, int produto_id, int vendedor_id, int cliente_id, String data_venda, int quantidade_produto) {
        this.id = id;
        this.produto_id = produto_id;
        this.vendedor_id = vendedor_id;
        this.cliente_id = cliente_id;
        this.data_venda = data_venda;
        this.quantidade_produto = quantidade_produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    public int getVendedor_id() {
        return vendedor_id;
    }

    public void setVendedor_id(int vendedor_id) {
        this.vendedor_id = vendedor_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public int getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Venda() {

    }

    Produto produto = new Produto();
    Vendedor vendedor = new Vendedor();
    Cliente cliente = new Cliente();

}
