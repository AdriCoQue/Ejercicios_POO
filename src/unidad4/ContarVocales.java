package unidad4;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Adrian Corral
 */
public class ContarVocales {
    
    public static void main(String args[]){
        int[] vocales = new int[5];
  
        String frase;
        frase = JOptionPane.showInputDialog("Ingrese una frase");
        
        char caracter;
        
        for(int i =0; i<frase.length(); i++){
            
            caracter = Character.toLowerCase(frase.charAt(i));
            
            switch(caracter){
                case 'a':
                    vocales[0]++;
                    break;
                    
                case 'e':
                    vocales[1]++;
                    break;
                    
                case 'i':
                    vocales[2]++;
                    break;
                    
                case 'o':
                    vocales[3]++;
                    break;
                    
                case 'u':
                    vocales[4]++;
                    break;
                    
                default:
                    break;
            }
        }
        
        JTextArea textArea = new JTextArea("");
        
        textArea.append("Vocal\tVeces\n");
        textArea.append("***************\n");
        textArea.append("a\t" + vocales[0] + "\n");
        textArea.append("e\t" + vocales[1] + "\n");
        textArea.append("i\t" + vocales[2] + "\n");
        textArea.append("o\t" + vocales[3] + "\n");
        textArea.append("u\t" + vocales[4] + "\n");
      
    }
    
}
