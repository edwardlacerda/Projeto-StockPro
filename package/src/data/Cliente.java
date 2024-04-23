package data;



public class Cliente {

 

    private int id;
    private String nome;
    private String data_nascimento;
    private String cpf;

    public Cliente(int id, String nome, String data_nascimento, String cpf) {
        this.id = id;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
    }
    
    public Cliente (){
    
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

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
