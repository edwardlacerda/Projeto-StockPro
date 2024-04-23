package data;

public class Produto {

    private int id;
    private String nome;
    private double valor;
    private String fabricante;

    private int quantidade;

    public Produto(int id, String nome, double valor, String fabricante, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.fabricante = fabricante;
        this.quantidade = quantidade;
    }

    public Produto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return this.getNome();
       
        
    }

    
    
    public static String converterParaSQL(String dataAntiga) {
        String[] partesData = dataAntiga.split("/"); //imput: dd/mm/yyyy
        String dataNova = partesData[2] + "-" + partesData[1] + "-" + partesData[0]; //output: yyyy-mm-dd
        return dataNova;
    }

    public static String converterParaJava(String dataAntiga) {
        String[] partesData = dataAntiga.split("-"); //imput: dd/mm/yyyy
        String dataNova = partesData[2] + "/" + partesData[1] + "/" + partesData[0]; //output: yyyy-mm-dd
        return dataNova;
    }
}
