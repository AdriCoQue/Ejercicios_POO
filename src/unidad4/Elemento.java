package unidad4;
/**
 *
 * @author Adrian Corral
 */
public class Elemento {
    private String titulo;
    private int duracion;
    private boolean loTengo;
    private String comentario;
    
    public Elemento(String leTitulo, int tiempo){
        this.titulo = leTitulo;
        this.duracion = tiempo;
        comentario = "";
        loTengo = false;
    }
    
    public String toString(){
        String aux = titulo + " (" + duracion + " minutos), ";
        if(loTengo){
            aux+= "Disponible, " ;
        }else{
            aux += "No disponible, ";
        }
        aux += comentario;
        return aux;
    }
    
}
