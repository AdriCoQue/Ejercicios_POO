//Ejemplo simple como introducción
package ejemplos;
 // @author Adrian Corral
public class Animal2 {
    //Declaración de variables
     int edad;
     String nombre;
     String anima;
     double estatura;
     double peso;
    //Metodo para saludar
    public void nacer(){
        System.out.println("Hola " + nombre);
    }
     //Metodos get con encaspulacion
    public  String getNombre(){
        return nombre;
    }
    public String getAnimal(){
        return anima;
    }
    public  int getEdad(){
        return edad;
    }
    public double getEstatura(){
        return estatura;
    }
    public  double getPeso(){
        return peso;
    }
    public void sobrepeso(){
        if(peso>=45){
            System.out.println("El animal tiene sobrepeso");
        } else{
            System.out.println("El peso del animal es normal");
        }
    }
     public static void main(String args[]){
         Animal2 animal = new Animal2();
         animal.edad = 10;
         animal.anima = "Tigre";
         animal.nombre = "Alberto";
         animal.peso = 59.8;
         animal.estatura = 1.20;
         animal.nacer();
         System.out.println("Animal: " + animal.getAnimal());
         System.out.println("Nombre: " + animal.getNombre());
         System.out.println("Edad: " + animal.getEdad());
         System.out.println("Estatura: " + animal.getEstatura());
         System.out.println("Peso: " + animal.getPeso());
         animal.sobrepeso();
     }
    }