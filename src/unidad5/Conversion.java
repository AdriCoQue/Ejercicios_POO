package unidad5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Adrian Corral
 */
public class Conversion {

    public static void main(String[] args) {
       
        double pesos;
        double dolares;
        int opcion;
        String strOpcion;
        InputStreamReader s = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(s);
        
        System.out.println("Escriba el número de la opción:\n"
                + "1. Conversión de Pesos a Dólares\n"
                + "2. Conversión de Dólares a Pesos");
        try{
        strOpcion = stdin.readLine();
        opcion = Integer.parseInt(strOpcion.trim());
        
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la cantidad de pesos que desea convertir");
                pesos = Double.parseDouble(stdin.readLine().trim());
                dolares = pesos/20;
                System.out.println(pesos + " pesos equivalen a " + dolares + " dólares");
                break;
            case 2:
                System.out.println("Ingrese la cantidad de dólares que desea convertir");
                dolares = Double.parseDouble(stdin.readLine().trim());
                pesos = dolares*20;
                System.out.println(dolares + " dólares equivalen a " + pesos + " pesos");
                break;
            default:
                System.out.println("Oppción inválida");
                break;
        }
        }catch(Exception e){
                        System.out.println("Ha ingresado un valor incorrecto");
        }
        
    }
    
}
