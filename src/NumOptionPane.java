import java.util.Random;
import javax.swing.JOptionPane;
public class NumOptionPane {
	public static void main(String args[]){
		Random rn=new Random();
		int No, sw=0, intento=0, Num;
		No=(int)(rn.nextDouble() * 100);
		while(sw==0){
			intento=intento+1;
			Num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
			if(Num==No){
				sw=1;
			} else if(No>Num){
				JOptionPane.showMessageDialog(null, "Muy pequeño","...", JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(null, "Muy grande","...", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		JOptionPane.showMessageDialog(null, "¡Perfecto! Lo adivinó en " + intento + " intentos", "¡Bravo!", JOptionPane.INFORMATION_MESSAGE);
	}
	

}
