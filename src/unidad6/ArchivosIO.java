/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Adrian Corral
 */
public class ArchivosIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
          File flie = new File("Test1.txt"); 
          if(flie.createNewFile()){
              System.out.println("Archivo creado: " + flie.getName());
          }else{
              System.out.println("El archivo no existe");
          }
        
            FileWriter writer = new FileWriter(flie);
            String mensaje;
            System.out.println("Escriba el mensaje que quiere escribrir en el archivo");
            Scanner scan = new Scanner(System.in);
            mensaje = scan.nextLine();
            writer.write(mensaje);
            writer.close();
            scan.close();
           
       
           Scanner reader = new Scanner(flie);
           while(reader.hasNextLine()){
               String data = reader.nextLine();
               System.out.println("Mensaje en el archivo: " + data);
           }
           reader.close();
       }catch(FileNotFoundException fne){
           System.err.println("Ha ocurrido un error"); 
       } catch(IOException ioe){
           System.err.println("Ha ocurrido un error"); 
           ioe.printStackTrace();
       }
    }
    
}
