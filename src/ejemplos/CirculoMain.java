package ejemplos;

import javax.swing.JOptionPane;

public class CirculoMain {

    public static void main(String[] args) {
        double radio;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo"));
        Circulo circulo =  new Circulo(0);
        circulo.setRadio(radio);
        JOptionPane.showMessageDialog(null, "Radio del circulo: " + circulo.getRadio() + "\n" + 
        "Diametro del circulo: " + circulo.getDiametro() + "\n" + "Perimetro del circulo: " +
        circulo.perimetro() + "\nArea del circulo: " + circulo.area(), "Datos del circulo" , JOptionPane.INFORMATION_MESSAGE);
    }
        
}
