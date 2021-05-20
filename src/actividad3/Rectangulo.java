package actividad3;

/**
 *
 * @author Adrian Corral
 */
public class Rectangulo extends Figura{
    
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularPerimetro(){
        return ((base*2)+(altura*2));
    }
    
    @Override
    public double calcularArea(){
        return (base*altura);
    }
    
}
