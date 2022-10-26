import java.util.Scanner;

public class ComputaAreaConInput{

	public static void main(String[] args){

		//creo un oggetto di tipo Scanner dal nome input, per poter richiamare la funzione di lettura.
		Scanner input = new Scanner(System.in);

			//abilitare la possibilità di ricevere input esterni
		System.out.println("Questo programma calcola l'area del cerchio a partire da un tuo inserimento.");
		System.out.println("Per favore, inserisci la lunghezza del raggio del cerchio di cui vuoi conoscere l'area: ");
		double raggio = input.nextDouble();


		//2) calcolare l'area
		double area = raggio * raggio * 3.1415;

		//3) mandare in stampa il risultato
		System.out.println("L'area del cerchio di raggio " + raggio + " è " + area);

	}
}