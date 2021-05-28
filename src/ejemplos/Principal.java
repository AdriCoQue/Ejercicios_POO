/*
Ejemplo para iniciar en el encapsulamiento
 */
package ejemplos;

/**
 *
 * @author Adrian Corral
 */
public class Principal {
    
    public static void main(String[] args) {
        // Declarar un objeto de la clase Animal
        //Asignar el valor de las variables en el constructor
        Animal objeto = new Animal(10, "Alberto");
        //Asignar valores a las variables directamente
        /*
        objeto.edad = 10;
        objeto.nombre = "Alberto";
        */
        //Metodos del objeto
        objeto.nacer();
        System.out.println("Edad: " + objeto.getEdad());
        System.out.println("Nombre: " + objeto.getNombre());
    }

}
