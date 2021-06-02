package unidad4;

import java.util.ArrayList;

/**
 *
 * @author Adrian Corral
 */
public class BaseDeDatos {
    
    private ArrayList<Elemento>elementos;
    protected String auxStr;
    
    public BaseDeDatos(){
        elementos = new ArrayList<Elemento>();
        elementos.add(elElemento);
    }
    
    //Cadena con todos los elementos
    public String toString(){
        auxStr = "Contenido de la Base de Datos\n";
        auxStr += elementos.toString();
        return auxStr;
    }
    
    
}
