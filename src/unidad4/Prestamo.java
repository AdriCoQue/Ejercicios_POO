package unidad4;

/**
 *
 * @author Adrian Corral
 */
public class Prestamo implements Autor, Librou{
    
    @Override
    public void titulo(){
        System.out.println("Cien años de soledad");
    }
    
    @Override
    public void nombre(){
        System.out.println("Gabriel García Márquez");
    }
    
    
}
