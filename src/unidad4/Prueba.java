package unidad4;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrian Corral
 */
public class Prueba {

    public static void main(String[] args) {
        
        int[] arrow = {3, 1, 2, 5, 4, 7, 9, 8, 6, 10};
        suma(arrow);
    }
    
    public static void suma(int[] arr){
        //Suma de los valores de arreglo arr
        int suma = 0;
        
        for(int i = 0; i<arr.length; i++){
            suma+=arr[i];
        }
        JOptionPane.showMessageDialog(null, "Suma de los valores del arreglo: " + suma, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
