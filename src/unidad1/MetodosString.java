package unidad1;

import java.util.Arrays;

public class MetodosString {

    public static void main(String[] args) {
        String str = "Java Desde Cero";
        //String str = new String("Java Desde Cero");
        System.out.println("Cadena original - " + str);
        //Devolver la cantidad de caracteres en la cadena
        System.out.println("String length - " + str.length());
        //Devolver el caracter en el indice i
        System.out.println("Characer at 3rd position - " + str.charAt(2));
        //Devolver la subcadena del caracter i-esimo al final de la cadena
        System.out.println("Substring - " + str.substring(3));
        //Devolver la subcadenadel indice i a j
        System.out.println("Substring - " + str.substring(2, 9));
        //Concatenar String 2 al final de String1
        String str1 = "Java ";
        String str2 = "Desde Cero";
        System.out.println("String Concatenado - " + str1.concat(str2));
        //Devuelve el indice dentro de la cadena de la primera aparicion de la cadena especificada
        System.out.println("Indice de a - " + str.indexOf('a', 3));
        System.out.println("Indice de Cero - " + str.indexOf("Cero"));
        //Comprobar la igualdad de cadenas
        boolean out = "Java".equals("Java");
        System.out.println("Comprobando la igualdad - " + out);
        out = "java".equals("Java");
        System.out.println("Comprobando la igualdad - " + out);
        //El método equalsIgnreCase compara dos cadenas para ver si son iguales
        //Este método ignora las diferencias de máyusculas y minusculas
        out = "java".equalsIgnoreCase("JAVA");
        System.out.println("Comprobar la igualdad de cadenas - " + out);
        //Convertir la cadena a mayúsculas
        System.out.println("En mayúsculas - " + str.toUpperCase());
        //Convertir la cadena a minúsculas
        System.out.println("En minúsculas - " + str.toLowerCase());
        //Remplazar una parte de la cadena 
        System.out.println("Reemplazando palabras - " + str.replace("Cero","el Comienzo"));
        //Reemplazar caracteres
        System.out.println("Reemplazar caracteres - " + str.replace('J', 'Y'));
        //División de la cadena por palabras
        System.out.println("Cadena dividida por palabra - " + Arrays.toString(str.split(" ")));
        //División de la cadena en letras
        System.out.println("Cadena dividida por letra - " + Arrays.toString(str.split("")));
        //Recortar palabras
        System.out.println("Recortar palabra - " + str.trim());
    }
    
}
