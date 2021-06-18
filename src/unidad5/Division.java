
package unidad5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Adrian Corral
 */
public class Division {

    public static void main(String[] args) {
        
        String str1 = "100";
        String str2 = "0";
        String respuesta = "";
        double num;
        double den;
        double cociente;
        InputStreamReader s = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(s);
        
        
        try{
            System.out.println("Escriba dos números para realizar una división");
            System.out.println("Ingrese el numerador");
            num = Integer.parseInt(stdin.readLine());
            System.out.println("Ingrese el denominador");
            den = Integer.parseInt(stdin.readLine());
            cociente = calcular(str1, str2, num, den);
            DecimalFormatSymbols separador = new DecimalFormatSymbols();
            separador.setDecimalSeparator('.');
            DecimalFormat formato = new DecimalFormat("#.####", separador);
            respuesta = String.valueOf(formato.format(cociente));
        }catch(NumberFormatException nex){
            respuesta = "Se ha introducido un caracter no numérico";
        }catch(ArithmeticException aex){
            respuesta = "Error en la división (divisor = 0)";
        }catch(IntervaloException iex){
            respuesta = iex.getMessage();
        }
        catch(IOException ioe){
            System.out.println("Ocurrió un error inesperado");
        }
        System.out.println("Resultado: " + respuesta);
        
    }
    public static double calcular(String str1, String str2, double num, double den) throws IntervaloException, NumberFormatException, ArithmeticException{
        int limSup = Integer.parseInt(str1);
        int limInf = Integer.parseInt(str2);
        if(den>0){
        if(num<=limSup && num>=limInf && den<=limSup && den>=limInf){
        double resultado = (num/den);
        return resultado;    
        }else{
            throw new IntervaloException("Ingresó un valor fuera del límite permitido");
        }
        } else{
            throw new ArithmeticException();
        }
    }
    
}
