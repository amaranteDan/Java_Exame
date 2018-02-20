import java.io.*;

public class EntradaComBufferedRead1{
	public static void main (String args []){
		String d;
		float nota1, nota2, nota3, media;
		BufferedReader dado;
		
		try{
			System.out.println("Entre com a primeira nota: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			d = dado.readLine();
			nota1 = Float.parseFloat(d);
			
			System.out.println("Entre com a segunda nota: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			d = dado.readLine();
			nota2 = Float.parseFloat(d);
			
			System.out.println("Entre com a terceira nota: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			d = dado.readLine();
			nota3 = Float.parseFloat(d);
			
			media = (nota1 + nota2 + nota3) / 3;
			
			System.out.println("A media e: "+ media);
			
		}catch(IOException erro){
			System.out.println("Erro na entrada de dados:"+ erro.toString());
		}catch(NumberFormatException erro){
			System.out.println("Digite apenas numeros!!!"+ erro.toString());
		}
	}
} 