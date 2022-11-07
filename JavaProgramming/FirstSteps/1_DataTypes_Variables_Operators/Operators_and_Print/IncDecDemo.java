public class IncDecDemo{
	public static void main(String [] args){
		int a = 6;
		int b = a++; 
		System.out.println(b); //6
		a = 6;
		b = ++a; 
		System.out.println(b);//7
		a = 6;
		b = a--; 
		System.out.println(b); //6
		a = 6;
		b = --a; 
		System.out.println(b); //5
	}
}
