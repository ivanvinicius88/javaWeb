package teste;

import controle.Conexao;
import java.sql.Connection;

public class TestaConexao {
    public static void main(String[] args) {
        Connection conexao = Conexao.getConexao(); 
        Conexao.setFechaConexao(conexao);
    }
}
