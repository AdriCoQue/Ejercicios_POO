
package ejemplos;
import java.util.Scanner;
//@author Adrian Corral
public class TrianguloScanner {
    public static void main(String[] args) {
       double lado1, lado2, lado3;
       String mensaje;
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el valor del primer lado de su triangulo");
       lado1 = sc.nextDouble();
       System.out.println("Ingrese el valor del segundo lado de su triangulo");
       lado2 = sc.nextDouble();
       System.out.println("Ingrese el valor del tercer lado de su triangulo");
       lado3 = sc.nextDouble();
       if ((lado1+lado2)>lado3 && (lado2+lado3)>lado1 && (lado1+lado3)>lado2){
       if(lado1==lado2 && lado1==lado3 && lado3==lado2){
           mensaje = "El triangulo formado es esuilatero";
       } else if(lado1==lado2 || lado2==lado3 || lado3==lado1){
           mensaje = "El traiangulo formado es isósceles";
       } else{
           mensaje = "El triangulo formado es escaleno";
       }
       }else{
           mensaje = "Es imposible formar un triangulo con dichas medidas";
       }
       System.out.println(mensaje);
    }
    
}