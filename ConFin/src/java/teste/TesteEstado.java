package teste;

import controle.Conexao;
import controle.EstadoDB;
import java.sql.Connection;
import java.util.ArrayList;
import modelo.Estado;

public class TesteEstado {
    public static void main(String[] args) {
        Connection conexao = Conexao.getConexao();
        ArrayList<Estado> lista = EstadoDB.getEstados(conexao); //também posso converter a lista em Estado aqui em cima
        for(int i = 0; i < lista.size(); i++){
            //Estado estado = (Estado)lista.get(i); informando o (Estado) para que a lista seja convertida em estado
            Estado estado = lista.get(i);
            System.out.println("Sigla: " + estado.getEst_sigla());
            System.out.println("Nome: " + estado.getNome());
            System.out.println("--------------------");
        }
        Conexao.setFechaConexao(conexao);
    }
}
