package unidad4;

/**
 *
 * @author Adrian Corral
 */
public class Admin implements Informacion{
    
    private String password;
    private String user;
    
    public Admin(String user, String password){
        this.user = user;
        this.password = password;
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String imprimir() {
        return "Usuario: " + this.user + " Contrasenia: " + this.password;
    }
    
    
    
}
