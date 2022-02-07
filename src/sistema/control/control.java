
package sistema.control;
import sistema.gui.Clientes;
import java.sql.*;
import java.sql.PreparedStatement;
import sistema.conexao.Conexao;
import sistema.gui.Usuario;
public class control {
        private Connection connection;
    Long id;
    String Nome;
    String Email;
    String Celular;
  
   public control(){ 
        this.connection = new Conexao().getConexao();
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(Nome,Email,Celular) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getCelular());
           
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    }
}
