
package sistema.gui;
import java.awt.EventQueue; 
import sistema.conexao.Conexao;
public class Projeto_ClientesBD { 
 
     
    public static void main(String[] args) { 
        
      
        EventQueue.invokeLater(new Runnable(){ 
        public void run(){ 
            try{ 
                Clientes frame = new Clientes(); 
                frame.setVisible(true); 
                 
            }catch (Exception e){ 
                e.printStackTrace(); 
            } 
        } 
    } 
        ); 
    
    }
    
    } 
    
    
     

    

