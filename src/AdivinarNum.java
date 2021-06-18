import java.util.Random;
import java.util.Scanner;
public class AdivinarNum {
	public static void main(String args[]){
		Random rn=new Random();
		Scanner in=new Scanner(System.in);
		int No, sw=0, intento=0, Num;
		No=(int)(rn.nextDouble() * 100);
		while(sw==0){
			intento=intento+1;
			System.out.println("Ingrese un número");
			Num=in.nextInt();
			if(Num==No){
				sw=1;
			} else if(No>Num){
				System.out.println("Muy pequeño");
			}
			else{
				System.out.println("Muy grande");
			}
		}
		System.out.println("¡Perfecto! Lo adivinó en " + intento + " intentos");
		in.close();
	}
	

}