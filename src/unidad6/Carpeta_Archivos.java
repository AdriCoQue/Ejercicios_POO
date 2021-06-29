package unidad6;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 *
 * @author Adrian Corral
 */
public class Carpeta_Archivos {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public static void main(String[] args) {
        ///Carpeta
        String sCarpAct = System.getProperty("user.dir");
        System.out.println("Carpeta del usuario: " + sCarpAct);
        ///Lista de contenido
        System.out.println(ANSI_RED + "---- LISTADO SIMPLE ----" + ANSI_RED);
        File carpeta = new File(sCarpAct);
        String[] listado =carpeta.list();
        if(listado == null || listado.length == 0){
        System.out.println("No hay elementos en la carpeta");
        return;
    }else{
            for(int i = 0; i <listado.length; i++){
                System.out.println(listado[i]);
            }
        }
        
        ///Listado con ojetos file (con propiedades)
        System.out.println(ANSI_RED + "---- LISTADO DE OBJETOS ---" + ANSI_RED);
        File[] archivos = carpeta.listFiles();
        if(archivos==null || archivos.length == 0){
            System.out.println("No hay elementos en la carpeta");
            return;
        }else{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            for(int i = 0; i<archivos.length; i++){
                File archivo = archivos[i];
                System.out.println(String.format("%s(%s) %d %s",archivo.getName(),
                        (archivo.isDirectory()?"Carpeta":"Archivo"),
                        archivo.length(),sdf.format(archivo.lastModified())));
            }
        }
        
    }
    
}
