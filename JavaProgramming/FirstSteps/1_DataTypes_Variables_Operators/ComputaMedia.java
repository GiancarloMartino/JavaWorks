import java.util.Scanner;

public class ComputaMedia{
	public static void main(String[] args){
		//prendo in input dei numeri di cui voglio calcolare la media
		Scanner in = new Scanner(System.in);
		

		System.out.println("Questo programma calcola la media di tre numeri da te inseriti.");
	    System.out.println("Inserisci il primo numero: ");
	    double input1 = in.nextDouble();
	    System.out.println("Inserisci il secondo numero: ");
	    double input2 = in.nextDouble();
	    System.out.println("Inserisci il terzo numero: ");
	    double input3 = in.nextDouble();

		//computo la media
		double media = (input1 + input2 + input3 ) / 3;

		//visualizzo il risultato
		System.out.println(media);
	}
}