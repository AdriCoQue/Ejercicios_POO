package ejemplos;
public class Rectangulo {
    private double base;
    private double altura;
    Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public void setAltura(double alt){
        altura = alt;
    }
    public void setBase(double bse){
        base = bse;
    }
    public double getAltura(){
        return altura;
    }
    public double getBase(){
        return base;
    }
    public double area(){
        double area;
        area = (base*altura);
        return area;
    }
    public double perimetro(){
        double perimetro = (2*base)+(2*altura);
        return perimetro;
    } 
}