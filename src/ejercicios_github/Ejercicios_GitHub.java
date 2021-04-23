///https://github.com/AdriCoQue/Ejercicios_POO.git
package ejercicios_github;

import javax.swing.JOptionPane;

public class Ejercicios_GitHub {

    public static void main(String[] args) {
        String nombre, inicial="";
        nombre = JOptionPane.showInputDialog("Ingresa tu nombre completo");
        JOptionPane.showMessageDialog(null, "Hola " + nombre, "Hola", JOptionPane.INFORMATION_MESSAGE);
        String []  iniciales = nombre.split(" ");
        for (String iniciale : iniciales) {
            inicial += iniciale.charAt(0);
        }
        JOptionPane.showMessageDialog(null, "Sus iniciales son: " + inicial.toUpperCase(), "Iniciales", JOptionPane.INFORMATION_MESSAGE);
    }
    ///Agregar cambios a ver si le sé
}
