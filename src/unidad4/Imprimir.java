package unidad4;

/**
 *
 * @author Adrian Corral
 */
public class Imprimir {
    
    private Informacion info;
    
    public Imprimir(Informacion info){
    this.info = info;
    }
    
    public void imprimitObjetoPorImpresora(){
        System.out.println(this.info.imprimir());
    }
    
    
}
