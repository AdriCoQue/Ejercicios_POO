package actividad3;

import javax.swing.JOptionPane;

public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double base, altura, radio;
        String opciones[] = {"Rectangulo", "Circulo", "Salir"};
        
        int opcion = JOptionPane.showOptionDialog(null,"Seleccione una figura para comenzar", "Seleccione una opción",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        
        switch(opcion){
            case 0:
                base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo"));
                altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectangulo"));
                Rectangulo rectangulo = new Rectangulo(base, altura);
                JOptionPane.showMessageDialog(null, "Base: " + rectangulo.getBase() + "\nAltura: " + rectangulo.getAltura() +
                        "\nPerimetro: " + rectangulo.calcularPerimetro() + "\nÁrea: " + rectangulo.calcularArea(), "Datos del rectangulo", JOptionPane.INFORMATION_MESSAGE);
                break;
             
            case 1:
                radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
                Circulo circulo = new Circulo(radio);
                JOptionPane.showMessageDialog(null,"Radio: " + circulo.getRadio() + "\nPerimetro: " + circulo.calcularPerimetro()
                       + "\nÁrea: " + circulo.calcularArea(), "Datos del circulo", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case 2:
                System.exit(0);
                break;
        }
        
    }
    
}
