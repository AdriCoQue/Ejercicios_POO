package unidad4;

/**
 *
 * @author Adrian Corral
 */
public class Libro extends Elemento{
    
    private String autor;
    
    public Libro(String leTitulo, int tiempo, String autor) {
        super(leTitulo, tiempo);
        this.autor = autor;
    }
    
    public String toString(){
        String aux = super.toString();
        aux += "Autor: " + autor;
        aux += "\n";
        return aux;
    }
    
    
}
