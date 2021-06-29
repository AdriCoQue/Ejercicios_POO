
package unidad6;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Adrian Corral
 */
public class Operaciones {

    public static void main(String[] args) {
        ///Solo se crea el archivo desde Java
     /*   try{
          File flie = new File("Prueba1.txt"); 
          if(flie.createNewFile()){
              System.out.println("Archivo creado: " + flie.getName());
          }else{
              System.out.println("El archivo no existe");
          }
        }catch(IOException ioe){
            System.err.println("Ha ocurrido un error");
            ///Marca donde se inicia la excepción
            ioe.printStackTrace();
        }*/
        
        ///Escribir sobre el archivo creado previamente desde Java
       /* try{
            FileWriter writer = new FileWriter("Prueba1.txt");
            writer.write("Prueba de escritura sobre archivos en JAVA");
            writer.close();
            System.out.println("Hola soy Adrian Corral Quezada");
            
        }catch(IOException ioe){
            System.err.println("Ha ocurrido un error");
            ioe.printStackTrace();
        }  */
       
       ///Leer archivo creado previamente desde JAVA
       try{
           File flie = new File("Prueba1.txt");
           Scanner reader = new Scanner(flie);
           while(reader.hasNextLine()){
               String data = reader.nextLine();
               System.out.println(data);
           }
           reader.close();
       }catch(FileNotFoundException fne){
           System.err.println("Ha ocurrido un error");
            
       }
       
    }
    
}
