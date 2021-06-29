///Leer datos de un archivo
package unidad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Adrian Corral
 */
public class Datos_Archivo {

    public static void main(String[] args) {
       
        try{
            
            File flie = new File("Prueba1.txt");
            Scanner reader = new Scanner(flie);
            while(reader.hasNextLine()){
               String data = reader.nextLine();
               System.out.println(data);
            }
            reader.close();
            
        } catch(FileNotFoundException fnfe){
            System.err.println("ERROR no se encontró el archivo");
            fnfe.printStackTrace();
        }
        
        File flie = new File("Prueba1.txt");
        ///Determina si el archivo existe
        if(flie.exists()){
            System.out.println("Nombre del arcvhivo: " + flie.getName());
            System.out.println("Ruta: " + flie.getAbsolutePath());
            System.out.println("Escritura: " + flie.canWrite());
            System.out.println("Lectura: " + flie.canRead());
            System.out.println("Tamaño: " + flie.length());
        } else{
            System.err.print("El archivo solicitado no existe");
        }
        
    }
    
}
