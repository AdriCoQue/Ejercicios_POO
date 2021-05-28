package ejemplos;

public class Operaciones {
    
    public Operaciones(){
    }
    
    public void raiz(double x){
        System.out.println("Raíz cuadrada: " + Math.sqrt(x));
    }
    
    public void redondeoArriba(double x){
        System.out.println("Número redondeado: " +Math.ceil(x));
    }
    
    public void redondeoAbajo(double x){
        System.out.println("Número redondeado: " +Math.floor(x));
    }
    
    public void potencia(double x, double y){
        System.out.println(x + " a la " + y + " potencia: " + Math.pow(x,y));
    }
    
}
