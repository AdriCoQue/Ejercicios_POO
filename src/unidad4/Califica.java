///Uso de arreglos unidimensionales
///3 operaciones: suma, promedio y mostrar números que cumplan con la media
package unidad4;

import java.util.Scanner;
/**
 *
 * @author Adrian Corral
 */
public class Califica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numAlumn;
        double suma = 0, media;
        
        do{
            System.out.println("Ingrese el número de alumnos");
            numAlumn = sc.nextInt();
            
        }while(numAlumn<=0);
        
        //Crear arreglo de tipo double con longitud igual a numAlumn
        double[] notas = new double[numAlumn];
        
        //Entrada de datxt
        for(int i = 0; i<notas.length; i++){
            System.out.println("Ingrese la nota final del alumno " + (i+1));
            notas[i] = sc.nextDouble();
        }
        
        ///Sumar las notas
        for(int i =0; i<notas.length; i++){
            suma+=notas[i];
        }
        
        ///Calcular el promedio o media
        media = (suma/notas.length);
        
        ///Mostrar la media
        System.out.println("Nota media del curso: " + media);
        
        
        //Mostrar valores superiores a la media
        System.out.println("Listado de notas superiores a la media: ");
        for(int i = 0; i<notas.length; i++){
            if(notas[i]>media){
                System.out.println("Alumno número " + (i+1) + " Nota: " + notas[i]);
            }else{}
        }
    }
    
}
