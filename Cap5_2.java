public class Cap5_2{
	public static void main (String [] args){
		byte b1 = 127;
		byte b2 = -128;
		byte b3 = b1 + b2;//error. Types incompatibles.
		
		System.out.println(b3);
	}
}