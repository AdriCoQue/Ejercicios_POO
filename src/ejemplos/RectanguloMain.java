package ejemplos;
import java.util.Scanner;
public class RectanguloMain {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura;
        System.out.println("Ingrese el valor de la base");
        base = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = sc.nextDouble();
        Rectangulo rectangulo = new Rectangulo(base, altura);
        System.out.println("Base del rectangulo: " + rectangulo.getBase());
        System.out.println("Altura del rectangulo: " + rectangulo.getAltura());
        System.out.println("Perimetro del rectangulo: " + rectangulo.perimetro());
        System.out.println("Area del rectangulo: " + rectangulo.area());
    }
}
