import java.io.*;

public class EntradaComBufferedRead{
	public static void main (String [] args){
		String s;
		float km, valorKm, valorDes;
		BufferedReader dado;
		
		try{
			System.out.println("Digite o km rodado: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			km = Float.parseFloat(s);
			
			System.out.println("Entre com o valor do Km: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			valorKm = Float.parseFloat(s);
			
			valorDes = km * valorKm;
			System.out.println(" O valor do km rodado e: " + valorDes);
		}catch(IOException erro){
			System.out.println("Houve um erro na entrada de dados"+ erro.toString());
		}catch(NumberFormatException erro){
			System.out.println("Entre apenas com numeros !!"+ erro.toString());
		}
	}
}