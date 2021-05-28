package ejemplos;

import java.util.Scanner;

public class Ejercicio_1 {
    
    public static void main(String[]args){
        // Instanciar objeto para permitir el ingreso de datos al usuario
        Scanner scan = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero");
        //Accesar a valores dentro del objeto
        numero = scan.nextInt();
        System.out.println("Numero ingresado: " + numero);
        System.out.println("Doble del número ingresado: " + (numero*2));
        System.out.println("Trile del número ingresado: " + (numero*3));
        System.out.println("Cuatruple del número ingresado: " + (numero*4));
        System.out.println("Quintuple del número ingresado: " + (numero*5));
        
        //Declaración de variables (Asignando el tipo de dato a manejar, el nombre de esta y un valor)        
        double dblOperador1 = 25.5;
        double dblOperador2 = 15.21;
        double dblOperador3 = 3.0;
        int intOperador4 = 2;
        float fltOperador5 = (float) (20000*intOperador4/dblOperador3);
        
        System.out.println("Valor en formato float: " + fltOperador5);
        System.out.println("Valor en formato double: " + (double)fltOperador5);
        System.out.println("Valor en formato byte: " + (byte)dblOperador3);
        System.out.println("Valor en formato short: " + (short)dblOperador3);
        System.out.println("Valor en formato integer: " + (int)dblOperador3);
        System.out.println("Valor en formato long: " + (long)dblOperador3);
        
        System.out.println("Raíz cuadrada: " + Math.sqrt(dblOperador1));
        System.out.println("Redondear hacia arriba: " + Math.floor(dblOperador2));
        System.out.println("Redondear hacia abajo: " + Math.ceil(dblOperador1));
        System.out.println("Potencia: " + Math.pow(dblOperador1, dblOperador2));
        
        Operaciones operacion =  new Operaciones();
        operacion.raiz(dblOperador1);
        operacion.redondeoAbajo(dblOperador2);
        operacion.redondeoArriba(dblOperador1);
        operacion.potencia(dblOperador1, dblOperador2);
    }  
}
