package unidad5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Adrian Corral
 */
public class Adivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        InputStreamReader s = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(s);
        
        int min = 0;
        int max = 1000;
        int med;
        char resp;
        String linea;
        try{
        System.out.println("***ADIVINA EL NÚMERO***\n");
        System.out.println("Piense un número entre 1 y 1000");
        do{
            med = (min+max)/2;
            System.out.println("Es menor a " + med + "[S/N]");
            linea = stdin.readLine().toUpperCase();
            resp = linea.charAt(0);
            
            if(resp=='S'){
                max = med-1;
            }else{
                min = med;
            }
        } while(max>min);
        System.out.println("El número que usted pensó es " + max);
        
    }catch(Exception e){
        System.out.println("Ha ocurrido un error inesperado");
   }
 }
}
