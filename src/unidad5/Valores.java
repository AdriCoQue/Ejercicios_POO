package unidad5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Adrian Corral
 */
public class Valores {

    public static void main(String[] args) throws IOException {
      
        String line;
        InputStreamReader s = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(s);
        int count = 1;
        int suma = 0;
        
        System.out.println("Introduzca los números un por uno: ");
        
        while(count<=10){
            System.out.println("Número ingresado " + count + ":");
            line = stdin.readLine();
            
            suma+=Integer.parseInt(line.trim());
            count++;
        }
        
        System.out.println("La suma de los números es: " + suma);
        s.close();
        stdin.close();
    }
    
}
