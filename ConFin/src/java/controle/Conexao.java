package controle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static String base = "financeiro";
    private static String servidor = "localhost";
    private static String porta  = ":3306";
    private static String usuario = "root";
    private static String senha = "";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://"+servidor+porta+"/"+base;
    
    public static Connection getConexao(){
        Connection conexao = null;
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
        }
        catch(ClassNotFoundException erro){
            System.out.println("Erro de Driver:" + erro.getMessage());
        }
        catch(SQLException erro){
            System.out.println("Erro de Conexão" + erro.getMessage());
        }
        return conexao;
    }
    
    public static void setFechaConexao(Connection conexao){
        try{
            if(conexao != null){
                conexao.close();
            }
        }
        catch(SQLException erro){
            System.out.println("Erro ao fechar a conexao:" + erro.getMessage());
        }
    }
    
    
    
    
    
}
