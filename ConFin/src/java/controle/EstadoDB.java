package controle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Estado;

public class EstadoDB {
    public static ArrayList getEstados(Connection conexao){
        ArrayList lista = new ArrayList();
        try{
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM estado");
            while(rs.next()){
                String sigla = rs.getString("est_sigla");
                String nome = rs.getString("nome");
                Estado estado = new Estado(sigla, nome);
                lista.add(estado);
            }
        }
        catch(SQLException erro){
            System.out.println("Erro ao executar o SQL: " + erro.getMessage());
        }
        catch(Exception erro){
            System.out.println("Erro desconhecido: " + erro.getMessage());
        }
        return lista;
    }
}
