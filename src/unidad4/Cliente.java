package unidad4;

/**
 *
 * @author Adrian Corral
 */
public class Cliente implements Informacion{
    
    private String rut;
    private String nombre;
    
    public Cliente(String rut, String nombre){
        this.rut = rut;
        this.nombre = nombre;
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String imprimir() {
        return this.nombre + " " + this.rut;
    }
    
    
    
}
