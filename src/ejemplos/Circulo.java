package ejemplos;

public class Circulo {
    private double radio;
    
    Circulo(double rad){
        rad = radio;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public double getDiametro(){
        return (radio*2);
    }
    public double area(){
        double area;
        area = Math.PI*Math.pow(radio,2);
        return area;
    }
    public double perimetro(){
        double perimetro;
        perimetro = Math.PI*(radio*2);
        return perimetro;
    }
    
}
