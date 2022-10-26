/** 
Questo programma calcola l'area del cerchio di raggio 20. 
Formula: area = raggio * raggio * PIgreco.
*/

public class ComputaArea {
	public static void main(String[] args){

	//dati

		//dichiarazione: tipo dato + variabile
		                //variabile: riservami della memoria con questo nome
		                // tipo dato: riservami un certo quantitativo di memoria

	double raggio; //dichiaro raggio 
	double area;   //dichiaro area


	//computazioni

	//1) Leggere input (o esterno o assegnato)
			//1.1) memorizzare input -----

	raggio = 20.0; //assegno un valore ad una variabile per mezzo dell'operatore di assegnamento '='

	//2) calcolare l'area
	area = raggio * raggio * 3.1415;

	//3) mandare in stampa il risultato
	System.out.println("L'area del cerchio di raggio " + raggio + " è " + area);

	}

}


/**
 per memorizzare un dato si utilizzano dei simboli chiamati VARIABILI. 
 Una variabili dice al computer "hey, riservami dello spazio in memoria con questo nome" 
 (ricordate l'indirizzo di memoria?)

invece di utilizzare lettere senza significato in programmazione si cerca di utilizzare sempre nomi che descrivano il dato, 
in modo da essere gestiti al meglio da qualunque utente si troverà a gestire il codice. 

La domanda che ci deve venire è "quanta memoria stiamo dicendo al computer di metterci da parte per quel dato?".
E quella che segue "come stabiliamo quanta memoria utilizzare?".
Affinché il compilatore possa svolgere l'operazione di memorizzazione di un dato necessita di sapere quanta memoria deve allocare alla risorsa

Per farlo dobbiamo specificare il TIPO di dato (data type). 
Nel caso specifico avendo a che fare con Numeri Reali, che in informatica vengono chiamati numeri in virgola mobile. 
Java fornisce vari tipi primitivi che rappresentano: Interi, Numeri Reali, Caratteri e Booleani (vero/falso).
Per il nostro caso utilizzeremo un tipo "DOUBLE".
*/