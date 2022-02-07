
package sistema.gui;

public class Usuario {

    Long id;
    String Nome;
 
    String Email;
    String Celular;
   
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    } 
    public String getNome() { 
        return Nome;
    } 
    public void setCelular(String Celular) { 
        this.Celular = Celular;
    } 
    public String getCelular() { 
        return Celular;
    } 
   

}


