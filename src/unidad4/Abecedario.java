package unidad4;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Abecedario {

    public static void main(String[] args) {
       
        int[] abecedario = new int[27];
        char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                         'ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        String frase = JOptionPane.showInputDialog("Ingrese una frase (Omita los acentos)");
        char caracter;
        
        for(int i =0; i<frase.length(); i++){
            
            caracter = Character.toLowerCase(frase.charAt(i));
            
            switch(caracter){
                case 'a':
                    abecedario[0]++;
                    break;
                    
                case 'b':
                    abecedario[1]++;
                    break;
                    
                case 'c':
                    abecedario[2]++;
                    break;
                    
                case 'd':
                    abecedario[3]++;
                    break;
                    
                case 'e':
                    abecedario[4]++;
                    break;
                    
                case 'f':
                    abecedario[5]++;
                    break;
                    
                case 'g':
                    abecedario[6]++;
                    break;
                    
                case 'h':
                    abecedario[7]++;
                    break;
                    
                case 'i':
                    abecedario[8]++;
                    break;
                    
                case 'j':
                    abecedario[9]++;
                    break;
                    
                case 'k':
                    abecedario[10]++;
                    break;
                    
                case 'l':
                    abecedario[11]++;
                    break;
                    
                case 'm':
                    abecedario[12]++;
                    break;
                    
                case 'n':
                    abecedario[13]++;
                    break;
                    
                case 'ñ':
                    abecedario[14]++;
                    break;
                    
                case 'o':
                    abecedario[15]++;
                    break;
                    
                case 'p':
                    abecedario[16]++;
                    break;
                    
                case 'q':
                    abecedario[17]++;
                    break;
                    
                case 'r':
                    abecedario[18]++;
                    break;
                    
                case 's':
                    abecedario[19]++;
                    break;
                    
                case 't':
                    abecedario[20]++;
                    break;
                    
                case 'u':
                    abecedario[21]++;
                    break;
                    
                case 'v':
                    abecedario[22]++;
                    break;
                    
                case 'w':
                    abecedario[23]++;
                    break;
                    
                case 'x':
                    abecedario[24]++;
                    break;
                    
                case 'y':
                    abecedario[25]++;
                    break;
                    
                case 'z':
                    abecedario[26]++;
                    break;
                    
                default:
                    break;
            }
        }
        JTextArea textArea = new JTextArea("");
        textArea.append("Letra\tVeces\n");       
        textArea.append("------------------------------\n");
        
        for (int i = 0; i<letras.length; i++){
             textArea.append(letras[i] + "\t" + abecedario[i] + "\n");
        }
        
        JOptionPane.showMessageDialog(null, textArea, "Conteo de apariciones de letras", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
