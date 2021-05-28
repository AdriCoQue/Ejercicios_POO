//Clase de ejemplo para evluar el tipo de u triangulo basado en sus lados
package ejemplos;
//Impportamos JOptionPane para ingresar y mostrar resultados de una forma más visual
import javax.swing.JOptionPane;
//@author Adrian Corral
public class TrianguloEjemplo {
    public static void main(String[] args) {
       //Declaración de las variables a utilizar
       double lado1, lado2, lado3;
       String mensaje;
       //Le asignamos el valor a cada variable mediante un cuadro de dialogo
       lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del primer lado de su triangulo"));
       lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del segundo lado de su triangulo"));
       lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del tercer lado de su triangulo"));
       //Evaluamos primero que el triangulo sea posible de construir
       if ((lado1+lado2)>lado3 && (lado2+lado3)>lado1 && (lado1+lado3)>lado2){
       //Evaluamos las medidas de los lados del triangulo para saber de que tipo es
       //En base al tipo del triangulo asignamos el valor al mensaje informando el tipo del triangulo
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
       //Mostramos el mensaje en una ventana
       JOptionPane.showMessageDialog(null, mensaje, "Triangulo Resultante", JOptionPane.INFORMATION_MESSAGE);
    }  
}
