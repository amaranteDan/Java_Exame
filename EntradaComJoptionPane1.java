import javax.swing.JOptionPane;

public class EntradaComJoptionPane1{
	
	public static void main (String [] args){
	String aux;
	float  valor, porcentagem, valor_porcentagem;
	try{
		aux = JOptionPane.showInputDialog("Entre com o valor: ");
		valor = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Entre com a porcentagem: ");
		porcentagem = Float.parseFloat(aux);
		
		valor_porcentagem = valor * (porcentagem / 100);
		
		JOptionPane.showMessageDialog(null, "O valor da porcentagem e: "+ valor_porcentagem);
		
				
	}catch(NumberFormatException erro){
		JOptionPane.showMessageDialog(null, "Entre com apenas numeros: "+ erro.toString());
	}
	}
}