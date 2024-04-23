package Main;

import data.Conexao;
import view.TelaInicio;

public class Main {

    public static void main(String[] args) {
     TelaInicio inicio = new TelaInicio();
     inicio.setVisible(true);
     Conexao conexao = new Conexao();
     conexao.conectar();

    }
}
