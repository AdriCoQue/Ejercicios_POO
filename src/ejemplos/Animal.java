/*
 Ejemplo simple como introducción al encaspulamiento
Se ejecuta desde la clase principal
 */
package ejemplos;

/**
 *
 * @author Adrian Corral
 */
public class Animal {
    //Declaración de variables
    //Ambito private para encapsulacion
    private int edad;
    private String nombre;
    
    //Metodo Contructor
    public Animal(int edadAnimal, String nombreAnimal){
        edad = edadAnimal;
        nombre = nombreAnimal;
    }
    //Metodo para saludar
    public void nacer(){
        System.out.println("Hola");
    }
    /*/Metodos get para mostrar informacion
    public void getNombre(){
        System.out.println(nombre);
    }
    public void getEdad(){
        System.out.println(edad);
    } 
    */
     //Metodos get con encaspulacion
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
  
    }
    
