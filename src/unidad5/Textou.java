package unidad5;

import java.io.IOException;

/**
 *
 * @author Adrian Corral
 */
public class Textou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        int c;
        int contador = 0;
        
        System.out.println("Introduzca su nombre");
        
        while((c = System.in.read())!= '\n'){
            contador++;
            System.out.println((char)c);
        }
        System.out.println();
        System.out.println("Contados son: " + contador + " total de bytes");
    }
    
}
