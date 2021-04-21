///https://github.com/AdriCoQue/Ejercicios_POO.git
package ejercicios_github;

import java.util.Scanner;

public class Ejercicios_GitHub {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, inicial="";
        System.out.println("Ingresa tu nombre completo");
        nombre =sc.nextLine();
        System.out.println("Hola " + nombre);
        String []  iniciales = nombre.split(" ");
        for (String iniciale : iniciales) {
            inicial += iniciale.charAt(0);
        }
        System.out.println("Sus iniciales son: " + inicial.toUpperCase());
    }
    
}
