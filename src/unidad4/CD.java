package unidad4;

/**
 *
 * @author Adrian Corral
 */
public class CD extends Elemento{
    
    private String interprete;
    private int noDePistas;
    
    public CD(String leTitulo, String interprete, int noDePistas, int tiempo){
        super(leTitulo, tiempo);
        this.interprete = interprete;
        this.noDePistas = noDePistas;
    }
    
    public String toString(){
        String aux = super.toString();
        aux += "Intérprete (CD): " + interprete;
        aux += ", Número de pistas: " + noDePistas;
        aux += "\n";
        return aux;
    }
            
}
