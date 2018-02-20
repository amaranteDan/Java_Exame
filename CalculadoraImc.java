//Calculadora IMC
import javax.swing.*;

public class CalculadoraImc{
	public static void main (String [] args){
		/*Formula para calcular o IMC.
		Imc = peso / (altura * 2)
		*/
		double peso;
		double altura;
		double imc;
		String aux;
		
		try{
			aux = JOptionPane.showInputDialog("Entre com o seu peso:");
			peso = Float.parseFloat(aux);
		
			aux = JOptionPane.showInputDialog("Digite sua altura: ");
			altura = Float.parseFloat(aux);
		
			imc = peso / (altura * 2);
			
			JOptionPane.showMessageDialog(null, "Seu Indice Corporal e de: "+(int)Math.ceil(imc));
			
			if(imc <= 24){
				JOptionPane.showMessageDialog(null,"Voce esta no peso ideal: "+(int)Math.ceil(imc)+ " IMC");
			}else{
				JOptionPane.showMessageDialog(null, "Voce esta acima do peso ideal!: "+(int)Math.ceil(imc)+ " IMC");
			}
			//if (imc > 24 && imc < 29){
				//JOptionPane.showMessageDialog(null, "Voce esta com SobrePeso "+(int)Math.ceil(imc));
			//}else if( imc > 29 && < 34){
				//JOptionPane.showMessageDialog(null, " Voce esta com SobrePeso Moderado"+(int)Math.ceil(imc));
			//}
			
		}catch(NumberFormatException erro){
			JOptionPane.showMessageDialog(null, "Digite apenas numeros!!"+ erro.toString());
		}
		
		
		
	}
}