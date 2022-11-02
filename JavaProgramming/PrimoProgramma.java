
/*  Struttura del codice sorgente in java  */

/****************************************** 

!in un codice sorgente (file con estensione .java) mettiamo una CLASSE!

									Una classe altro non è che un pezzo del tuo programma, 
									o un programma autonomo, come in questo caso.

!in una classe mettiamo i METODI!
									Una classe contiene dati e funzioni. 
									I dati rappresentano la codifica delle informazioni che saranno utilizzate dal programma. 
									Le funzioni raccolgono le istruzioni da fare per PROCESSARE un certo tipo di informazione. 


in un metodo mettiamo le ISTRUZIONI
									Le funzioni raccogliendo una serie di computazioni finalizzate a produrre dei processi, 
									vengono chiamate METODI. Nei metodi vanno le istruzioni (I comandi per eseguire certi calcoli!)

*******************************************/



//classe
public class PrimoProgramma {

	//metodo principale "main"
	public static void main(String[] args){

		//istruzione
		System.out.print("Questo è il mio primo programma!");

	}
}


/* 

Quando la JVM entra in azione guarda alla Classe o alle Classi, organizzate in pacchetti o moduli,
e cerca il metodo Main. 
Una volta trovato il metodo MAIN esegue tutte le istruzioni che trova dentro. 
Un programma java deve avere almeno un metodo Main per potersi avviare. 
ATTENZIONE: non un metodo main per ogni classe, 
ma almeno un metodo MAIN nell'applicazione, da utilizzare come ENTRY POINT.
Eseguire un programma Java significa quindi dire alla Java Virtual Machine: 
"Caricati la classe/i, ed eseguimi tutto quello che trovi nel metodo MAIN"

ESERCIZIO
0) Copia l'istruzione presente nel metodo main e incollane quante ne vuoi nel metodo main.
1) Sostituisci nelle virgolette una frase a tuo piacimento. E salva il file.
2) Compila la classe 
                   ! nella cartella di questo file apri un terminale e digita!: javac <nomefile.java>
3) Nella cartella dove hai compilato la classe comparirà un altro artefatto: il bytecode! con estensione .class
4) Avvia il bytecode
           		   !nel terminale!: java <nomefile>

*/
