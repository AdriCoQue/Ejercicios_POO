///Acceder a la información de archivos exixtentes
package unidad6;

import java.io.*;


/**
 *
 * @author Adrian Corral
 */
public class Archivos {

    public static void main(String[] args) {
        
        int c;
        try{
            FileReader in = new FileReader("C:\\Users\\juan pabli\\Desktop\\Pruebas\\Archivo1.txt");
            FileWriter out = new FileWriter("C:\\Users\\juan pabli\\Desktop\\Pruebas\\Archivo2.txt");
            while((c = in.read())!=-1){
            out.write(c);
            }
        in.close();
        out.close();
        }catch(FileNotFoundException e){
            System.err.println("No se encontró el archivo solicitado");
        } catch (IOException ex) {
            System.err.println("Ha ocurrido un error");
        }
        
    }
    
}
