package unidad5;

/**
 *
 * @author Adrian Corral
 */
public class Arreglo {

    public static void main(String[] args) {
        
        int[] array =  new int[20];
        try{
        array[-3] =  24;
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Error: Indice incorrecto");
        }
    }
    
}
