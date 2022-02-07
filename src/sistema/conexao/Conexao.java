package sistema.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
   
     public static Connection getConexao() {
         
        try{
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root" , "");
         System.out.println("Conectado ao banco de dados.");
         return connection;
        } catch (SQLException e){
         System.out.println("Erro ao conectar ao banco de dados.");
        }
       return null;
     }
       public static void main(String[] args) {
        Conexao.getConexao();
    }
       }
 
  
  
        



