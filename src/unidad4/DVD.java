package unidad4;

/**
 *
 * @author Adrian Corral
 */
public class DVD extends Elemento {
    
   private String director;
    private int anio;
    
    public DVD(String leTitulo, int tiempo, String director, int anio) {
        super(leTitulo, tiempo);
        this.director = director;
        this.anio=anio;
    }
    
    public String toString(){
        String aux = super.toString();
        aux += " (" + anio + "), ";
        aux += "Director: " + director;
        aux += "\n";
        return aux;
    }
    
    
}
