package unidad1;

public class Strings {

    public static void main(String[] args) {
        //Forma 1 de instanciar objetos
        String str1 = new String("En java los Strings son objetos");
        String str2 = new String("Se construyen o instacian de diferentes formas");
        //Forma 2 de instanciar objetos
        String str3 = new String(str2);
  
        System.out.println(str1 + "\n" + str2);
        System.out.println(str3);
    }
    
}
