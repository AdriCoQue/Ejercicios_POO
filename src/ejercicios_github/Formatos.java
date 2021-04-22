/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_github;

/**
 *
 * @author Adrian Corral
 */
public class Formatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cabecera = "\n\tPRÓNOSTICO DEL CLIMA:\n";
        cabecera += "\n\tDía\t\tMañana\tNoche\tCondiciones\n";
        cabecera += "\t---\t\t---\t---\t---\n";
        String pronostico = "\tDomingo\t\t25°C\t33°C\tSoleado\n";
        pronostico += "\tLunes\t\t18°C\t19°C\tNublado\n";
        pronostico += "\tMartes\t\t40°C\t29°C\tCaluroso\n";
        System.out.print(cabecera + pronostico);
    }
    
}
