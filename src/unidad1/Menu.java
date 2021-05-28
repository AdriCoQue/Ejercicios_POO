//Hacer uso de una estructura de control do/while
package unidad1;

import java.util.Scanner;

public class Menu {
    
    Scanner sc = new Scanner(System.in);
    int x,y;
    
    public void menu(){
        
        String opc = "";
        
        do{
         System.out.println();
         System.out.print("------Menu Principal-----"
         +"\nA)Ingrese los dos números"
         +"\nB)Sumar los numeros ingresados"
         +"\nC)Restar los numeros ingresados"
         +"\nD)Salir"
         +"\nINGRESE UNA OPCIÓN\n");
         
         opc=sc.nextLine();
         
         switch(opc){
             case "a":
             case "A":
             IngresarDatos();
             break;
          
             case "b":
             case "B":
             Suma();
             break;
             
             case "c":
             case "C":
             Resta();
             break;
             
             case "d":
             case "D":
             System.out.println();
             System.out.println("Gracias por usar la aplicación.\n¡Hasta pronto!");
             break;
             
             default:
             System.out.println("INGRESE UNA OPCIÓN VÁLIDA");
             break;
         }
        }while(!opc.equalsIgnoreCase("D"));
    }
    
    public void IngresarDatos(){
        System.out.println();
        System.out.println("Ingrese el valor del primer número");
        x = sc.nextInt();
        System.out.println("Ingrese el valor del segundo número");
        y = sc.nextInt();
        sc.nextLine();
    }
    public void Suma(){   
    int suma = x+y;
    System.out.println();
    System.out.println("Suma: " + x + " + " + y + " = " + suma);
    }
    public void Resta(){
    int resta = x-y;
    System.out.println();
    System.out.println("Resta: " + x + " - " + y + " = " + resta);
    }
}
