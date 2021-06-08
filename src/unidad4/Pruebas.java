package unidad4;

/**
 *
 * @author Adrian Corral
 */
public class Pruebas {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("08/06/2021", "Regular");
        Imprimir imprimir = new Imprimir(cliente);
        imprimir.imprimitObjetoPorImpresora();
        Admin admin = new Admin("Admin1", "F04bkl32.");
        Imprimir print = new Imprimir(admin);
        print.imprimitObjetoPorImpresora();
        
        
    }
    
}
