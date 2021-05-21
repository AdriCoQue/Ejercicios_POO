package actividad3;

/**
 *
 * @author Adrian Corral
 */
public class Circulo extends Figura{
    
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularPerimetro(){
        return (Math.PI*(radio*2));
    }
    
    @Override
    public double calcularArea(){
        return (Math.PI*(radio*radio));
    }
    
}
