package unidad4;

/**
 *
 * @author Adrian Corral
 */
public class Prestamo implements Autor, Librou, Editorial{
    
    @Override
    public void titulo(){
        System.out.println("Cien años de soledad");
    }
    
    @Override
    public void nombre(){
        System.out.println("Gabriel García Márquez");
    }

    @Override
    public void editorial() {
        System.out.println("Editorial");
    }
    
    
}
