package unidad4;

/**
 *
 * @author Adrian Corral
 */
public class nDimension {

    public static void main(String[] args) {
        
        int[][] numeros;
        numeros = new int[2][3];
        
        for(int i = 0; i<numeros.length; i++){
            for(int j = 0; j<numeros[i].length; j++){
                numeros[i][j] = 0;
            }
        }
        
        for(int i = 0; i<numeros.length; i++){
            for(int j = 0; j<numeros[i].length; j++){
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
    }
    
}
