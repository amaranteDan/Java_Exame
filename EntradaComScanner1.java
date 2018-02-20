import java.util.*;

public class EntradaComScanner1{
		
	public static void main (String [] args){
	Scanner sc;
	float nota1, nota2, nota3, media;
	
	try{
		System.out.println("Digite a primeira nota: ");
		sc = new Scanner(System.in);
		nota1 = sc.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		sc = new Scanner(System.in);
		nota2 = sc.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		sc = new Scanner(System.in);
		nota3 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A media e: " + media);
	}catch(NumberFormatException erro){
		System.out.println("Erro na entrada de dados" + erro.toString());
	}
		
	}
	
	
}